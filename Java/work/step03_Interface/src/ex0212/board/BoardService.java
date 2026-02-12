package ex0212.board;

import java.util.List;

public interface BoardService {
	/**
	 * 등록
	 * @param : Board
	 * @return : int (if 0 = fail, 1 <= success)
	 */
	int insert(Board board);
	
	/**
	 * 수정
	 * @param : Board
	 * @return : boolean
	 */
	boolean update(Board board);
	
	/**
	 * 검색
	 * @param : int
	 * @return : Board
	 */
	Board selectByNo(int no);
	/* java 1.8 version 이후 추가
	 *  : interface 안에 있는 메소드에 static or default 제한자를 추가하면
	 *    body있는 메소드를 만들수 있다.
	 *    body가 있는 메소드는 구현객체들이 재정의 선택적으로 할수 있다.
	 *    
	 *    1) static
	 *         : 구현객체없이 바로 interface이름.메소드이름() 호출
	 *
	 *    2) default
	 *         : 반드시 구현 객체가 있어야 호출할수 있다 .
	 */
	
	/**
	 * 삭제 기능
	 */
	default int delete(int no) {
		System.out.println("------삭제 기능입니다----------");
		return 3;
	}
	
	/**
	 * 전체 검색
	 */
	static List<Board> selectAll(){
		System.out.println("전체 검색입니다.");
		return null;
	}
}
