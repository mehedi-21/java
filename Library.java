// Encapsulation

package MyPackage;

import java.util.Scanner;


public class Library {
    
    // declare variable
    int self ;
    String library_name,category ;
    
    
    // constructor
    Library(){
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("Enter library name : ");
        library_name = input.nextLine() ;
        
        System.out.println("Write the name of books category : ");
        category = input.nextLine() ;
        
        System.out.println("How many self in this library : ");
        self = input.nextInt() ;
        
    }
    
    //display output
    void display(){
        
        System.out.println("-----------------------------");
        System.out.println("LIbrary name : " + library_name) ;
        System.out.println("Category of books : " + category) ;
        System.out.println("Total self : " + self) ;
        
    }
    
    public static void main(String[] args){
        
        //object declaration
        Library lib1,lib2 ;
        
        lib1 = new Library() ;
        lib1.display() ;
        
        lib2 = new Library() ;
        lib2.display() ;
    }
    
    
}
