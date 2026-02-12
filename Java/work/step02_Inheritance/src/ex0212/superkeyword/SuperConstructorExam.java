package ex0212.superkeyword;

class Parent{
//	Parent(){
//		System.out.println(1);
//	}
	Parent(int i){
		System.out.println(2);
	}
	Parent(String s){
		System.out.println(3);
	}
}

class Child extends Parent{ // Child는 Parent, Object이다
	Child(){
		this(100);
		System.out.println(4);
	}
	Child(int i){
		super(i);
		System.out.println(5);
	}
	Child(String s){
		super("안녕");
		System.out.println(6);
	}
}

/*
자식 생성자 구현부 첫줄에 super()가 생략이 되어있는데 만약 
기본생성자가 생성이 안되어있다면 컴파일 에러가 남(다른 오버로딩된 생성자만 존재)
그렇다면 자식 생성자 첫줄에 super(args)로 지정해주거나 this(arg or null)로 super생성자 호출 유예를 해야함
*/
public class SuperConstructorExam {
	public static void main(String[] args) {
//		new Child(); // 1 4 
//		new Child(10); // 1 5 오버로딩된 부모 생성자를 직접 호출하면 2 5
//		new Child(""); // 1 6
		// 모든 자식생성자 구현부 첫번째 줄에 super()생략
		
		// 만약, 부모 생성자 하나도 없다면
		new Child();
		new Child(10);
		new Child("");

		new Child();
	}
}
