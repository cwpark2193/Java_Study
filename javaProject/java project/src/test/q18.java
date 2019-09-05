package test;

import java.util.Scanner;

public class q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ctemp; 
        double ftemp; 
        Scanner input = new Scanner(System.in);
    	System.out.print("È­¾¾¿Âµµ: "); // ÀÔ·Â ¾È³» Ãâ·Â
    	ftemp = input.nextDouble();
    	ctemp = (5.0/9.0)*(ftemp-32.0);
        System.out.println("¼·¾¾¿Âµµ: " + ctemp);
	}

}
