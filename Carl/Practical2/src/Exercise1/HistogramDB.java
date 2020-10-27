/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.io.*;
import static java.lang.Math.random;
import java.util.*;

/**
 *
 * @author carl
 */
public class HistogramDB {
    
    int nums[];
    
    public HistogramDB(){
        nums = new int[100];
        Random random = new Random();
        
        for(int i=0; i<100; i++){
            nums[i] = random.nextInt(100);
        }
        

    }
    
    public int[] retrieve() throws FileNotFoundException, IOException{
        
        
        try{
            FileReader file = new FileReader("grades.txt");
            BufferedReader br = new BufferedReader(file);
            
            for(int i =0; i<nums.length;i++){
                String str = br.readLine().trim();
                try{
                    nums[i]=Integer.parseInt(str);
                }
                catch(NumberFormatException ex){
                    System.out.println("Error, " + nums[i] + " isn't a whole number." );
                }
                
            }
            br.close();
        }
        catch(IOException ie){
            System.out.println(ie);
        }
        
        return nums;
    }
    
    public int insert(){
        DBHand jdb = new DBHand();
        int count = 0;
        
        boolean connectionSet = jdb.setConnection("CarlBeeston","UHNy3636");
        
        if (connectionSet){
            for(int i=0;i<100;i++){
                count += jdb.insert("insert into grades (StudentID, grade) values('1',"+ nums[i]+")");
            }
        }
        else{
            System.out.println("Error: Connection??");
        }
        
        return count;
    }
    
    public int[] retrieve(String query){
        List list = new ArrayList();
        DBHand jdb = new DBHand();
        
        boolean connectionSet = jdb.setConnection("CarlBeeston","UHNy3636");
        
        if (connectionSet){
            list = jdb.getNumbers(query);
        }
        else{
            System.out.println("Error: Connection??");
        }
        
        nums = new int[list.size()];
        Iterator itr = list.iterator();
        int i = 0;
        while(itr.hasNext()){
            nums[i++] = (int)itr.next();
        }
        return nums;       
    }
    
    
    public static void main(String[] args){
        HistogramDB histo = new HistogramDB();
        int[] nums = histo("select * from CarlBeeston.grades");
        
        Histogram hist = new Histogram(nums, 10);
        
        System.out.println(hist.getHistogram());
        
    }

}
