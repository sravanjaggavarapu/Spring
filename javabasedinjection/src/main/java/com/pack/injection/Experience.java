package com.pack.injection;

public class Experience {
	private int years;
	private int months;
	public Experience(int years, int months) {
		super();
		this.years = years;
		this.months = months;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	@Override
	public String toString() {
		return "Experience [years=" + years + ", months=" + months + "]";
	}

}
