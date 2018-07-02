
public class FirstMag extends SecMag {
	private double traffic;

	public FirstMag(String name, String sex, String onBoardDate, String tel, String addres, 
			double salary, double overHour, double lunch, double jobAdd, double traffic)
	{
		super(name, sex, onBoardDate, tel, addres, salary, overHour, lunch, jobAdd);
		this.traffic = traffic;

	}
	
	public double overPay () {
		return super.overPay() + traffic;
	}
	
}
