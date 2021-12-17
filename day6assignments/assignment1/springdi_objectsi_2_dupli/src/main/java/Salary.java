
public class Salary {
	public float basicpay;
	public	float hra;
	public Salary() {System.out.println("Salary def cons");}  
	public Salary(float basicpay, float hra) {
		super();
		this.basicpay=basicpay;
		this.hra=hra;
	}
	public float getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(float basicpay) {
		this.basicpay = basicpay;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	
	public String toString(){  
	    return "Basicpay:: "+basicpay+"Hra::  "+hra;  
	}  
}
