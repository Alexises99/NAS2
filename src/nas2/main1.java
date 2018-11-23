package nas2;

import java.util.Scanner;

public class main1 {
	
	static Scanner T = new Scanner(System.in);
	
public static void main(String []args) {
	
	
	
	int segundos = 0, minutos = 0, horas = 0;
	String L = "LUNES" , M = "MARTES", MI = "MIERCOLES", J = "JUEVES", V = "VIERNES", S = "SABADO", D = "DOMINGO";

	System.out.print("Introduce un dia entre Lunes y Domingo: ");
	String Dia = T.nextLine().trim().toUpperCase();
	System.out.print("Introduce la hora: ");
	horas = T.nextInt();
	System.out.println("Introduce los minutos: ");
	minutos = T.nextInt();
	System.out.println("Introduce los segundos: ");
	segundos = T.nextInt();
	
	System.out.println("Antes de entrar");
	System.out.println(Dia+"\t"+horas+":"+minutos+":"+segundos);
	System.out.println("Despues de entrar");
	
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
			System.out.println(Dia+"\t"+horas+":"+minutos+":"+segundos);
		}
	}
		
}

