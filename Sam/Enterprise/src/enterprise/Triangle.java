
package enterprise;


public class Triangle {
    
    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean is_Scalene() {

        return (side1 != side2) && (side1 != side3) && (side2 != side3);


    }

    public boolean is_Isosceles() {

        return ((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2)) || ((side2 == side3) && ((side2 != side1)));


    }

    public boolean is_Equilateral() {

        return (side1 == side2) && (side1 == side3);

    }
}
