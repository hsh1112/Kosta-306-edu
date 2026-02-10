package ex0204.exam;

public class Exam02 {
	public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
        System.out.println("**************************");

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
        System.out.println("**************************");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("★");
            }
            System.out.println();
        }
        System.out.println("**************************");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < size - i; k++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }
}
