
package Practical1;

import java.util.Scanner;
public class Histagram {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[101];

        System.out.println("Enter numbers between 1 and 100 (-0 to see results): ");
        int num = scan.nextInt();

        int b10 = 0;

        while (num != -0) {
            nums[num]++;
            num = scan.nextInt();
        }

        for (int count = 1; count <= 100; count += 10) {

            System.out.print(count + " - " + (b10 += 10) + "  | ");

            for (int index = count; index <= b10; index++) {

                while (nums[index] > 0) {
                    System.out.print("");
                    nums[index]--;
                }
            }
            System.out.println();
        }
    }

}
