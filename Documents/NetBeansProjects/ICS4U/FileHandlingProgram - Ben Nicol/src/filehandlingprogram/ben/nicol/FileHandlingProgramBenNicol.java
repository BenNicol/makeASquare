/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filehandlingprogram.ben.nicol;


import java.io.*; // Importing the IO class to be used for the program.
import java.util.Scanner; // Importing a scanner to allow the user to select different options.


/**
 *
 * @author benic3728
 */
public class FileHandlingProgramBenNicol {
    static File textFile = new File("yoloswegKaune.txt"); // Making a variable file.
    static FileReader in; // Brinning in the FileReader.
    static BufferedReader readFile; // Brinning in the BufferedReader.
    static String stringText; // String variable to be read from the file.
    static String userText; // String vareiable to write to the file.
    
    
    /**
     * @param args the command line arguments
     */
    
    
        
    public static void writeFile() { // Writing to file method.
       
        try{ // Begging of the try statement.
            
            FileOutputStream out = new FileOutputStream(textFile);
            ObjectOutputStream writeFile = new ObjectOutputStream(out);
            writeFile.writeObject(userText);
            writeFile.close();
        System.out.println("The desired information was written into the file.");   
        } // End of the try statement.
        catch (FileNotFoundException e){
            System.out.println("File could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } // End of FileNotFoundException catch.
        catch (IOException e){
            System.out.println("Problem with the input/output");
            System.err.println("IOException: " + e.getMessage());
        } // End of the IOException catch.
       
       
        
    } //End of the Method.
    
    public static void readFile() { // Method for reading a file
        
        try { // Beginning of the try catch statement. 
            
            in = new FileReader(textFile); //  Opens input stream to file.
            readFile = new BufferedReader(in); // Reads the file.
            while ((stringText = readFile.readLine()) != null){ // While loop to allow the program to read the lines inside the file
                System.out.println(stringText); // Printing out the text inside the text file.
            }
            
            readFile.close(); // Closing the BufferedReader.
            in.close(); // Closing the FileReader.
            
        } // End of Try.
        catch (FileNotFoundException e) { // Beginning of the FileNotFoundException Catch statements.
            System.out.println("File does not exist broooo, or it like totally could not be found."); // Letting the user know what's up.
            System.err.println("FileNotFoundException: " + e.getMessage()); // Displaying error message.  
        } // End of NotFound Exception catch.
        
        catch (IOException e){ // Beginning of the IOException catch.
            System.out.println("Problems with the reading of files."); // DIsplaying that file could not be read.
            System.err.println("IOException: " + e.getMessage()); // Error Message.
        } // End of IOException catch.
        
    } // End of Method.
            
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        int choice; // Integer Variable for the user to input their choice.
        System.out.println("What would you like to do? Please choose between 1 and 3."); // Displaying the message for the user to be able to chose what option they would like.
        
        choice = Integer.parseInt(intInput.nextLine());
        
        switch (choice){ // Case choices for the different user options.
        
        case 1: // First case will be to create a file.
            if (textFile.exists()) { // Checking if the file exists.
            System.out.println("This file already exists bro."); // If the file already exits, message is shown.
            } else { // If the file doesn't exist:
            try{ // Beginning of the IOException try catch.
              textFile.createNewFile(); // Creating a new file named "yoloswegKaune".
              System.out.println("File was created brewsky"); // Letting the user know the file was successfully created.
            
            } catch (IOException e){ // Catch statement.
              System.out.println("File wasn't able to be created man"); // Letting the user know if the file couldn't be made, likely due to a pathing error.
              System.err.println("IOException: " +e.getMessage()); // Displaying the error message.
            } // End of catch.
            } // End of the else statement.
        break; // End of this case.
        
        case 2: //Case 2 for reading a file.
            readFile(); // Calling to the readFile Method.
        break; // End of case 2.
            
            
        
        
            default: // this'll like totally help.
                if (choice > 4){ // If the user inputs a number that is higher than all of the choices.
                    System.out.println("That number is not an option.... too high."); // Telling them they're too high.
                } // End of this if.
                else if (choice < 0){ // If the user inputs a number that less than 0.
                    System.out.println("That number is not an option.... too low."); // Telling user they're too low.
                } // End of the low else if.
                else{ // Everything else.
                    System.out.println("That number is not an option.... too low."); // Telling the user they're too low.
                } // End of the else statement.
                break; // Break it out bro.        }
       
       
        
    }
  }
}
