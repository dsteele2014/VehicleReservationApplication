package application;


public class Vehicle 
{
	String type;
	String make;
	String model;
	String capacity;
	String mpg;
	String trans;
	String avail = "AVAILABLE";
	
	public Vehicle(String type, String make, String model, String capacity, String mpg, String trans)
	{
		this.type=type;
		this.make=make;
		this.model=model;
		this.capacity=capacity;
		this.mpg=mpg;
		this.trans=trans;
	}
	
	
	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getMpg() {
		return mpg;
	}

	public void setMpg(String mpg) {
		this.mpg = mpg;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public String getAvail() {
		return avail;
	}

	public void setAvail(String avail) {
		this.avail = avail;
	}



	
}
