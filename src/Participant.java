/**
 * Application purposee : This program demonstrates blueprints for participant class.
 * Author: Bindiya Patel
 * Date: 11-19-2020
 * Time: 01:34:00 PM
 */

public class Participant {

    // instatnce variables
    private int participantNo;
    private String name;
    private String rollNumber;
    private int score;

    // class variable
    public static int numberOfParticiapnts = 0;

    //Default Constructor
    public Participant()
    {}

    //Parameterized Constructor
    public Participant(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.score = 0;
        participantNo = ++numberOfParticiapnts;
    }


    // Getting Participant number
    public int getParticipantNo() {
        return participantNo;
    }

    // Getters and Setters Methods for instance variable.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
