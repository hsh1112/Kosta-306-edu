package ex0213;

public class ExceptionExam {
	
	public static void main(String[] args) {
		System.out.println("***********메인 시작************");
		System.out.println("args = " + args);
		try {
			for(String arg : args) {
				System.out.println(arg);
			}
			int convertNo = Integer.parseInt(args[0]);
			System.out.println("변환 값 = " + convertNo);
			int result = 100 / convertNo;
			System.out.println("나눈 결과 = " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외가 발생했을 때 해야 하는 일
			System.out.println("매개변수 전달 plz " + e.toString());
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력해주세요 => " + e.getMessage());
		} catch (Exception e) {
			// 이외의 모든 예외는 여기서 처리한다
			System.out.println("예외가 발생");

			// 개발자가 개발할 때 예외에 대한 정보를 추적(디버깅) 할 때 사용한다.
			// 반드시 배포(production환경)에서는 제거해야한다
			e.printStackTrace(); // 예외정보를 detail하게 stack에서 꺼내서 출력해준다.
		}
		System.out.println("***********메인 끝************");
	}
	
}
