package controfin.api.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasJava2 {
	
	public static void main(String[] args) throws ParseException{
		
		Calendar calendar = Calendar.getInstance();
		
		//Date date = new Date();
		
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Calendar dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Calendar dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Calendar hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Calendar minuto da hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Calendar segundos: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Calendar ano: " + calendar.get(Calendar.YEAR));
		
		SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Calendar data atual em formato padrão e String: "+ dataformatada.format(calendar.getTime()));

		






		
	}
	
	


}


