package pl.edu.ur.oopl10;
import java.util.Random;
/**
 *
 * @author mchla
 */


public class Main {

    public static void main(String[] args) {
        
        System.out.println("ZAD 4\n");
        
        Random generator = new Random();
        
        int ilosc = 0;
        
        while(ilosc<3){
            int a = generator.nextInt(21)-10;
            int b = generator.nextInt(21)-10;
            try{ 
                double w=a/b;
                System.out.println(a+" / "+b+" = "+w);
                
            }
            catch(ArithmeticException e){
                System.out.println("proba dzielenia przez 0");
                ilosc++;
            }
            
        }
        
        System.out.println("ZAD 5\n");
        
        WprowadzZKonsoli elo = new WprowadzZKonsoli();
        elo.wprowadzInt();
        elo.wprowadzString();
        
    }
    
}
