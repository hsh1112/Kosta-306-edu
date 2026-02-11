package ex2011.enum_test;

public enum Grade {
	BASIC(0,"일반"),
	SILVER(1,"우수"),
	GOLD(2,"최우수");
	
	private final int level;
	private final String message;
	
	Grade(int level, String message){
		this.level = level;
		this.message = message;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public String getMessage() {
		return this.message;
	}
}
