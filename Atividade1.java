import java.util.*;
import static java.lang.Math.*;
import java.util.Scanner;
import java.util.Locale;

public class Atividade1 {
    public static void main (String[] args) {
    	
    	
    	Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    	System.out.println("Informe o valor de a: ");
    	double a = Double.parseDouble(entrada.next());
    	System.out.println("Informe o valor de b: ");
    	double b = Double.parseDouble(entrada.next());
    	System.out.println("Informe o valor de c: ");
    	double c = Double.parseDouble(entrada.next());
    	
    	double delta = ((Math.pow(b,2))-(4*a*c));
    	System.out.println ("O valor de delta e " + delta);
    	
    	if (delta >= 0 && a != 0) {
    		
        double x1 = (((-(b))+(sqrt(delta)))/(2*a));
        System.out.println ("O valor de x1 e " + x1);
    	double x2 = (((-(b))-(sqrt(delta)))/(2*a));
        System.out.println ("O valor de x2 e " + x2);
    	
    	
    	} else {
            System.out.println("Impossivel calcular");
            System.exit(0);
        }	
}
}
