package ex2011.enum_test;

public class EnumExam {
	public static void main(String[] args) {
		Grade grade = Grade.BASIC;
		switch(grade) {
		case BASIC : System.out.println("일반"); break;
		case SILVER : System.out.println("silver"); break;
		case GOLD : System.out.println("gold"); break;
		}
	}
}
