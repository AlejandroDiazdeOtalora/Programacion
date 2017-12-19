/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.fechas;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author 1gdaw04
 */
public class PruebaFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date fechahoy, fecha2=null;
        Calendar calendario=GregorianCalendar.getInstance();
        fechahoy=calendario.getTime();
        System.out.println(fechahoy);
                
        try{
            String CadenaFecha="9/1/2017";
            SimpleDateFormat regex=new SimpleDateFormat("dd/mm/yyyy");
            fecha2 = regex.parse(CadenaFecha);
            System.out.println(fecha2);
        }catch(ParseException e){
            System.out.println("Peto");
        }
        
        Calendar calendario1 = GregorianCalendar.getInstance();
        calendario1.setLenient(true);
        calendario1.set(2016, 9, 22);
        System.out.println(calendario1.getTime());
        
        if(fecha2.compareTo(fechahoy)>0){
            System.out.println("");
        }
        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate fechanac=LocalDate.parse("22/10/1998", fmt);
        LocalDate ahora=LocalDate.now();
        
        Period periodo=Period.between(fechanac, ahora);
        System.out.println("Tu edad es: "+periodo.getYears()+" años\n"+periodo.getMonths()+" meses\n"+periodo.getDays()+" dias");
    }
    
}
