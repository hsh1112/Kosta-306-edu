package ex0203.exam;

import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
	public static int getTotal(int kor, int eng, int math) {
		return kor + eng + math;
	}

	public static double getAvg(int total) {
		return (double) total / 3;
	}

	public static String getRating(double avg) {
		if (avg > 100 || avg < 0)
			return "잘못된 평균 점수입니다";
		if (avg >= 90)
			return "A";
		if (avg >= 80)
			return "B";
		if (avg >= 70)
			return "C";
		if (avg >= 60)
			return "D";
		else
			return "F";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("학생 이름을 입력하세요: ");

		String name = scanner.nextLine();
		System.out.println("이름: " + name);

		Random r = new Random();
		int kor = r.nextInt(101);
		int eng = r.nextInt(101);
		int math = r.nextInt(101);

		int total = getTotal(kor, eng, math);
		double avg = getAvg(total);
		String rating = getRating(avg);

		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f \n", avg);
		System.out.println("학점: " + rating);

		scanner.close();
	}
}
