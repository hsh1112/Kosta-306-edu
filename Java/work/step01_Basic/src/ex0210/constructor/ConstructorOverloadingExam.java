package ex0210.constructor;

class Puppy3{
	/*String 타입 전역 변수 선언
	  int 타입 전역 변수 선언*/
		private String name;
		private int age;
	
	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
	public Puppy3() {
		this.name = "메리";
		System.out.println("public Puppy3() 호출되었습니다.");
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
	
	public Puppy3(String name) {
		this.name = name;
		System.out.println("pulic Puppy3() 호출되었습니다.");
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/		
		
	public Puppy3(String str1, String str2) {
		this(str1+str2);
		System.out.println("pulic Puppy3() 호출되었습니다.");
	}
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/					
	
	public Puppy3(boolean b) {
		this(b+"쫑");
		System.out.println("pulic Puppy3() 호출되었습니다.");
	}
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/			
	public Puppy3(char c) {
		this();
		this.age = c;
		System.out.println("public Puppy3() 호출되었습니다.");
		System.out.println(this.age);
	}
	
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
		public void printMemberVariable() {
			System.out.println("String : " + this.name + "\nint :" + this.age);
		}

	
}

public class ConstructorOverloadingExam {
	// 메인메소드에서
	public static void main(String[] args) {
		// Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
		Puppy3 puppy1 = new Puppy3();
		Puppy3 puppy2 = new Puppy3("이름");
		Puppy3 puppy3 = new Puppy3("이름1", "이름2");
		Puppy3 puppy4 = new Puppy3(false);
		Puppy3 puppy5 = new Puppy3('A');
		// 각 객체의 printMemberVariable메소드를 한번씩 호출\
		
		Puppy3[] puppyArr = new Puppy3[]{puppy1, puppy2, puppy3, puppy4, puppy5};
		for(Puppy3 puppy : puppyArr) {
			System.out.println("--------------------------");
			puppy.printMemberVariable();
		}

	}
}