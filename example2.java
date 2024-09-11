

import java.util.Scanner;
public class example2 {
  public static void main(String[] args) {
    
   Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name");
        String name= sc.nextLine();

        System.out.println("enter your campus");
        String campus = sc.nextLine();

       

        System.out.println("Enter the course your are enrolling for");
        String course = sc.nextLine();


        System.out.println("name=" + name); 

        System.out.println("campus="+ campus);

         System.out.println("course=" + course); 

System.out.println("Your a student at "+ campus +"offering"+ course);

   sc.close();
  }  
}
