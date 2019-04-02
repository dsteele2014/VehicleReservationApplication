package application;

public class Details 
{
	String a;
	String b;
	String pLoc;
	String rLoc;
	Integer days;
	
	public Details(String a, String b, String pLoc, String rLoc, int days)
	{
		this.a=a;
		this.b=b;
		this.pLoc=pLoc;
		this.rLoc=rLoc;
		this.days=days;
	}
	
	
	public Integer getDays() {
		return days;
	}


	public void setPrice(Integer days) {
		this.days = days;
	}


	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	public String getpLoc() {
		return pLoc;
	}

	public void setpLoc(String pLoc) {
		this.pLoc = pLoc;
	}

	public String getrLoc() {
		return rLoc;
	}

	public void setrLoc(String rLoc) {
		this.rLoc = rLoc;
	}
	
	
}
