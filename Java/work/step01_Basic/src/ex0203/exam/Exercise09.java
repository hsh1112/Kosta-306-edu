package ex0203.exam;

import java.util.Scanner;

public class Exercise09 {

	public static void message() {
		System.out.println("----------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------");
		System.out.print("선택: ");
	}

	public static int deposit(int balance, int inputBalance) {
		int result = balance + inputBalance;
		return result;
	}

	public static int withdraw(int balance, int inputBalance) {
		int result = balance - inputBalance;
		return result;
	}

	public static void main(String[] args) {
		int choice;
		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		do {
			message();
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("입금할 금액을 입력하세요: ");
				int inputBalance = scanner.nextInt();
				if(inputBalance <= 0) {
					System.out.println("입금액은 0보다 커야 합니다.");
					break;
				}
				balance = deposit(balance, inputBalance);
				System.out.println("입금한 금액: " + inputBalance);
				System.out.println("잔액: " + balance);
			}
				break;
			case 2: {
				System.out.println("출금할 금액을 입력하세요: ");
				int inputBalance = scanner.nextInt();
				if(inputBalance <= 0) {
					System.out.println("출금액은 0보다 커야 합니다.");
					break;
				}
				if(balance < inputBalance) {
					System.out.println("출금액은 잔액보다 클 수 없습니다.");
					System.out.println("잔액: " + balance);
					System.out.println("입력한 금액: " + inputBalance);
					break;
				}
				balance = withdraw(balance, inputBalance);
				System.out.println("출금한 금액: " + inputBalance);
				System.out.println("잔액: " + balance);
			}
				break;
			case 3:
				System.out.println("현재 잔액: " + balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다. \n");
				break;
			}
		} while (choice != 4);

		scanner.close();
	}
}
