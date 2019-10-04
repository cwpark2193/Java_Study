package chapter18.game;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException  {
		ServerSocket ss = new ServerSocket(9001);
		System.out.println("game sever open.");
		try {
			while(true) {
				Game game = new Game();
				Socket socket = ss.accept();
				Player player1 = new Player(socket, game, 'X');
				Socket socket1 = ss.accept();
				Player player2 = new Player(socket1, game, 'O');
				player1.start();
				player2.start();
				
				player1.setOther(player2);
				player2.setOther(player1);
				
				System.out.println("경기 시작.");
			}
		} catch (IOException e) {}
		finally {try {ss.close();} catch (IOException e) {e.printStackTrace();}}
	}//end of main
	
	static class Game{
		private char[][] board = new char[3][3];
		
		public synchronized char getBoards(int i,int j) {
			return board[i][j];
		}
		public synchronized void setBoards(int i,int j,char playermark) {
			board[i][j] = playermark;
		}
		public void printBorad() {
			for(int k=0;k<3;k++) {
				System.out.println("  "+board[k][0]+"|  "+board[k][1]+"|  "+board[k][2]);
				if(k!=2) {System.out.println("---|---|---");}
			}
		}
	}//end of game
	
	static class Player extends Thread{
		private Socket socket;
		private Game game;
		private Player other;
		private BufferedReader br;
		private PrintWriter pw;
		private char playerMark;
		public Player(Socket socket, Game game,char playerMark) {
			super();
			this.socket = socket;
			this.game = game;
			this.playerMark = playerMark;
			try {
				this.br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				this.pw=new PrintWriter(socket.getOutputStream(),true);
				pw.println("START "+playerMark);
				pw.println("PRINT 다른 경기자를 기다리고 있습니다.");
			} catch (IOException e) {e.printStackTrace();}
			
		}
		@Override
		public void run() {
			pw.println("PRINT 모든 경기자가 연결되었습니다.");
			if(playerMark=='X') {
				pw.println("PRINT 당신 차례입니다.");
			}
			try {
				while(true) {
					String command=br.readLine();
					if(command.startsWith("MOVE")) {
						int i = Integer.parseInt(command.substring(5, 6));
						int j = Integer.parseInt(command.substring(7, 8));
						game.setBoards(i, j, playerMark);
						game.printBorad();
						other.pw.println("OTHER "+i+" "+j);
						pw.println("PRINT 기다리세요.");
						other.pw.println("PRINT 당신 차례입니다.");
						
					}else if(command.startsWith("QUIT")){
						break;
					}
				}
			} catch (IOException e) {e.printStackTrace();}
			finally {
				try {
					socket.close();
					pw.close();
					br.close();
				} catch (IOException e) {e.printStackTrace();}
			}
			super.run();
		}
		public void setOther(Player other){
			this.other=other;
		}
	}//end of player
}
