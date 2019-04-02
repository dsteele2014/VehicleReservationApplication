package application;

public class Customer 
{
	public String firstName;
	public String lastName;
	public String phone;
	public String email;
	public String dln;
	public String age;
	
	public Customer(String firstName, String lastName, String phone,String email,String dln,String age)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.phone=phone;
		this.email=email;
		this.dln=dln;
		this.age=age;
	}

	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDln() {
		return dln;
	}

	public void setDln(String dln) {
		this.dln = dln;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}
