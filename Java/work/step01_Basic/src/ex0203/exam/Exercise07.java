package ex0203.exam;

import java.util.Random;

public class Exercise07 {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int r1;
		int r2;
		int sum;
		int pass = 5;
		
		do {
			r1 = r.nextInt(0,6);
			r2 = r.nextInt(0,6);
			sum = r1 + r2;
			System.out.println("r1: " + r1);
			System.out.println("r2: " + r2);
			System.out.println("합: " + sum);
		} while(sum != pass); 
		
	}
}
