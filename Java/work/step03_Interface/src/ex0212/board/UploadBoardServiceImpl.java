package ex0212.board;

public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("free = " + board);
		System.out.println(super.getClass().getSimpleName() + "insert call");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("free = " + board);
		System.out.println(super.getClass().getSimpleName() + "update call");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println(super.getClass().getSimpleName() + "selectByNo call");
		return new UploadBoard(30, "자료실연습", "삼순", "파일이욤", "a.jpg");
	}
}
