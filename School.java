
package newpackage;

import java.util.Scanner;


public class School {
    
    
    public static void main(String[] args){  
        
        int i,j ;
        int numberOfStudent ;
        double totalMarks = 0.0d ;
        double averageMarks = 0.0d ;
        String[] studentName ;
        
        int[] studentRoll ;
        double[] studentTotalMarks ;
    
        Scanner scan = new Scanner(System.in) ;
        
        System.out.println("Enter the number of student : ") ;
        
        numberOfStudent = scan.nextInt() ;
        
        studentRoll = new int[numberOfStudent] ;
        studentName = new String[numberOfStudent] ;
        studentTotalMarks = new double[numberOfStudent] ;       
        
        //This loop is used to input student name and roll                
        for (i = 0 ; i < numberOfStudent ; i++){
            
            j = i + 1 ;
            
            System.out.println("serial "+ j +" - students name : ");
            
            studentName[i] = scan.next() ;
            
            System.out.println("serial " + j +" - students roll : ");
            studentRoll[i] = scan.nextInt() ;
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("name and roll number of registered students :");
        
        //This loop is used to display student name and roll 
        for (i = 0 ; i < numberOfStudent ; i++){
            
            System.out.println("Name : " + studentName[i]);
            System.out.println("Roll : " + studentRoll[i]);
        }
        
        System.out.println("\n");
        
        /*
            This loop is used to input student total marks
            and calculate total marks of all students
        */
        for (i = 0 ; i < numberOfStudent ; i++){
            
            System.out.println("Enter the total marks ( " + studentName[i] + " ) : ");
            
            studentTotalMarks[i] = scan.nextDouble();
            
            totalMarks = (totalMarks + studentTotalMarks[i]) ;
            
            
        }
        
        averageMarks = totalMarks / numberOfStudent ;
        
        
        
        System.out.println("\n\n--------------Student All Details--------------");
        System.out.println("Student Name\tStudent Roll");
        
        //This loop is used to display student name,roll
        for (i = 0 ; i < numberOfStudent ; i++){
            System.out.println(studentName[i] +"\t\t" + studentRoll[i]) ;
                   
        }
        
        System.out.println("\nAverage marks of all students : " + averageMarks);
       
    }
    

}
