package selectiondecisionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeScoreClass {
    String gradeScore(int score) {
        if(score>=0 && score <=59) {
            return "F";
        }
        else if(score>=60 && score <=69) {
            if(score==60) {
                return "D-";
            }
            else if(score==69) {
                return "D+";
            }
            return "D";
        }
        else if(score>=70 && score<=79) {
            if(score==70) {
                return "C-";
            }
            else if(score==79) {
                return "C+";
            }
            return "C";
        }
        else if(score>=80 && score<=89) {
            if(score==80) {
                return "B-";
            }
            else if(score==89) {
                return "B+";
            }
            return "B";
        }
        else if(score>=90 && score <=100) {
            if(score==90) {
                return "A-";
            }
            else if(score==100) {
                return "A+";
            }
            return "A";
        }
        else {
            System.out.println("You did not enter a valid score! Please try again.");
            return "error";
        }
    }

    @Test
    public void gradeScoreTest() {
        assertEquals("F", gradeScore(0));
        assertEquals("F", gradeScore(30));
        assertEquals("F", gradeScore(59));
        assertEquals("D-", gradeScore(60));
        assertEquals("D", gradeScore(61));
        assertEquals("D", gradeScore(65));
        assertEquals("D", gradeScore(68));
        assertEquals("D+", gradeScore(69));
        assertEquals("C-", gradeScore(70));
        assertEquals("C", gradeScore(71));
        assertEquals("C", gradeScore(75));
        assertEquals("C", gradeScore(78));
        assertEquals("C+", gradeScore(79));
        assertEquals("B-", gradeScore(80));
        assertEquals("B", gradeScore(81));
        assertEquals("B", gradeScore(85));
        assertEquals("B", gradeScore(88));
        assertEquals("B+", gradeScore(89));
        assertEquals("A-", gradeScore(90));
        assertEquals("A", gradeScore(91));
        assertEquals("A", gradeScore(95));
        assertEquals("A", gradeScore(99));
        assertEquals("A+", gradeScore(100));
        assertEquals("error", gradeScore(-1));
        assertEquals("error", gradeScore(101));
    }
}