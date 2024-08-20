//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
    public static void main(String[]args){
        // variables 
        int width = 0;
        int area = 0;
        int perimeter = 0;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = Integer.parseInt(scan.nextLine(),10);
        System.out.print("Enter the width: ");
        width = Integer.parseInt(scan.nextLine(),10);
        area = (length * width);
        perimeter = (length * 2 + width * 2 );
        System.out.println("The length is : " + length);
        System.out.println("\nThe width is : " + width + "\n");
        System.out.println("\nThe area is : " + area);
        System.out.println("\nThe perimeter is : " + perimeter);
    }   
}



//Paste console output below:
/*


*/
