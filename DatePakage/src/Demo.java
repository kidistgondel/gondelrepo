import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getMonth()+1);

		System.out.println(date.getYear()+1900);
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		
	}

}
