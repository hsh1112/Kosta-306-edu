package ex0204.exam;

import java.text.DecimalFormat;

public class ScoreUtils {
	
	private int getTotal(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	private double getAvg(int total, int subject) {
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		String avgStr = decimalFormat.format((double)total/subject);
		return Double.parseDouble(avgStr);
	}
	
	private String getGrade(double avg) {
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
	
	public String getMessage(String name, int kor, int eng, int math ) {
		int total = this.getTotal(kor, eng, math);
		double avg = this.getAvg(total, 3);
		String grade = this.getGrade(avg);
		
		String message =
				"이름: " + name + "\n" +
				"총점: " + total + "\n" + 
				"평균: " + avg + "\n" + 
				"학점: " + grade;
		
		return message;
	}
	
}
