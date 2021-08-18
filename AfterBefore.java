package controfin.api.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfterBefore {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtualhoje = simpleDateFormat.parse("11/04/2021");
		
		// After : se data 1 é maior que data 2
		// Before : se data 1 é menor que data 2
		
		
		/*if(dataVencimentoBoleto.after(dataAtualhoje)) {  //Posterior ou maior ou depois da data atual
			
			System.out.println("Boleto não vencido! :-)");
			
		}else {
			
			System.out.println("Boleto vencido - Urgente!");
		}*/
		
if(dataVencimentoBoleto.before(dataAtualhoje)) {  //Anterior ou menor ou antes da data atual /Se a data 1 é menor que a data 2
			
			System.out.println("Boleto vencido - Urgente!");
			
		}else {
			
			System.out.println("Boleto não vencido! :-)");
		}
	}

}
