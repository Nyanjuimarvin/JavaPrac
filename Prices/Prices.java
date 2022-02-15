import java.util.Scanner;
public class Prices {
    public static void main(String[]args){

        System.out.println( calculatePrices( RequestPackage(), Distance() ) );
    }
    public static double calculatePrices(double num1,double num2){
        final double Shipping = 140.50;
        return  ( ( num1 /10 ) + ( num2 /5 ) )* Shipping;
    }
    public static double RequestPackage(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Package Weight");
        double packageWeight = input.nextDouble();
        return packageWeight;
    }

    public static double Distance(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Distance From Factory");
        double approxDistance = input.nextDouble();
        return approxDistance;
    }

}
/**JAVADOC COMMENTS*/