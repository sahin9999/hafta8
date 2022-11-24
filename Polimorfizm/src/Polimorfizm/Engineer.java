package Polimorfizm;

public class Engineer extends Employee{
	
	Engineer(String name,String surname){
		super(name,surname);
		setJob("Muhendis");
		setAnnualPermit(30);
		setSalary(12500);
	}	
	
	Engineer(String name,String surname,int salary){
		super(name,surname);
		setSalary(salary);
		if(salary>12500) {
			setJob("Yuksek muhendis");
			setAnnualPermit(35);
		}
		else if(salary>15000) {
			setJob("Kıdemli Yuksek Muhendis");
			setAnnualPermit(40);
		}
		else {
			setJob("Muhendis");
			setAnnualPermit(30);
		}
	}
	
	public int makeRaise(double howMuch) {
		double money=(double)(getSalary()*howMuch)+2500;
		makeRaise((int)money);
		return getSalary();
	}
	
	
}
