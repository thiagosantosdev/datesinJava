package controfin.api.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasJava {

	public static void main(String[] args) throws ParseException {

		Date datadodia = new Date();
		
		System.out.println("Data em milisegundos: " +datadodia.getTime());

		System.out.println("Dia do mês: " +datadodia.getDate());
		System.out.println("Dia da semana: " +datadodia.getDay());
		System.out.println("Hora do dia: " +datadodia.getHours());
		System.out.println("Minuto da hora: " +datadodia.getMinutes());
		System.out.println("Segundos: " +datadodia.getSeconds());
		System.out.println("Ano: " + (datadodia.getYear() + 1900));

		SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrão e String: " +dataformatada.format(datadodia));
		
        dataformatada = new SimpleDateFormat("yyyy/MM/dd HH:mm.ss");
		
		System.out.println("Data atual em formato para banco de dados: " +dataformatada.format(datadodia));

		dataformatada = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data de nascimento: " + dataformatada.parse("10/11/1990"));

	}

}
