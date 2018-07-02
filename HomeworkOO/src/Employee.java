
public abstract class Employee {
	String name;
	String sex;
	String onBoardDate;
	String tel;
	String addres;
	
	public Employee(String name, String sex, String onBoardDate, String tel, String addres){
		this.name = name;
		this.sex = sex;
		this.onBoardDate = onBoardDate;
		this.tel = tel;
		this.addres = addres;		
	}
	
	public abstract double overPay();
}
