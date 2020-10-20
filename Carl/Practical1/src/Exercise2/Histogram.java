/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import java.io.*;
import java.util.Scanner;




/**
 *
 * @author carl
 */
public class Histogram {
    
    public static void main(String[] args) throws FileNotFoundException {
            File file = new File("grades.txt");
            Scanner scan = new Scanner(file);
            
            int numGradeBoundaries = 10;
            int gradesList[] = new int[numGradeBoundaries];
            for(int j=0; j<numGradeBoundaries; j++){
                gradesList[j] = 0;
            }
            
            int currentInt, newInt;
            for (int i = 0; i < 100; i++) {
                currentInt = scan.nextInt();
                newInt = (int) Math.ceil((double)currentInt/ 10);
                gradesList[newInt - 1] += 1;
            }
            
            System.out.print("--- Grades Histogram ---");
            for(int m = 0; m < numGradeBoundaries; m++){
                System.out.print("\n");
                System.out.print(m+1 + " - " + (m+1)*10 + " |  \t");
                for (int j = 0; j < gradesList[m]; j++){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
            }
    }
