import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // create a scanner 

        Scanner input = new Scanner(System.in);

        // ask for the inputs 

        System.out.println("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();

        double gratuityRate = input.nextDouble();

        // compute the gratuity and the total 

        double gratuity = subtotal * (gratuityRate / 100);

        double total = subtotal + gratuity;

        // display results 

        System.out.println(" The gratuity s $ " + gratuity + " and total is $ " + total);




    }
}
