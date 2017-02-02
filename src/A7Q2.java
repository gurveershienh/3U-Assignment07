
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask for amount of people
        System.out.println("Amount of people: ");
        int people = input.nextInt();
        //create array
        double[] heights = new double[people];
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter heights: " + (i + 1));
            heights[i] = input.nextDouble();
            
        }
        
        double averageHeight = 0;
            for (int j = 0; j < people; j++) {
                averageHeight = heights[j] +averageHeight;

            }
            averageHeight = averageHeight / people;
            System.out.println("Average height:" + averageHeight);
    }
}
