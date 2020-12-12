package by.htp.applience.entity.device;

import by.htp.applience.entity.Applience;

public class Speakers extends Applience{
	
	private int powerConsumption;
	private int numberOfSpeakers;
	private int frequencyRange;
	private int cordLenght;
	private boolean condition;
	
	public Speakers(String type, int price, int powerConsumption, int numberOfSpeakers,
			int frequencyRange, int cordLenght) {
		super(type, price);
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLenght = cordLenght;
	}
	
	@Override
	public void switchOn() {
		this.condition = true;
	}

	@Override
	public void switchOff() {
		this.condition = false;
	}
	
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	
	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public int getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(int frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public int getCordLenght() {
		return cordLenght;
	}

	public void setCordLenght(int cordLenght) {
		this.cordLenght = cordLenght;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (condition ? 1231 : 1237);
		result = prime * result + cordLenght;
		result = prime * result + frequencyRange;
		result = prime * result + numberOfSpeakers;
		result = prime * result + powerConsumption;
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
		Speakers other = (Speakers) obj;
		if (condition != other.condition)
			return false;
		if (cordLenght != other.cordLenght)
			return false;
		if (frequencyRange != other.frequencyRange)
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLenght=" + cordLenght + ", condition=" + condition
				+ "]";
	}

}
