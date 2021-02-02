/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newapp;

/**
 *
 * @author ishan
 */
import java.util.Scanner;
public class NewApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] students;
        students = new String [6];
        
        for(int i = 0; i < students.length; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the student name: ");
            students[i]=input.nextLine();
        }
        
        for(int i =0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
    
}
