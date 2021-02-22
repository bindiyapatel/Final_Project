/**
 * Application purposee : This program demonstrates blueprints for Question class.
 * Author: Bindiya Patel
 * Date: 11-19-2020
 * Time: 02:00:00 PM
 */

public class Question {

    // instatnce variables
    private int questionNo;
    private String question;
    private String optionA , optionB , optionC , optionD ;
    private String correctAnswer;

    // class variable
    public static int numberOfQuestions = 0;

    //Default Constructor
    public Question()
    {}

    //Parameterized Constructor
    public Question ( String question,String optionA, String optionB,String optionC,String optionD,String correctAnswer)
    {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;

        questionNo = ++numberOfQuestions;
    }


    // Getting Question number
    public int getQuestionNo()
    {
        return questionNo;
    }


    // Getters and Setters Methods for instance variable.

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getQuestion()
    {
        return question;
    }


    public void setOptionA(String optionA)
    {
        this.optionA = optionA;
    }

    public String getOptionA()
    {
        return optionA;
    }

    public void setOptionB(String optionB)
    {
        this.optionB = optionB;
    }

    public String getOptionB()
    {
        return optionB;
    }
    public void setOptionC(String optionC)
    {
        this.optionC = optionC;
    }

    public String getOptionC()
    {
        return optionC;
    }

    public void setOptionD(String optionD)
    {
        this.optionD = optionD;
    }

    public String getOptionD()
    {
        return optionD;
    }
    public void setCorrectAnswer(String correctAnswer)
    {
        this.correctAnswer =correctAnswer;
    }

    public String getCorrectAnswer()
    {
        return correctAnswer;
    }




}