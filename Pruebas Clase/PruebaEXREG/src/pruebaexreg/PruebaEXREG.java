/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class PruebaEXREG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mes();
    }
    public static void anio(){
        boolean ok=false;
        String anio;
        while(!ok){
            try{
                anio=JOptionPane.showInputDialog(null, "aaa");
                if(validar(anio,"^19[9]{1}[0-9]{1}|(20[019]{1}[0-9]{1})$")==false)
                    throw new NullPointerException();
            }catch(NullPointerException e){
                System.out.println("Petose");
            }
        }
    }
    public static void mes(){
        boolean ok=false;
        String mes;
        while (ok==false){  
            try{
            mes=JOptionPane.showInputDialog(null, "Introduce el mes de nacimiento"); 
            if(mes.isEmpty()||validar(mes,"^[1-9]{1}|[1-9]{1}[0-2]{1}$")==false)
                throw new NullPointerException();                        
            }catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    public static boolean validar(String dato,String regex){
        Pattern pat = Pattern.compile(regex);
        Matcher m = pat.matcher(dato);
        return m.matches();
    }
}
