package ex0212.superkeyword;

class Animal {
	int age = 5;
	String bodyColor;

	public void sound() {
		System.out.println("super의 sound call...");
	}

	public void eat() {
		System.out.println("super의 eat call...");
	}
}

class Cat extends Animal { // Cat is a Animal 성립
	int age = 10;
	int weight;

	@Override
	public void sound() {
		System.out.println("Cat의 sound call...");
	}

	public void run() {
		System.out.println("Cat의 run call...");
	}

	public void test() {
		System.out.println("****필드 test***");
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println("---------------");
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		System.out.println("---------------");
		System.out.println(weight);
		System.out.println(this.weight);
//		System.out.println(super.weight);
		System.out.println("****메소드***");
		sound();
		this.sound();
		super.sound();
		System.out.println("---------------");
	}
}

public class SuperFieldMethodExam {
	public static void main(String[] args) {
//		new Cat().test();

		System.out.println("--외부에서 객체 생성해서 접근");
		Cat cat = new Cat();
//		System.out.println(cat.age);
//		System.out.println(cat.bodyColor);
//		System.out.println(cat.weight);

		cat.sound();
		cat.eat();
		cat.run();
		System.out.println("cat = " + cat);

		System.out.println("=============================");
		Animal an = new Cat(); // 다형성, Animal부분만 접근가능
		System.out.println(an.age);
		System.out.println(an.bodyColor);
//		System.out.println(an.weight); // 부모타입으로 자식부분 접근불가
		an.sound(); // 재정의 된 메소드는 부모타입으로 접근해도 재정의된 메소드 호출
		an.eat();
//		an.run(); // 안됨 부모타입 변수로 담았으니까

		System.out.println("an = " + an);

		// an으로 접근 할 수 없는 자식부분을 접근 하기위해
		// ObjectDownCasting이 필요함.

		if (an instanceof Cat) {
			System.out.println("--------형변환 시작------");
			Cat c = (Cat) an; // 부모 > 자식
			System.out.println("--------형변환 끝------");
			System.out.println("cat = " + cat);
			System.out.println(c.weight);
			c.run();
		}

		Animal a = new Animal();
		if (a instanceof Cat) {
			Cat cc = (Cat) a; // 실행도중에 ClassCastingException 발생
			System.out.println(cc);
		}

		Animal an2 = cat;
		System.out.println("cat = " + cat);
		System.out.println("an2 = " + an2);
	}
}
