package Exercise1;

import Exercise1.Triangle;
import java.util.Scanner; 
/**
 *
 * @author carl
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Length = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the first length");
        int L1 = Length.nextInt();
        System.out.println("Enter the second length");
        int L2 = Length.nextInt();
        System.out.println("Enter the third length");
        int L3 = Length.nextInt();
        
        Triangle triangle = new Triangle(L1, L2, L3);
        String result = triangle.Test(triangle.side1, triangle.side2, triangle.side3);
        System.out.println(result);
    }
    

}
