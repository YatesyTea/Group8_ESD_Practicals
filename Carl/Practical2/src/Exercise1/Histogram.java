/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author carl
 */
public class Histogram {
    private int[] nums;
    private final int[] bins;
    
    public Histogram(final int NUM, final int BIN){
        bins = new int[BIN];
        nums = new int[NUM];
        for(int i =0; i <BIN; i++){
            bins[i]= 0;
        }
    }
    
    public Histogram(int[] grades, final int BIN){
        bins = new int[BIN];
        final int NUM = grades.length;
        nums = new int[NUM];
        
        for(int i =0; i <BIN; i++) bins[i]=0;
        
        for(int i =0; i <grades.length; i++){
            nums[i] = grades[i];
            
        }
    }

    public int[] getBins() {
        return bins;
    }
    
    public String getHistogram(){
        
        String histo = "";
        int min = 0;
        int max = 1;
        
        for(int i =0; i <nums.length; i++){
            int index = (nums[i]-1)*bins.length/nums.length;
            bins[index]++;
        }
        
        for(int i =0; i <bins.length; i++){
            min = 1+(i*nums.length/bins.length);
            max = (i+1)*(nums.length/bins.length);
            
            String bns = String.format("%2d - %3d", min, max);
            histo += bns+":   ";
            for(int j =0; j <bins[i]; j++){
                histo += "+";
            }
            histo += "\n";            
        } 
        return histo;
    }
  
    
}
    