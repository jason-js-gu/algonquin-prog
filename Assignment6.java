// for github
package assignment;

public class Assignment6 {
	public static void main(String[] args) {
		System.out.println("Question 1 --------");
		Vehicle Car = new Vehicle(5,4);
		Car.description("Car");
		
		Vehicle Motorcycle = new Vehicle(2,2);
		Motorcycle.description("Motorcycle");
		
		System.out.println("\nQuestion 2 --------");
		LeapYear y1 = new LeapYear(1900);
		y1.displayResult(y1.isLeapYear());
		
		LeapYear y2 = new LeapYear(2000);
		y2.displayResult(y2.isLeapYear());
		
		LeapYear y3 = new LeapYear(2008);
		y3.displayResult(y3.isLeapYear());
		
		System.out.println("\nQuestion 3 --------");		
		Factorial f1 = new Factorial(4);
		System.out.printf("Factorial of %s is %s.\n", f1.getNum(), f1.calFactorial());
	}	
}

//Question 1
class Vehicle {
	private int no_of_seats;
	private int no_of_wheels;
	//constructor
	Vehicle(int nseats, int nwheels){
		this.no_of_seats=nseats;
		this.no_of_wheels=nwheels;
	}
	//display the description of an instance
	void description(String name) {
		System.out.printf("%s has %s seats and %s wheels.\n",name,this.no_of_seats,no_of_wheels);		
	}
	
}


//Question 2
class LeapYear{
	private int year;
	//constructor
	LeapYear(int year){
		this.year=year;
	}
	//verify if a year is a leap year
	boolean isLeapYear() {
		if(this.year % 400 == 0 || (this.year % 4 ==0 && this.year % 100 != 0))
			return true;
		return false;
	}
	//display the result
	void displayResult(boolean r) {
		if(r)
			System.out.printf("Year %s is a leap year.\n", this.year);
		else
			System.out.printf("Year %s is not a leap year.\n", this.year);
	}
}


//Question 3
class Factorial{
	private int num;
	//constructor
	Factorial(int num){
		this.num=num;
	}
	//getter
	int getNum() {
		return this.num;
	}
	//calculation
	int calFactorial() {
		int i = 1;
		int f = 1;
		while(i <= this.num) {
			f *= i;
			i++;
		}			
		return f;
	}
}




