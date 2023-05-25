package prueba;
//version 2 if-else if
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero");
        num=sc.nextInt();
        if(num %3==0 && num %5==0)
            System.out.println("TRIFIV");
        else if(num%3==0)
            System.out.println("TRI");
        else if(num%5==0)
            System.out.println("FIV");
    }
    
}
