
package enterprise;

import java.io.DataInputStream;
import java.io.IOException;


public class Enterprise {

   
    public static void main(String[] args) throws IOException {
        DataInputStream userInput = new DataInputStream(System.in);

        System.out.println("Enter FIRST Triange Side Length - ");

        int side1;
        side1 = Integer.parseInt(userInput.readLine());

        System.out.println("Enter SECOND Triangle Side Length - ");

        int side2;
        side2 = Integer.parseInt(userInput.readLine());

        System.out.println("Enter Third Triangle Side Length - ");

        int side3;
        side3 = Integer.parseInt(userInput.readLine());

        Triangle userTriangle = new Triangle(side1, side2, side3);

        System.out.println("Scalene: " + userTriangle.is_Scalene());
        System.out.println("Isosceles: " + userTriangle.is_Isosceles());
        System.out.println("Equilateral: " + userTriangle.is_Equilateral());

    }

}
