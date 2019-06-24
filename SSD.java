
public class SSD extends Storage {
	public SSD (int capacity) {
		super(capacity);
	}
	
	public int getCapacity () {
		return super.getCapacity();
	}
	
	@Override
	public String toString() {
		return String.format("SSD: %dGB", this.getCapacity());
	}
}
