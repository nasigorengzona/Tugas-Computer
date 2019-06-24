
public class HDD extends Storage {
	public HDD (int capacity) {
		super(capacity);
	}
	
	public int getCapacity () {
		return super.getCapacity();
	}
	
	@Override
	public String toString() {
		return String.format("HDD: %dGB", this.getCapacity());
	}
}
