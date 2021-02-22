/**
 * Application purposee : This program shows various functions of quiz game.
 * Author: Bindiya Patel
 * Date: 11-21-2020
 * Time: 08:15:00 AM
 */

//import packages

import java.util.Scanner;
import java.util.Random;

public class QuizUtility {

    // Initializing Random class object
    public static Random random = new Random();
    // Initializing Scanner class object
    public static Scanner scanner = new Scanner(System.in);

    // Array of Question class object
    public static Question questions[] = new Question[100];
    // Array of Participant class object
    public static Participant participants[] = new Participant[100];

    //Array to keep track of questions
    public static String trackOfQuestions[][]= new String[100][11];
    public static int countOftrack = 0;

    //Method to add some default data for questions and participants
    public static void setQuizData()
    {
        try {

            questions[Question.numberOfQuestions] = new Question("Who is father of india ?", "Mahatma gandhi", "Sardar patel", "Lal bahadur shashtri", "Javaharlal nehru", "a");
            questions[Question.numberOfQuestions] = new Question("Fastest shorthand writer was ?", "Dr.G.D.Bist", "J.R.D Tata", "J.M.Tagore", "Khudada Khan", "A");
            questions[Question.numberOfQuestions] = new Question("England is the place associated with ?", "Horse racing", "Polo", "Shooting", "Snooker", "A");
            questions[Question.numberOfQuestions] = new Question("Galileo was an italian astronomer who ?", "develpoed the telescope", "discovered four satellites of jupiter", "discovered that the movement of pendulum produces a regular time measurement", "All of the above", "d");
            questions[Question.numberOfQuestions] = new Question("Golf player vijay singh belongs to which country?", "USA", "Fiji", "India", "UK", "B");
            questions[Question.numberOfQuestions] = new Question("First China War was fought between ?", "China and Britain", "China and France", "China and Egypt", "China and Greek", "a");
            questions[Question.numberOfQuestions] = new Question("Guwahati High Court is the judicature of ?", "Nagaland", "Arunachal Pradesh", "Assam", "All of the above", "d");
            questions[Question.numberOfQuestions] = new Question("Film and TV institute of India is located at ?", "Pune", "Rajkot", "Pimpri", "Perambur", "a");
            questions[Question.numberOfQuestions] = new Question("The ozone layer restricts ?", "Visible light", "Infrared radiation", "X-rays and gamma rays", "Ultaviolet radiation", "d");
            questions[Question.numberOfQuestions] = new Question("FFC stands for?", "Foreign Finance Corporation", "Film Finance Corporation", "Federation of Football Council", "None of the above", "b");

            participants[Participant.numberOfParticiapnts] = new Participant("Bindiya Patel", "15ce22");
            participants[Participant.numberOfParticiapnts] = new Participant("Asmi Bhavsar", "15me21");
            participants[Participant.numberOfParticiapnts] = new Participant("Daksh Dharani", "15cl23");
            participants[Participant.numberOfParticiapnts] = new Participant("Divya Khunt", "15me24");
            participants[Participant.numberOfParticiapnts] = new Participant("Neha Mistri", "15ce25");
            participants[Participant.numberOfParticiapnts] = new Participant("Rima Mishra", "15ce26");
            participants[Participant.numberOfParticiapnts] = new Participant("Gaurav Rawat", "15cl27");
            participants[Participant.numberOfParticiapnts] = new Participant("Saunak Soni", "15me28");
            participants[Participant.numberOfParticiapnts] = new Participant("Jay Thakkar", "15ce29");
            participants[Participant.numberOfParticiapnts] = new Participant("Smit Dave", "15cl30");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }
    };

    //Method to add new questions
    public static void addQuestion()
    {
        System.out.println("Add Question");

        String question;
        do
        {
            System.out.println("Enter Question:");
            question = scanner.nextLine();
        } while (question.trim().isEmpty());

        String optionA;
        do
        {
            System.out.println("Enter option A:");
            optionA = scanner.nextLine();
        } while (optionA.trim().isEmpty());

        String optionB;
        do
        {
            System.out.println("Enter option B:");
            optionB = scanner.nextLine();
        } while (optionB.trim().isEmpty());

        String optionC;
        do
        {
            System.out.println("Enter option C:");
            optionC = scanner.nextLine();
        } while (optionC.trim().isEmpty());

        String optionD;
        do
        {
            System.out.println("Enter option D:");
            optionD = scanner.nextLine();
        } while (optionD.trim().isEmpty());

        String correctAnswer;
        do
        {
            System.out.println("Enter Correct Answer:");
            correctAnswer = scanner.nextLine();
        } while (correctAnswer.trim().isEmpty());

        try {
            questions[Question.numberOfQuestions] = new Question(question, optionA, optionB, optionC, optionD, correctAnswer);
            System.out.println("Question added successfully");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }
        catch (NullPointerException ne)
        {
            System.out.println("There is Some problem in System");
        }

    }

    //Method to remove questions
    public static void removeQuestion()
    {
        System.out.println("Enter no of question delete: ");
        int questionNo = scanner.nextInt();
        int index = -1;

        try{
            for(int i = 0; i < Question.numberOfQuestions; i++)
            {
                if(questions[i].getQuestionNo() == questionNo)
                {
                    index = i;
                    --Question.numberOfQuestions;
                    break;
                }
            }

            for(int i = index; i < Question.numberOfQuestions; i++) {
                questions[i] = questions[i+1];
            }

            System.out.println("Question Removed Successfully");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }

    }

    //Method to add new participant
    public static void addParticipant()
    {
        System.out.println("Add New Participant");
        String name;
        do {
            System.out.println("Enter name");
            name = scanner.nextLine();
        } while (name.trim().isEmpty());

        String rollNumber;
        do {
            System.out.println("Enter Roll Number");
            rollNumber = scanner.nextLine();
        } while (rollNumber.trim().isEmpty());

        try {
            participants[Participant.numberOfParticiapnts] = new Participant(name, rollNumber);
            System.out.println("Participant added successfully");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }
    }

    //Method to remove participant
    public static void removeParticipant()
    {
        System.out.println("Enter no of participant delete: ");
        String rollNumber = scanner.nextLine();
        int index = -1;

        try {

            for (int i = 0; i < Participant.numberOfParticiapnts; i++) {
                if (participants[i].getRollNumber().equals(rollNumber.trim())) {
                    index = i;
                    --Participant.numberOfParticiapnts;
                    break;
                }
            }

            if (index != -1) {
                for (int i = index; i < Participant.numberOfParticiapnts; i++) {
                    participants[i] = participants[i + 1];
                }
                System.out.println("Participant Removed Successfully");
            } else {
                System.out.println("Invalid roll number");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }
        catch (NullPointerException ne)
        {
            System.out.println("There is Some problem in System");
        }
    }
    //Method to display list of questions
    public static void viewQuestions()
    {
        System.out.println("List of questions");
        System.out.println("------------------------------------");

        System.out.println("No. \t Question \t Option A \t Option B \t Option C \t Option D \t Correct Answer \t");
        System.out.println();

        for (int i = 0; i < Question.numberOfQuestions;i++)
        {
//            System.out.print(questions[i].getQuestionNo());
            System.out.print( (i+1) + " " +questions[i].getQuestion());
            System.out.print("\tA." +questions[i].getOptionA());
            System.out.print("\tB." +questions[i].getOptionB());
            System.out.print("\tC." +questions[i].getOptionC());
            System.out.print("\tD." +questions[i].getOptionD());
            System.out.print("\tAnswer." +questions[i].getCorrectAnswer());

            System.out.println();
        }
    }
    //Method to dispaly list of participants
    public static void viewParticipant()
    {
        System.out.println("List of Particiapnts");
        System.out.println("------------------------------------");

        System.out.println("No. \t Name \t Roll Number \t SScore ");
        System.out.println();

        try
        {
            for (int i = 0; i < Participant.numberOfParticiapnts;i++)
            {
//                System.out.println(i + 1);
                System.out.println("Particiapnt No." +participants[i].getParticipantNo());
                System.out.println("Name." +participants[i].getName());
                System.out.println("Roll Number." +participants[i].getRollNumber());
                System.out.println("Score." +participants[i].getScore());
                System.out.println();
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }
        catch (NullPointerException ne)
        {
            System.out.println("There is Some problem in System");
        }
    }

    //Method to check participant exists or not
    public static int checkParticipant(String rollNumber)
    {
        int index = -1;
        try {
            for(int i = 0; i < Participant.numberOfParticiapnts; i++)
            {
                if(participants[i].getRollNumber().equals(rollNumber))
                {
                    index = i;
                    break;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }
        catch (NullPointerException ne)
        {
            System.out.println("There is Some problem in System");
        }
        return index;
    }

    // Method to play quiz
    public static void playQuiz(int position)
    {

        try {
            // Variable for each quiz
            int count = 0;
            int questionedArray[] = new int[10];
            String answer;
            int score = 0;
            trackOfQuestions[countOftrack][0] =  String.valueOf(participants[position].getParticipantNo());

            do {
                boolean duplicate = false;
                int questionNo = random.nextInt(Question.numberOfQuestions);

//                System.out.println("questionNo" + questionNo);

                for(int i = 0; i < count; i++)
                {
                    if(questionNo == questionedArray[i]) {
                        duplicate = true;
                        break;
                    }
                }

                if(duplicate)
                {
//                    System.out.println("duplicate");
                    continue;
                }


                Question currentQuestion = questions[questionNo];
                System.out.println("Q." + (count+1) + " " +currentQuestion.getQuestion());
                System.out.println("Option A." + currentQuestion.getOptionA());
                System.out.println("Option B." + currentQuestion.getOptionB());
                System.out.println("Option C." + currentQuestion.getOptionC());
                System.out.println("Option D." + currentQuestion.getOptionD());

                System.out.println("Enter your choice: ");
                answer = scanner.next();

                if (answer.trim().equals(currentQuestion.getCorrectAnswer())) {
                    score++;
                }
                questionedArray[count] = questionNo;
                trackOfQuestions[countOftrack][count+1] =  String.valueOf(currentQuestion.getQuestionNo());
                count++;
            } while (count < 10);

            countOftrack++;
            participants[position].setScore(score);
            System.out.println("QuizUtility Submitted Suucessfully");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }
        catch (NullPointerException ne)
        {
            System.out.println("There is Some problem in System");
        }

    }
    // Method to track the questions of particular participant
    public static void trackQuestions() {
        String rollNumber;
        do
        {
            System.out.println("Enter Participant Roll Number:");
            rollNumber = scanner.nextLine();
        } while (rollNumber.trim().isEmpty());

        try
        {
            int position = QuizUtility.checkParticipant(rollNumber);
            if (position == -1) {
                System.out.println("Wrong Roll Number!");
            } else {
//            viewQuestions(position);
                QuizUtility.viewQuestions(participants[position].getParticipantNo());
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is Some problem in System");
        }
        catch (NullPointerException ne)
        {
            System.out.println("There is Some problem in System");
        }

    }
    // Method to display list of questions attempted by particular participant
    public static void viewQuestions(int participantNo)
    {
        String attemptedQuestions[] = new String[11];

        try {
            for (int i = 0; i < countOftrack; i++) {

                if (trackOfQuestions[i][0].equals(String.valueOf(participantNo))) {
                    attemptedQuestions = trackOfQuestions[i];
                    break;
                }
            }

            if(attemptedQuestions[0] != null)
            {
                for (int j = 1; j < attemptedQuestions.length; j++) {
                    for (int i = 0; i < Question.numberOfQuestions; i++) {
                        if (questions[i].getQuestionNo() == Integer.parseInt(attemptedQuestions[j])) {
                            System.out.println(j + ". " + questions[i].getQuestion());
                        }
                    }
                }
            }
            else
            {
                System.out.println("Participant not attempted quiz yet.");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Participant not attempted quiz yet.");
        }
        catch (NullPointerException ne)
        {
            System.out.println("There is Some problem in System");
        }
    }
}