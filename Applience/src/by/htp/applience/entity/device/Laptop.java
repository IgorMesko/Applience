package by.htp.applience.entity.device;

import by.htp.applience.entity.Applience;

public class Laptop extends Applience{
	
	private int batteryCapacity;
	private String OC;
	private int memoryROM;
	private int systemMemory;
	private int CPU;
	private int dispalyInchs;
	private boolean condition;
	
	public Laptop(String type, int price, int batteryCapacity, String OC, int memoryROM,
			int systemMemory, int CPU, int dispalyInchs) {
		super(type, price);
		this.batteryCapacity = batteryCapacity;
		this.OC = OC;
		this.memoryROM = memoryROM;
		this.systemMemory = systemMemory;
		this.CPU = CPU;
		this.dispalyInchs = dispalyInchs;
	}
	
	@Override
	public void switchOn() {
		this.condition = true;
	}

	@Override
	public void switchOff() {
		this.condition = false;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOC() {
		return OC;
	}

	public void setOC(String oC) {
		OC = oC;
	}

	public int getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public int getCPU() {
		return CPU;
	}

	public void setCPU(int cPU) {
		CPU = cPU;
	}

	public int getDispalyInchs() {
		return dispalyInchs;
	}

	public void setDispalyInchs(int dispalyInchs) {
		this.dispalyInchs = dispalyInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + CPU;
		result = prime * result + ((OC == null) ? 0 : OC.hashCode());
		result = prime * result + batteryCapacity;
		result = prime * result + (condition ? 1231 : 1237);
		result = prime * result + dispalyInchs;
		result = prime * result + memoryROM;
		result = prime * result + systemMemory;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (CPU != other.CPU)
			return false;
		if (OC == null) {
			if (other.OC != null)
				return false;
		} else if (!OC.equals(other.OC))
			return false;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (condition != other.condition)
			return false;
		if (dispalyInchs != other.dispalyInchs)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", OC=" + OC + ", memoryROM=" + memoryROM
				+ ", systemMemory=" + systemMemory + ", CPU=" + CPU + ", dispalyInchs=" + dispalyInchs + ", condition="
				+ condition + "]";
	}

}
