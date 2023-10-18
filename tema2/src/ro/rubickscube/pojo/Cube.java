package ro.rubickscube.pojo;

public class Cube {

	private int manufactured;
	private String brand;
	private double weight;
	private int sides;

	public Cube() {

	}

	public Cube(String brand, Double weight, int sides) {
		super();
		this.brand = brand;
		this.weight = weight;
		this.sides = sides;
	}

	public Cube(int manufactured, String brand, Double weight, int sides) {
		super();
		this.manufactured = manufactured;
		this.brand = brand;
		this.weight = weight;
		this.sides = sides;
	}

	public int getManufactured() {
		return manufactured;
	}

	public void setManufactured(int manufactured) {
		this.manufactured = manufactured;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

}