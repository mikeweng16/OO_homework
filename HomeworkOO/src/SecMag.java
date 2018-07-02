
public class SecMag extends GenEmployee {
	private double lunch;
	private double jobAdd;
	
	public SecMag(String name, String sex, String onBoardDate, String tel, String addres, double salary, 
				double overHour, double lunch, double jobAdd){
			super(name, sex, onBoardDate, tel, addres, salary, overHour);
			this.lunch = lunch;
			this.jobAdd = jobAdd;
		}		
	public double getLunch() {
		return lunch;
	}
	public void setLunch(double lunch) {
		this.lunch = lunch;
	}
	public double getJobAdd() {
		return jobAdd;
	}
	public void setJobAdd(double jobAdd) {
		this.jobAdd = jobAdd;
	}

	public double overPay () {
			return super.overPay() + lunch + jobAdd;
		}
		
	

}
