package ex0212.test.exam;

public class Tv extends Elec implements ElecFunction{
	
	private int channel;
	
	@Override
	public void start() {
		System.out.println(getCode() + "제품 TV를 " + this.channel + "을 " + "본다"  );
	}

	@Override
	public void stop() {
	}
	
	@Override
	public void display() {
	}
	
	public Tv() {}
	
	public Tv(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Tv [channel=");
		builder.append(channel);
		builder.append("]");
		return builder.toString();
	}
	
}
