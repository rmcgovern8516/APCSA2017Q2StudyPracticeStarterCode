/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice{
    private int one;
    private int two;

    public MultPractice(int num1, int num2){
        one = num1;
        two = num2;
    }

    public String getProblem(){
        return one + " TIMES " + two;
    }

    public void nextProblem(){
        two++;
    }
}
