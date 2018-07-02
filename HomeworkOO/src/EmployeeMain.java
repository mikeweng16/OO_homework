
public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] e = new Employee[6];
		e[0] = new GenEmployee("Joe", "男", "2018/1/1", "111", "AAA", 23000, 0);
		e[1] = new GenEmployee("John", "男", "2018/2/1", "222", "BBB", 23000, 30);
		e[2] = new FirstMag("Mary", "女", "2018/3/1", "333", "CCC", 45000, 0,1800, 2000, 5000);
		e[3] = new FirstMag("Jean", "女", "2018/4/1", "444", "DDD", 45000, 10, 1800, 2000, 5000);
		e[4] = new SecMag("Ken", "男", "2018/5/1", "555", "EEE", 60000, 0, 1800, 3000);
		e[5] = new SecMag("Joey", "女", "2018/6/1", "666", "FFF", 65000, 20, 1800, 3000);
		for (int i = 0; i< e.length; i++) {
			System.out.println(e[i].overPay());
		}
	}

}
