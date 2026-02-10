package ex0203.제어문;

import java.util.List;

public class SwitchExam01 {

	public static void showMessage(int month, int lastDay) {
		String message = (lastDay != 0) ? month + "월은 " + lastDay + "일 까지 있습니다." : month + "월은 잘못된 월 입니다.";
		System.out.println(message);
	}

	public static void main(String[] args) {
		// 1~12 사이의 난수를 발생
		double nansu = (Math.random() * 12 + 1);
		System.out.println("난수 = " + nansu);

		int month = (int) nansu;
//		month = 111;
		System.out.println("월 = " + month + "월\n");

		// 그 난수는 월이라고 생각하고 월에 해당하는 마지막 일 수를 출력?

		List<Integer> monthList1 = List.of(1, 3, 5, 7, 8, 10, 12);
		List<Integer> monthList2 = List.of(4, 6, 9, 11);

		int lastDay;

		if (monthList1.contains(month)) {
			lastDay = 31;
		} else if (monthList2.contains(month)) {
			lastDay = 30;
		} else if (month == 2) {
			lastDay = 28;
		} else {
			lastDay = 0;
		}

		showMessage(month, lastDay);

		System.out.println("-------------------------------------------------");

		lastDay = switch (month) {

		case 1, 3, 5, 7, 8, 10, 12 -> 31;

		case 4, 6, 9, 11 -> 30;

		case 2 -> 28;

		default -> 0;

		};

		showMessage(month, lastDay);

	}

}
