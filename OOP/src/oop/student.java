/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import java.util.Scanner;

/**
 *
 * @author Uncle Ngazii
 */
public class student {
   
    //Properties of the class can be seen as thing that define the class
    String Name[];
    int Age[] ;
    int Mark[] ;
    String Subject[];
    int No_of_students=0;
    
    //Methods define the functionality or the behaviour of a class
    
    //method collects the students details
    public void getStudentDetails()
    {
        Scanner scan = new Scanner(System.in);
    System.out.print("----New Student--- \n Enter the number of students recorded: ");
    No_of_students = scan.nextInt();
    System.out.println();
    //initialize the arrays
    Name = new String[No_of_students];
    Age = new int[No_of_students];
    Mark = new int [No_of_students];
    Subject = new String [No_of_students];
    
    
    for(int i = 0; i < No_of_students;i++)
    {
     
        
    System.out.print("Enter the student name: ");
    Name[i] = scan.next();
    System.out.println();
    
    System.out.print("Enter the students age: ");
    Age[i] = scan.nextInt();
    System.out.println();
    
    System.out.print("Enter the students mark: ");
    Mark[i] = scan.nextInt();
    System.out.println();
    
    System.out.print("Enter the students Favourite subject: ");
    Subject[i] = scan.next();
    System.out.println();
    
    }
  
    };
    
    //method displays the students details
    public void displayStudentDetals()
    {
         for(int i = 0; i< No_of_students ;i++)
    {
    System.out.println("Student Name: "+Name[i]+"\n"
                       + "Student Age: "+Age[i]+"\n"
                       + "Student Mark: "+Mark[i]+"% \n"
                       + "Student Favorite Subject: "+Subject[i]+"\n");
    
    };
    }
}
