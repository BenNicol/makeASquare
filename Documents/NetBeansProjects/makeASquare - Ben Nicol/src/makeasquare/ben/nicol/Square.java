/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package makeasquare.ben.nicol;

/**
 *
 * @author benic3728
 */
public class Square {
    private double sideLength; // Side length variable for the sqaure calculations.
    
    public Square () { // Constructor method.
        sideLength = 0; // Pre setting the value of the sidelength.
    } // End of the method.
    
    public void setSideLength(double length) { // Getting the length the user imputs
        sideLength = length; // Setting the paramiter to the side length.
    } // End of the Method.
    
    public double getSideLength() { // Getting the side length value.
        return sideLength; // Insta return baby.
    } // End of this method.
    
    public double area () { // Area value Method.
        double area; // area variable to be calculated.
        
        area = sideLength * sideLength; // Calculating the area using the sidelength.
        
        return area; // Returning the area.
    } // End of the area Method.
    
    public double perimeter () { // Perimeter method.
        double perimeter; // Perimeter variable to be calculated.
        
        perimeter = sideLength * 4; // Perimeter calcutlation.
        
        return perimeter; // Returning perimeter value.
    } // End of the Perimeter Method.
    
    public String displayAreaFormula() { // Method to display the area formula.
       String speak = "(Sidelength: " + sideLength + ") * (" + "Sidelength: " + sideLength +") = " + area(); // This is what is to be displayed.
       
       return speak; // Returning the string variable.
    } // End of the displayAreaFormula Method.
    
    public String displayPerimeterFormula() {
        String speak = "(Sidelength: " + sideLength + ") + (" + "Sidelength: " + sideLength + ") + ("
                + "Sidelength: " + sideLength + ") + (" + "Sidelength: " + sideLength + ")" + " = " + perimeter();
        
        return speak;
    }
}
