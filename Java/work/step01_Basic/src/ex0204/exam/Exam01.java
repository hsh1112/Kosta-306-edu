package ex0204.exam;

import java.util.Scanner;

public class Exam01 {
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void generateReport() {
		System.out.print("학생 이름을 입력하세요: ");
		String name = SCANNER .nextLine();
		System.out.print("국어 점수를 입력하세요:");
		int kor = SCANNER .nextInt();
		while(kor > 100 || kor < 0) { 
			System.out.println("점수는 0-100 사이로 입력하세요");
			System.out.print("국어 점수를 입력하세요: ");
			kor = SCANNER.nextInt();
		}
		System.out.print("영어 점수를 입력하세요: ");
		int eng = SCANNER .nextInt();
		while(eng > 100 || eng < 0) { 
			System.out.println("점수는 0-100 사이로 입력하세요");
			System.out.print("영어 점수를 입력하세요: ");
			eng= SCANNER .nextInt();
		}
		System.out.print("수학 점수를 입력하세요:");
		int math = SCANNER .nextInt();
		while(math > 100 || math < 0) { 
			System.out.println("점수는 0-100 사이로 입력하세요");
			System.out.print("수학 점수를 입력하세요: ");
			math = SCANNER .nextInt();
		}
		ScoreUtils scoreUtils = new ScoreUtils();
		String message = scoreUtils.getMessage(name, kor, eng, math);
		System.out.println(message);
		SCANNER .nextLine();
	}
	
	public static void main(String[] args) {
		String choice;

		do {
			System.out.println("1번: 성적 입력 || 2번: 종료");
			choice = SCANNER .nextLine();
			switch (choice) {
			case "1":
				generateReport();
				break;
			case "2":
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("1과 2만 입력이 가능합니다.");
			}
		} while (!choice.equals("2"));

		SCANNER .close();
	}
}
