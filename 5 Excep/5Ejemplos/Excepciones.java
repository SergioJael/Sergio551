
package excepciones;
import javax.swing.JOptionPane;
public class Excepciones {

    public static void main(String[] args) {
     int x,y;
     try {
       x=Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero","Solicitar datos",3));

     }catch (NumberFormatException n){
         System.out.println((n.getMessage()+ "introduce solo numeros"));
    }
    }
}
