package ex0209.array.goods;
/*
 * 2026-02-10
 * 한상혁
 * 싱글톤 패턴 및 생성자 오버로딩을 사용하여 단일책임 원칙으로 상품관리 프로그램 리팩토링
 */
public class  StartView{
	public static void main(String[] args) {
//		GoodsService t1 = GoodsService.getInstance();
//		GoodsService t2 = GoodsService.getInstance();
//		System.out.println(t1 + "\n" + t2);
		
		System.out.println("***** 프로그램 시작합니다. ********************");

       MenuView mv  = new MenuView();//전역변수 초기화
	   mv.printMenu();
	}
}