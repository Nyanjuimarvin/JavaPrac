import java.util.*;

public class Triangle {
    public int sideA;
    public int sideB;
    public int sideC;


    public void requestSides() {
        Scanner side = new Scanner(System.in);
        System.out.println("Enter 3 sides:");
        this.sideA = side.nextInt();
        this.sideB = side.nextInt();
        this.sideC = side.nextInt();

    }

    public String triangleType(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            return "Thats an Equilateral Triangle";
        } else if (a == b || b == c || a == c) {
            return "Thats an isosceles Triangle";
        } else {
            return "Thats a scalene Triangle";
        }
    }

    public void validTriangle(){

        if( sideC < (sideA + sideB) ){
            System.out.println( triangleType( sideA, sideB, sideC) );
        }else if( sideC == ( sideA + sideB )){
            System.out.println("Thats Too Flat For A Triangle,Try Again:");
            System.out.println("****************************************");
            requestSides();
            validTriangle();
        }

        while( sideC >= ( sideA + sideB ) ) {

            System.out.println("One side of your triangle " +
                    "must be less than the sum " +
                    "of the other two sides.." +
                    "Kindly try again:");
            System.out.println("*********************************************");
            requestSides();
            validTriangle();
        }
    }

}