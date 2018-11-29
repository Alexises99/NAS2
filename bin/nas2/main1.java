package NAS2;
/**
 * Programa que realiza una suma de 10 segundos con un dia, hora, minuto y segundo dado.
 * @author Alejandro Sánchez Melero, David Martinez Pastor, Sergio.
 */
import java.util.Scanner;

public class main1 {
    

    static Scanner T = new Scanner(System.in);
    
    
    public static final String L = "LUNES" , M = "MARTES", MI = "MIERCOLES", J = "JUEVES", V = "VIERNES", S = "SABADO", D = "DOMINGO";

/**
 * Metodo main que se encarga de pedir los parametros mencionados anteriormente y de ejecutar los metodos.
 */
public static void main(String []args) {
    
    String Dia;
    int horas,minutos,segundos;
    
    
    System.out.print("Introduce un dia entre Lunes y Domingo: ");
    Dia = T.nextLine().trim().toUpperCase();
    System.out.print("Introduce la hora: ");
    horas = T.nextInt();
    System.out.println("Introduce los minutos: ");
    minutos = T.nextInt();
    System.out.println("Introduce los segundos: ");
    segundos = T.nextInt();
    
    boolean comprobar = comprobar(Dia,horas,minutos,segundos);
    
    if(comprobar == true) {
    sumaSegundos(Dia,horas,minutos,segundos);
    }
    
    else {
        System.out.println("Error");
    }
    
    }
    
    /**
     * El metodo comprobar con los 4 parametros dados devuelve un Boolean que indica si los parametos son correctos o no.
     * @param Dia: un dia entre el Lunes y Domingo.
     * @param Horas: una hora.
     * @param Minutos: unos minutos.
     * @param Segundos: unos segundos.
     */

public static boolean comprobar(String Dia,int horas,int minutos, int segundos) {
    boolean res;
    if(horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
        switch(Dia) {
        case "LUNES":
            res = true;
            break;
        case "MARTES":
            res = true;
            break;
        case "MIERCOLES":
            res = true;
            break;
        case "JUEVES":
            res = true;
            break;
        case "VIERNES":
            res = true;
            break;
        case "SABADO":
            res = true;
            break;
        case "DOMINGO":
            res = true;
            break;
        default:
        res = false;
            
        }
    }
    else {
        res = false;
    }
    
    return res;
}

/**
     * El metodo para aumentar 10 segundos con los 4 parametros dados que lo va incrementado y emplea el metodo toString().
     * @param Dia: un dia entre el Lunes y Domingo.
     * @param Horas: una hora.
     * @param Minutos: unos minutos.
     * @param Segundos: unos segundos.
     */

public static void sumaSegundos(String Dia, int horas, int minutos , int segundos) {
    
    System.out.println("Antes de empezar: "+Dia+ "\t" + horas+":"+minutos+":"+segundos);
    
    for(int i = 0; i<10; i++) {
        if(segundos < 60) {
            segundos++;
            
        }
       if(segundos == 60) {
            segundos = 0;
            minutos++;
            
        }
        if(minutos  == 60) {
            minutos = 0;
            horas++;
        }
        
            if(horas >= 24) {
                horas = 0;
            switch(Dia) {
            case "LUNES" :
                Dia = M;
                break;
            case "MARTES":
                Dia = MI;
                break;
            case "MIERCOLES":
                Dia = J;
                break;
            case "JUEVES":
                Dia = V;
                break;
            case "VIERNES":
                Dia = S;
                break;
            case "SABADO":
                Dia = D;
                break;
            case "DOMINGO":
                Dia = L;
                break;
            }
        }
            
            System.out.println(toString(Dia,horas,minutos,segundos));
    }
}
/**
    * El metodo toString con los 4 parametros dados devuelve un String que en un String s devuelve la hora en su formato Dia   hh:mm:ss.
     * @param Dia: un dia entre el Lunes y Domingo.
     * @param Horas: una hora.
     * @param Minutos: unos minutos.
     * @param Segundos: unos segundos.
     */

public static String toString(String Dia,int horas, int minutos, int segundos) {
    String hh = "0" + horas;
    String mm = "0" + minutos; 
    String ss = "0" + segundos;
    hh = hh.substring(hh.length()-2);
    mm = mm.substring(mm.length()-2);
    ss = ss.substring(ss.length()-2);
    String s = Dia + "\t" + hh + ":" + mm + ":" +ss;
    return s;
}
}