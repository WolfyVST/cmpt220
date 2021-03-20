public class hw3Problem3 {
    public static void main(String[] args){
        double RADIUS = 5;
        double xp1 = Math.random() * (4 - 1 + 1) + 1 ;
        double xp2 = Math.random() * (4 - 1 + 1) + 1;
        double distance = Math.sqrt((xp1 * xp1)+ (xp2 * xp2)) + RADIUS;
        System.out.println("The point is: " + xp1 + "," + xp2 + "and its distance to the center is: " + distance)
        ;
    }