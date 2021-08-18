package controfin.api.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2020-02-01"), LocalDate.now());  //total de dias de uma data até hoje
	
		System.out.println("Possui " + dias + " dias entre a faixa de data.");
		
	}
	
}
