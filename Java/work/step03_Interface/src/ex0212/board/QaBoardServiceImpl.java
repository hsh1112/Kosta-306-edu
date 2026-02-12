package ex0212.board;

public class QaBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("qa = " + board);
		System.out.println("QaBoardServiceImpl의 insert call");
		return 1;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("qa = " + board);
		System.out.println("QaBoardServiceImpl의 update call");
		return true;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println("QaBoardServiceImpl의 selectByNo call");
		return new QaBoard(10,"연습중","이름","집가고싶다",false);
	}

}
