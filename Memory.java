
public class Memory {
	private int size;
	
	public Memory (int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}
	
	@Override
	public String toString() {
		return String.format("%dGB", this.size);
	}
}
