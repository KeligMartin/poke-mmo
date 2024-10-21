package org.example;

public abstract class Road {

	private String name;

	private String cityFrom;

	private String cityTo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public Road(String name, String cityFrom, String cityTo) {
		this.name = name;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
	}

	public void enter() {
	}
}
