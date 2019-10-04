package chapter18.game;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Client extends Thread {
	private JButton[][] buttons = new JButton[3][3];
	private char me, other;
	private JFrame frame;
	private JPanel panel;
	private JLabel message;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public Client() throws UnknownHostException, IOException {
		
		socket = new Socket("192.168.0.77", 9001);
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream(), true);
		
		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		Font font = new Font("Dialog", Font.ITALIC, 50);
		message = new JLabel("���⿡ �޼����� ǥ�õ˴ϴ�.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(message, BorderLayout.SOUTH);
		frame.setSize(300, 300);
		frame.setVisible(true);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				final int ii=i;
				final int jj=j;
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(font);
				buttons[i][j].addActionListener(e -> {
					buttons[ii][jj].setText(" " + me);
					pw.println("MOVE " + ii + " " + jj);
				});
				panel.add(buttons[i][j]);
			}
		}
		panel.repaint();
	}// ������

	@Override
	public void run() {
		String response;
		try {
			response = br.readLine();
			if(response.startsWith("START")) {
				me = response.charAt(6);
				other = (me=='X')?('O'):('X');
				message.setText("game start");
				frame.setTitle("���� �������� "+me);
			}
				while(true) {
					response=br.readLine();
					if(response.startsWith("OTHER")){
						int i = Integer.parseInt(response.substring(6, 7));
						int j = Integer.parseInt(response.substring(8, 9));
						buttons[i][j].setText("" + other);
						message.setText("������ �ξ����ϴ�. ");
					} else if(response.startsWith("PRINT")) {
						message.setText(response.substring(6));
					}
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {e.printStackTrace();}
				}
			
		} catch (IOException e) {e.printStackTrace();}
		finally {
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {e.printStackTrace();}
		}
		super.run();
	}// end of run

	public static void main(String[] args) throws UnknownHostException, IOException {
		Client clients = new Client();
		clients.start();
	}// end of main

}// end of client
