package tw.edu.ntut.csie.app01_105590011;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class LetterGrade {
    public String lettergrade (int score){
        String Grade;
        if (score >= 0 && score < 60)
            Grade = "F";
        else if (score >= 60 && score < 70)
            Grade = "D";
        else if (score >= 70 && score < 80)
            Grade = "C";
        else if (score >=80 && score < 90)
            Grade = "B";
        else if (score >= 90 && score < 100)
            Grade = "A";
        else
            Grade = "X";
        return Grade;
    }
}
