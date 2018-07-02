
public class GenEmployee extends Employee{
	private double salary;
	private double overHour;
	
	public GenEmployee(String name, String sex, String onBoardDate, 
			String tel, String addres, double salary, double overHour)
	{
		super(name, sex, onBoardDate, tel, addres);
		this.salary = salary;
		this.overHour = overHour;
	}		
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getOverHour() {
		return overHour;
	}
	public void setOverHour(double overHour) {
		this.overHour = overHour;
	}
	public double overPay () {
		salary += Math.round(salary*1.5*overHour/240);
		return salary;
	}
	
}
