
package newpackage;

import java.util.Scanner;


public class SchoolModify {
    
    int i,j,k ;
    
    double totalMarks ;
    double averageMarks ; 
    String[] studentName ;
        
    int[] studentRoll ;
    double[] studentTotalMarks ;
    
     
    
    // Student registration
    void Registration(int numberOfStudent){
        
        Scanner input = new Scanner(System.in) ;
        
        studentRoll = new int[numberOfStudent] ;
        studentName = new String[numberOfStudent] ;
        
        for (i = 0 ; i < numberOfStudent ; i++){
            
            j = i + 1 ;
            
            System.out.println("serial "+ j +" - students name : ");
            
            studentName[i] = input.next() ;
            
            System.out.println("serial " + j +" - students roll : ");
            studentRoll[i] = input.nextInt() ;
        }
    }
    
    // display Registered student name and roll
    void displayRegStuInfo(int numberOfStudent){
        
        System.out.println("---------------------------------------------");
        System.out.println("name and roll number of registered students :");
        
        for (i = 0 ; i < numberOfStudent ; i++){
            
            System.out.println("Name : " + studentName[i]);
            System.out.println("Roll : " + studentRoll[i]);
        }
        
        System.out.println("\n");
    }
    
    // registered student total exam marks
    void entryStudentsMarks(int numberOfStudent){
        
       totalMarks = 0.0d ;
       
       
        studentTotalMarks = new double[numberOfStudent] ;
        
        Scanner s = new Scanner(System.in) ;
        
        for (k = 0 ; k < numberOfStudent ; k++){
            
            System.out.println("Enter the total marks ( " + studentName[k] + " ) : ");
            
            studentTotalMarks[k] = s.nextDouble();
            
            totalMarks = (totalMarks + studentTotalMarks[k]) ;
            
            
        }
       
    }
    
    // All details of all students
    void detailsDisplay(int numberOfStudent){
        
        averageMarks = 0.0d ;
        
        averageMarks = totalMarks / numberOfStudent ;
        
        System.out.println("\n\n--------------Student All Details--------------");
        System.out.println("Student Name\tStudent Roll");
        
        for (i = 0 ; i < numberOfStudent ; i++){
            System.out.println(studentName[i] +"\t\t" + studentRoll[i]) ;
                   
        }
        
        System.out.println("\nAverage marks of all students : " + averageMarks);
    }
    
    
    // main method
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in) ;
        
        int numberOfStudent ;
        System.out.println("Enter the number of student : ") ;
        
        numberOfStudent = scan.nextInt() ;
        
        //object declaration and initialization
        SchoolModify m = new SchoolModify() ;
       
        m.Registration(numberOfStudent);
        m.displayRegStuInfo(numberOfStudent);
        m.entryStudentsMarks(numberOfStudent);
        m.detailsDisplay(numberOfStudent);
    }
    
}
