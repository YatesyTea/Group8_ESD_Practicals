/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracital1_part3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author Yates
 */
public class UI {
    public static void main(String [] args) throws FileNotFoundException{
        File accountList = new File("accountList.csv");
        Scanner sc = new Scanner(accountList);
        // Set delimiter used, and skip first
        sc.useDelimiter(",");
        sc.nextLine();
        int count = 0;
        
        while(sc.hasNext()){
            int id = sc.nextInt();
            double balance = sc.nextDouble();
            String accountName = String.valueOf(id);
            Account accountName1) = new Account(id, balance);
            count++;
        }
    }
}
