import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class Computer {
	
	private CPU cpu;
	private Map<Integer, Memory> memoryMap;
	private List<Storage> storageList;
	private PSU psu;
	
	public Computer() {
		this.memoryMap = new TreeMap<>();
		storageList = new ArrayList<>();
	}
	
	public void replaceCPU(CPU cpu) {
		this.cpu = cpu;
	}
	
	public void replaceMemory(int slot, Memory memory) {
		this.memoryMap.put(slot, memory);
	}	
	
	public void addStorage(Storage storage) {
		this.storageList.add(storage);
	}
	
	public void replacePSU (PSU psu) {
		this.psu = psu;
	}
	
	public String getSpec() {
		StringBuilder sb = new StringBuilder(); 
		
		sb.append(this.cpu).append('\n');
		sb.append("===").append('\n');
		
		int totalMemorySize = 0;
		for (Map.Entry<Integer, Memory> entry : this.memoryMap.entrySet())
			totalMemorySize += entry.getValue().getSize();
		sb.append(String.format("Memory: %dGB", totalMemorySize)).append('\n');
		for (Map.Entry<Integer, Memory> entry : this.memoryMap.entrySet())
			sb.append(String.format("Slot %d: %dGB", entry.getKey(), entry.getValue().getSize())).append('\n');
		sb.append("===").append('\n');
		
		int totalStorageSize = 0;
		for (Storage storage : this.storageList)
			totalStorageSize += storage.getCapacity();
		sb.append(String.format("Storage: %dGB", totalStorageSize)).append('\n');
		for (Storage storage : this.storageList)
			sb.append(storage).append('\n');
		sb.append("===").append('\n');
		
		sb.append(this.psu).append('\n');
		
		return sb.toString();
	}
	
}
