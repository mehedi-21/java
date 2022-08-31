/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class SchoolLatest {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static Scanner scan = new Scanner(System.in);
    
    static int studentNumber ;
    static float marks = 0 ;
    static float average = 0 ;
    
    static ArrayList<String> nameList = new ArrayList<>();
    static ArrayList<Integer> rollList = new ArrayList<>();
    static ArrayList<Float> marksList = new ArrayList<>() ;


    static void StuReg() throws IOException{ 
        for(int i = 0;i < studentNumber;i++){
            System.out.println("Enter student name : ");
            String studentName = bufferedReader.readLine().trim() ;
            nameList.add(studentName) ;
            
            System.out.println("Enter student roll : ");
            int studentRoll = scan.nextInt() ;
            rollList.add(studentRoll) ;
        }
       
    }

    
    static void displayNameRoll(){
        System.out.println("--------------------------");
        
        for(int i = 0;i < studentNumber;i++){
            System.out.println("Student name : "+ nameList.get(i));
            System.out.println("Roll : "+ rollList.get(i));
        }
    }

    
    static void OthersDetails(){        
        System.out.println("student number : "+ studentNumber);
        for(int i = 0;i < studentNumber;i++){
            System.out.println("Enter total marks("+ nameList.get(i) +") : ");  
            marksList.add(scan.nextFloat()) ;  
            
            marks = marks + marksList.get(i) ;
        }        
        average = marks / studentNumber ;
    }

    
    static void AllDetailsDisplay(){
        System.out.println("---------------------------------------");
        System.out.println("Student name\tStudent Roll");
        System.out.println("------------\t------------");
        
        for (int i = 0; i < studentNumber; i++) {
            System.out.println(nameList.get(i) +"\t\t"+ rollList.get(i));            
        }
        System.out.println("Average marks of all student : "+ average);
    }

    
    public static void main(String[] args) throws IOException{     
        System.out.println("Enter student number : ");
        studentNumber = scan.nextInt();
        
        StuReg();
        OthersDetails() ;
        AllDetailsDisplay();
        
    }
}
