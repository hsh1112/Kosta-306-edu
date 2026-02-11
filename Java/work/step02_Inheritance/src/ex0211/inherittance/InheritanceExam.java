package ex0211.inherittance;

import java.util.List;

class Car {
	public String carname;
	public int cost;

	protected void printAttributes() {
		System.out.println("carname=" + carname + "\tcost=" + cost);
	}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
// 각 클래스에 인수를 받지않는 생성자 작성
// 각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당
class EfSonata extends Car {
	public int i;
	public EfSonata() {
		this.carname = "소나타";
		this.cost = 1000;
	}
	@Override
	protected void printAttributes() {
		System.out.println("소나타 부릉부릉");
	}
}

class Excel extends Car {
	public Excel() {
		this.carname = "엑셀";
		this.cost = 2000;
	}
	
	@Override
	protected void printAttributes() {
		System.out.println("엑셀 부릉부릉");
	}
}

class Carnival extends Car {
	public Carnival() {
		this.carname = "카니발";
		this.cost = 3000;
	}
	@Override
	protected void printAttributes() {
		System.out.println("카니발 부릉부릉");
	}
}

public class InheritanceExam {
	// 메인메소드에서
	public static void main(String[] args) {

		// Car, EfSonata, Excel, Carnival 네개의 객체를 생성
		// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.
		Car car = new Car();
		Car efSonata = new EfSonata();
		Car excel = new Excel();
		Car carnival = new Carnival();

		List<Car> carList = List.of(car, efSonata, excel, carnival);

		for (Car test : carList) {
			System.out.println(test);
			test.printAttributes();
			System.out.println("-----------------");
		}
		
	}
}
