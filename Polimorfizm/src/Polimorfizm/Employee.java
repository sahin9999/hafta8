package Polimorfizm;

public class Employee {
	
	protected String ayrac = "-----------\n";
	protected String name,surname,job;
	protected int salary,annualPermit;
	
	protected Employee(String name,String surname) {
		this.name=name;
		this.surname=surname;
		this.job="Calisan";
		this.salary=5500;
		this.annualPermit=10;
	}
	
	protected Employee(String name,String surname,int salary) {
		
		this.name=name;
		this.surname=surname;
		this.salary=salary;
		this.annualPermit=10;
		if(salary>6000) {
			this.job="Kidemli calisan";
			annualPermit+=3;
		}
		else if(salary<0&&salary>=6000) {
			this.job="Calisan";
		}
		else {
			this.job="Stajyer";
		}
		
	}
	
	protected Employee() {
		
	}
	
    public int makeRaise(int howMuch) {
    	salary +=howMuch;
		return salary;
	}
	
	public int makeRaise(double howMuch) {
		double money = (double)salary*howMuch;
		makeRaise((int)money);
		return salary;
	}

	protected String getJob() {
		return job;
	}

	protected void setJob(String job) {
		this.job = job;
	}

	protected int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

	protected int getAnnualPermit() {
		return annualPermit;
	}

	protected void setAnnualPermit(int annualPermit) {
		this.annualPermit = annualPermit;
	}
	
	public void info() {
		System.out.println(getJob()+"Bilgileri\n"+ayrac+"Calisan ismi:"+name+"\nCalisan soyismi:"+surname+"\nGorevi:"+getJob()+"\nMaasi:"+getSalary()+"\nIzin gunu:"+getAnnualPermit()+"\nIs gunu"+ayrac);

	}
	public void raiseInfo() {
		System.out.println(getJob()+"Zam uygulmasi \n"+ayrac+"\n Yeni verilecek maas:"+getSalary()+"\n"+ayrac);
	}
	
	
}
