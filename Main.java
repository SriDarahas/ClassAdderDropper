/* Assignment #: 4
 Name: Sri Darahas Koneru
Description: Assignment 4 class displays a menu of choices to a user
  and performs the chosen task. It will keep asking a user to
 enter the next choice until the choice of 'Q' (Quit) is entered.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main
 {
  public static void main (String[] args)
   {


       // local variables, can be accessed anywhere from the main method
       char input1 = 'Z';
       //String inputInfo= "";
       String major, subject, instructor;
       int id, courseId;

       String line;

       // instantiate a Student object
       Student student = new Student();

       printMenu();

       //Create a Scanner object to read user input
       Scanner scan = new Scanner(System.in);

       do  // will ask for user input
        {
            System.out.println("\nWhat action would you like to perform?");
            line = scan.nextLine();

            if (line.length() == 1)
            {
                input1 = line.charAt(0);
                input1 = Character.toUpperCase(input1);

                // matches one of the case statement
                switch (input1)
                {
                    case 'A':   //Add a Student

					    System.out.print("\nPlease enter the student's information:\n");
					    System.out.print("\nEnter student's ID:\t");
					    id = scan.nextInt();
					    scan.nextLine();		//use to skip the enter key you typed
					    System.out.print("\nEnter student's major:\t");
					    major = scan.nextLine();

                        System.out.print("\nPlease enter the course information:");
                        System.out.print("\nEnter course ID:\t");
                        courseId = scan.nextInt();
                        scan.nextLine();		//use to skip the enter key you typed
                        System.out.print("\nEnter instr. name:\t");
                        instructor = scan.nextLine();
                        System.out.print("\nEnter course subject:\t");
                        subject = scan.nextLine();

                        Course course = new Course(courseId, instructor, subject);

                        student = new Student(id, major, course);
                        break;
                    case 'D':   //Display Student Info
                        System.out.print(student);
                        break;
                    case 'Q':   //Quit
                        break;
                    case '?':   //Display Menu
                        printMenu();
                        break;
                    default:
                        System.out.print("Unknown action\n");
                        break;
                }
          }
         else
          {
              System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q' || line.length() != 1);
       scan.close();
   }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd Student\n" +
                        "D\t\tDisplay Student info\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Help\n\n");
  }
}
