package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Exemplo {

	public static void main(String[] args) throws ParseException {

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date data = Date.from(Instant.parse("2019-10-22T22:03:00Z"));
	
	System.out.println(formato.format(data));
	
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(data);
	cal.add(Calendar.DAY_OF_WEEK, 1);
	data = cal.getTime();
	System.out.println(formato.format(data));
		
		
	
		
	}
}
