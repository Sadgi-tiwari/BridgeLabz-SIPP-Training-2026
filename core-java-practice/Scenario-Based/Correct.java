package EXceptionSolution;
public class correct {
    private String correctAnswer = "A";
    public void checkAnswer(String correctAnswer) throws AnswerIncorrectException{
        if(!answer.equals(correctAnswer)){
            throw new AnswerIncorrectException(answer, correctAnswer);
        }
        System.out.println("Correct answer!");
    }
    }

        public static void main(String[] args) {
            Correct correct = new Correct();
            try{
                correct.checkAnswer("A");
            }catch(AnswerIncorrectException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

    }
