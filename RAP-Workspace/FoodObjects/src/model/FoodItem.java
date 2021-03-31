package model;

public class FoodItem extends Object{
	protected String name= "Food item";
	//accessible in any subclass regardless of the package
	protected double cost; 
	
	//Constructors
	public FoodItem() {
	}

	public FoodItem(String name) {
		//super();
		this.name = name;
	}
	
	//Getters and Setters
	//A
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void printStuff() {
		System.out.println("FUNNN!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItem other = (FoodItem) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
