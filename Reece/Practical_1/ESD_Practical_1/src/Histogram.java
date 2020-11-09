
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Histogram {

    private final int gradeBoundaries[];
    private final int grades[];
    private final int maxBoundaries = 10;
    
    public Histogram(int[] grades){
        this.grades = new int[grades.length];
        this.gradeBoundaries = new int[maxBoundaries];
        
        for(int i = 0; i < grades.length; i++){
            this.grades[i] = grades[i];
            int index = this.grades[i] / maxBoundaries;
            
            if(index == maxBoundaries)
                index--;
            this.gradeBoundaries[index] += 1;
            
        }
        
    }

    public void getHistogram(){
        int val = 1;
        for(int i = 0; i < maxBoundaries; i++){
            System.out.print(val + " - " + (val + 9) + "\t| ");
            
            for(int j = this.gradeBoundaries[i]; j > 0; j--){
                System.out.print("*");
            }
            
            System.out.print("\n");
            val += 10;
            
        }
    }

    public static void main(String[] args) throws Exception {
        
        try{
            String filePath = "D://Computer Science//Enterprise Systems Development//Group8_ESD_Practicals//Reece//Practical_1//ESD_Practical_1//src//grades.txt";
            FileReader file = new FileReader(filePath);
            BufferedReader br = new BufferedReader(file);
            
            String line = null;
            int[] grades = new int[100];
            int index = 0;
            
            
            while((line = br.readLine()) != null){
                grades[index] = Integer.parseInt(line);
                index++;
            }
        
            Histogram histogram = new Histogram(grades);
            histogram.getHistogram();
        
        } catch(FileNotFoundException e){
            System.err.format("Invalid File - File does not exist\n");
        }
        
        
        
   
    }

     
}
