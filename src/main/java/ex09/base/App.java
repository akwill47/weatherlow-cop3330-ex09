package ex09.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 William Weatherlow
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
