public ExceptionSolution;
public class AnswerIncorrectException extends Exception {
    String answer;
    String correctAnswer;
    public AnswerIncorrectException(String answer, String correctAnswer) {
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }
    @Override
    public String getMessage() {
        return "Incorrect answer! \n Chooose answer: " + answer + ", Correct answer: " + correctAnswer;
    }   
}