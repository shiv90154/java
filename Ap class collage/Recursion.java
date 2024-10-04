// Recusion in java 
/*Recursion in java is a process in which a method calls itself continuously. A method in java 
that calls itself is called recursive method */
// top to down // and // down to top 

//steps
// 1. base case
//2.kaam krna depending upon the prolem..
//3. inner function ko call lgaana 

public class Recursion {

    // infinte times

    public static void p() {
        System.out.print("hello");
        p();
    }

    public static void main(String[] args) {
        p();
    }
}