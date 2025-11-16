package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(d));
		
		

	}

}
