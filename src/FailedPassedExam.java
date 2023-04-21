/*
A program that accept
user grade and required grade to success
as strings and return if user passed or failed
*/

public class FailedPassedExam {

    public static String gradePercentage(String userScore, String requiredScore){
        int userGrade,requiredGrade;
        String result;
        userGrade = Integer.parseInt(userScore.split("%")[0]);
        requiredGrade = Integer.parseInt(requiredScore.split("%")[0]);
        if(userGrade >= requiredGrade ){
            result = "You PASSED the Exam";
        }
        else{
            result = "You FAILED the Exam";
        }
        return result;
    }

    public static void main(String []args){
        System.out.println(gradePercentage("85%", "85%"));
        // You PASSED the Exam
        System.out.println(gradePercentage("99%", "85%"));
        // You PASSED the Exam
        System.out.println(gradePercentage("65%", "90%"));
        // You FAILED the Exam
    }
}
