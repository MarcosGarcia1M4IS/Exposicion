package masaCorporal;
import java.util.Scanner;


public class corporalmain {
public static void main (String args []) {
Scanner teclado = new Scanner(System.in);
float peso, estat;

System.out.println("Ingrese su nombre");
String nombre = teclado.next();

System.out.println("Ingrese su peso corporal");
peso = teclado.nextFloat();

System.out.println("Ingrese su estatura");
estat = teclado.nextFloat();

corporal op = new corporal (nombre, peso, estat); 

op.Imprimir();
	
teclado.close();
	}
}
