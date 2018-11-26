import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalNameLab {
    public static void main(String[] args)
    {   //At the beginning we need to know the name, so we ask the user to insert it's name and save it into a String
        System.out.print("Please insert your name: ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        //Before setting up the spaces for the array, we have a String, so we have to convert the string to Char (individual characters)
        char [] nameArray = name.toCharArray();
        char[][] spaces = new char[nameArray.length][nameArray.length];
        //Printing the actual letters every time the row and col have the same value (i.e. (1,1),(2,2)...)
        for(int row= 0; row < nameArray.length; row++) {
            for(int col = 0; col < nameArray.length; col++)
                if (row == col){
                    spaces[row][col] = nameArray[row];
                } else {
                    spaces[row][col]= ' ';
                }
        }
        printName(spaces);
    }
    //This method set the spaces for the array to be printed, both horizontally(row) and vertically (col) as big as the name (.length)
    public static void printName(char[][] spaces)
    {
        for (int row= 0; row < spaces.length; row++) {
            for (int col = 0; col < spaces.length; col++)
            {
                System.out.print(spaces[row][col]);
                if(col >= spaces.length-1)
                    System.out.println(" ");
            }
        }
    }
}