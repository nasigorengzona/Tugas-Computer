
public class PSU {
	private int power;
	
	public PSU (int power) {
		this.power = power;
	}
	
	public int getPSU () {
		return this.power;
	}
	
	@Override
	public String toString() {
		return String.format("PSU: %dwatt", this.power);
	}
}
