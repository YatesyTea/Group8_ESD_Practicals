/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1_part1;
import java.util.Scanner;
/**
 *
 * @author Yates
 */
public class Driver {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {    
        try {
            // Taking input from the command line.
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input your sides");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            // Initialising Triangle
            Triangle triangle1 = new Triangle(x, y, z);
            // Testing
            String result = triangle1.Test(triangle1.side1, triangle1.side2, triangle1.side3);
            // Printing result
            System.out.println(result);
        }
        catch(Exception e){
                System.out.println("Something went wrong!");
        }
    }

}
