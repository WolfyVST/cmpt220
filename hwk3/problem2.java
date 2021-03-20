import java.util.Scanner;
public class hw3problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for X1 and X2: ");
        double xcord1 = input.nextDouble();
        double xcord2 = input.nextDouble();

        System.out.println("Enter the valuews for Y1 and Y2: ");
        double ycord1 = input.nextDouble();
        double ycord2 = input.nextDouble();

        double m = (ycord2 - ycord1)/(xcord2 - xcord1);
        double b = ycord1 - (m * xcord1);

        if (m == 0 ){
            if (b == 1) {
                System.out.println("The line equation for two points (" + xcord1 + "," + xcord2 + ") and (" + ycord1 + ", " + ycord2 + ") is y = x");
            } else {
                System.out.println("The line equation for two points (" + xcord1 + "," + xcord2 + ") and (" + ycord1 + ", " + ycord2 + ") is y = x + "+ b );
            }
        } else {
            System.out.println("The line equation for two points (" + xcord1 + "," + xcord2 + ") and (" + ycord1 + ", " + ycord2 + ") is y = "+ m + "x +" + b);
        }
    }
}