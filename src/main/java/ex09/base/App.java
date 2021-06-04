package ex09.base;
import java.util.Scanner;
/*Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */
public class App {
    Scanner in = new Scanner(System.in);
    final float conv = 350;
    public static void main(String[] args){

        App myApp = new App();
        System.out.print("What is the length of the room? ");
        int length = myApp.readInput();
        System.out.print("What is the width of the room? ");

        int width = myApp.readInput();
        int paintReq = myApp.amountNeed(length,width);

        myApp.displayInfo(paintReq,length,width);
    }
    private int readInput(){
        return in.nextInt();
    }
    private int amountNeed(int length,int width){
        int finalTotal = (int)Math.ceil((length * width)/conv);
        return finalTotal;
    }
    private void displayInfo(int paintReq,int length, int width){
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.",paintReq,(length * width));
    }

}
