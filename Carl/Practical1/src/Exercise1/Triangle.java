package Exercise1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carl
 */
public class Triangle {   

    int side1, side2, side3;

    Triangle(){
        //No Parameters
    }

    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("Triangle with sides of: " + side1 + ", " + side2 + ", " + side3);
    }
    
    public String Test(int x, int y, int z){
        String result = null;
        int count = 0;
        
        if(x == y) count+=1;
        if(x == z) count+=1;
        if(y == z) count+=1;
        
        switch (count) {
            case 0:
                result = "scalene";
                break;
            case 1:
                result = "icoseles";
                break;
            case 2:
                result = "equilateral";
                break;
        }
        
        return result;
    }
}
