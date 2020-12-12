package by.htp.applience.entity.device;

import by.htp.applience.entity.Applience;

public class TabletPC extends Applience{
	
	private int batteryCapacity;
	private int dispalyInchs;
	private int memoryROM;
	private int flashMemoryCapacity;
	private String color;
	private boolean condition;
	
	public TabletPC(String type, int price, int batteryCapacity, int dispalyInchs,
			int memoryROM, int flashMemoryCapacity, String color) {
		super(type, price);
		this.batteryCapacity = batteryCapacity;
		this.dispalyInchs = dispalyInchs;
		this.memoryROM = memoryROM;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
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

	public int getDispalyInchs() {
		return dispalyInchs;
	}

	public void setDispalyInchs(int dispalyInchs) {
		this.dispalyInchs = dispalyInchs;
	}

	public int getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (condition ? 1231 : 1237);
		result = prime * result + dispalyInchs;
		result = prime * result + flashMemoryCapacity;
		result = prime * result + memoryROM;
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
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (condition != other.condition)
			return false;
		if (dispalyInchs != other.dispalyInchs)
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", dispalyInchs=" + dispalyInchs + ", memoryROM="
				+ memoryROM + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + ", condition="
				+ condition + "]";
	}
	
}
