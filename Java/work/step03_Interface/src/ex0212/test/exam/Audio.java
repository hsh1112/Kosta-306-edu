package ex0212.test.exam;

public class Audio extends Elec implements ElecFunction{
	
	private int volumn;

	@Override
	public void start() {
		System.out.println(getCode() + "의 Audio를 " + this.volumn + "으로 듣는다"  );
	}
	
	@Override
	public void display() {
	}
	
	@Override
	public void stop() {
	}
	
	public Audio() {};
	
	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Audio [volumn=");
		builder.append(volumn);
		builder.append("]");
		return builder.toString();
	}
	
}
