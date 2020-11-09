
public class Triangle {

    private int sides [];
    
    //Constructor
    public Triangle(int sideA, int sideB, int sideC){
        sides = new int[3];
        
        sides[0] = sideA;
        sides[1] = sideB;
        sides[2] = sideC;        
    }
    
    /*
        Check type of triangle
            Return: type as String
    */
    public String checkType(){        
        if(this.sides[0] == this.sides[1] && this.sides[0] == this.sides[2]){
            return "equilateral";
        }
        else if(this.sides[0] == this.sides[1] || this.sides[0] == this.sides[2] || this.sides[1] == this.sides[2]){
            return "isosceles";
        }
        else{
            return "scalene";
        }
        
    }
    
}
