package by.htp.applience.entity.device;

import by.htp.applience.entity.Applience;

public class Refrigerator extends Applience{
	
	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private int overallCapacity;
	private int height;
	private int width;
	private boolean condition;
	
	public Refrigerator(String name, int price, int powerConsumption, int weight, int freezerCapacity,
			int overallCapacity, int height, int width) {
		super(name, price);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void switchOn() {
		this.condition = true;
	}

	@Override
	public void switchOff() {
		this.condition = false;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (condition ? 1231 : 1237);
		result = prime * result + freezerCapacity;
		result = prime * result + height;
		result = prime * result + overallCapacity;
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		result = prime * result + width;
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
		Refrigerator other = (Refrigerator) obj;
		if (condition != other.condition)
			return false;
		if (freezerCapacity != other.freezerCapacity)
			return false;
		if (height != other.height)
			return false;
		if (overallCapacity != other.overallCapacity)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ ", condition=" + condition + "]";
	}

}
