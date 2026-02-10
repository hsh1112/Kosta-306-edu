package ex0205.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {

	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static int checkStudentCount() {
		int studentCount = -1;

		while (true)
			try {
				System.out.print("학생수>");
				String input = SCANNER.nextLine();
				studentCount = Integer.parseInt(input);
				if (studentCount < 0) {
					System.err.println("학생 수는 음수 일 수 없습니다.");
				} else
					break;
			} catch (NumberFormatException e) {
				System.err.println("숫자만 입력할 수 있습니다.");
			}

		return studentCount;
	}

	public static int checkScore(int i) {
		int score = -1;

		while (true)
			try {
				System.out.print("scores[" + i + "]>");
				String input = SCANNER.nextLine();
				score = Integer.parseInt(input);
				if (score < 0 || score > 100) {
					System.err.println("점수는 0 ~ 100사이만 입력할 수 있습니다.");
				} else
					break;
			} catch (NumberFormatException e) {
				System.err.println("숫자만 입력할 수 있습니다.");
			}

		return score;
	}

	public static void startProcess() {
		System.out.println("---------------------------------");
		System.out.println("1.학생수");
		int studentCount = checkStudentCount();

		System.out.println("---------------------------------");
		System.out.println("2.점수");
		int[] scores = new int[studentCount];
		for (int i = 0; i < scores.length; i++) {
			int score = checkScore(i);
			scores[i] = score;
		}

		System.out.println("---------------------------------");
		System.out.println("3.점수리스트");
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]" + ": " + scores[i]);
		}

		System.out.println("---------------------------------");
		System.out.println("4.분석");
		Map<String, Object> scoreInfo = gradeCalculate(scores);
		int highestScore = (int) scoreInfo.get("highestScore");
		System.out.println("최고 점수: " + highestScore);
		double avg = (double) scoreInfo.get("avg");
		System.out.printf("평균 점수: %.1f\n", avg);

		System.out.println("---------------------------------");
		System.out.println("5.종료");
		System.out.println("프로그램 종료");
		System.out.println("---------------------------------");
	}

	public static Map<String, Object> gradeCalculate(int[] scores) {

		Map<String, Object> scoreInfo = new HashMap<>();
		
		if (scores == null || scores.length == 0) {
	        scoreInfo.put("highestScore", 0);
	        scoreInfo.put("avg", 0.0);
	        return scoreInfo;
	    }

		int highestScore = scores[0];
		int sum = 0;

		for (int score : scores) {
			highestScore = Math.max(highestScore, score);
			sum += score;
		}

		
		double avg = sum / (double) scores.length;

		scoreInfo.put("highestScore", highestScore);
		scoreInfo.put("avg", avg);

		return scoreInfo;
	}

	public static void main(String[] args) {
		try {
	        startProcess();
	    } finally {
	        SCANNER.close(); 
	    }

	}
}
