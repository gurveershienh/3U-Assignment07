
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shieg0688
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for user input
        Scanner input = new Scanner(System.in);
        //ask for number of students in a class
        System.out.println("How many students in the class?");
        int students = input.nextInt();
        //create array
        double []marks  = new double[students];
          for(int i = 0; i < marks.length; i++){
            System.out.println("Enter marks: " + (i +1));
            marks[i] = input.nextDouble();
            
    }
           double total = 0;
        for(int i = 0; i < marks.length; i++){
            //add numbers
            total = total + marks[i];
        }
        double avg = total/marks.length;
        System.out.println("Average: "+ avg );
}
}