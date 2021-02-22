/**
 * Application purpose : This program depicts the use of quiz game
 * Author: Bindiya Patel
 * Date: 11-21-2020
 * Time: 05:15:00 PM
 */

//import packages

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizTestHarness{

    public static void  main(String args[]) {

        //Greeting message
        System.out.println("Welcome to Quiz");

        // Initializing Scanner class object
        Scanner scanner = new Scanner(System.in);

        // variable for storing username
        String userName = null;


        // Variable to store choice of an admin
        int choiceOption = 0;

        //Calling setQuizData() Method
        QuizUtility.setQuizData();


        // This loop runs forever
        while (true)
        {
            // Take username from user

//            if(userName == null || userName.isEmpty()) {
            System.out.println("Enter username:");
            do {
                userName = scanner.nextLine().trim();
            } while (userName.isEmpty() || userName == null); //Check username is empty or not
//            }



            //Check username is admin or not
            if (userName.equalsIgnoreCase("admin")) {
                System.out.println("Admin login");



                do
                {
//                    System.out.println("choiceOption " + choiceOption);

                    //Check value of choiceOption variable
                    if (choiceOption != 0)
                    {
                        //Test choiceOption for different cases
                        switch (choiceOption)
                        {
                            case 1:
                                QuizUtility.addQuestion(); //Calling addQuestion() Method
                                break;
                            case 2:
                                QuizUtility.removeQuestion(); //Calling removeQuestion() Method
                                break;
                            case 3:
                                QuizUtility.addParticipant(); //Calling addParticipant() Method
                                break;
                            case 4:
                                QuizUtility.removeParticipant(); //Calling removeParticipant() Method
                                break;
                            case 5:
                                QuizUtility.viewQuestions(); //Calling viewQuestions() Method
                                break;
                            case 6:
                                QuizUtility.viewParticipant(); // Calling viewParticipant() Method
                                break;
                            case 7:
                                QuizUtility.trackQuestions(); // Calling trackQuestions() Method
                                break;
                            case 8:
                                userName = "";
                                break;
                            default:
                                System.out.println("Wrong choice");
                        }
                        choiceOption = 0;
                    }
                    else if(choiceOption == 0)
                    {

                        // Show Menu for Admin

                        System.out.println();

                        System.out.println("Please Select any Option from below ");
                        System.out.println("------------------------------------");

                        System.out.println("1. Add New Question.");
                        System.out.println("2. Remove Question.");
                        System.out.println("3. Add New Participant.");
                        System.out.println("4. Remove Participant.");
                        System.out.println("5. View Questions");
                        System.out.println("6. View Participants");
                        System.out.println("7. View Questions of Participant");
                        System.out.println("8. Quit");

                        try {

                            // Taking choice from admin
                            System.out.println("Enter your choice:");
                            choiceOption = scanner.nextInt();
                        }
                        catch (InputMismatchException e)
                        {
                            System.out.println("You have entered invalid input");
                            scanner.nextLine();
                        }
                    }
                }
                while (choiceOption != 8); // check choiceOption is 8 or not.
            } else if(!userName.isEmpty()) {
                System.out.println("user"+userName);

                // Show User Login Display
                System.out.println("User Login");

                // Calling checkParticipant() method
                int position = QuizUtility.checkParticipant(userName);

                //Check result of checkParticipant() method

                if (position == -1) { // Participant doesn't exists
                    System.out.println("Wrong Roll Number!");
                } else {
                    QuizUtility.playQuiz(position); // Calling playQuiz() method
                }
            }
        }
    }
}