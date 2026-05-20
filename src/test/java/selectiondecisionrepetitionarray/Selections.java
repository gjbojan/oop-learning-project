package selectiondecisionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Selections {
    String gradeScore(int score) {
        if(score>=0 && score<=59) {
            System.out.println("F");
            return "F";
        }

        else if (score==60) {
            System.out.println("D-");
            return "D-";
        }
        else if (score>= 61 && score <=68) {
            System.out.println("D");
            return "D";
        }
        else if(score==69) {
            System.out.println("D+");
            return "D+";
        }

        else if (score==70) {
            System.out.println("C-");
            return "C-";
        }
        else if (score>=71 && score <=78) {
            System.out.println("C");
            return "C";
        }
        else if (score==79) {
            System.out.println("C+");
            return "C+";
        }

        else if (score == 80) {
            System.out.println("B-");
            return "B-";
        }
        else if (score >= 81 && score <= 88) {
            System.out.println("B");
            return "B";
        }
        else if (score == 89) {
            System.out.println("B+");
            return "B+";
        }

        else if(score==90) {
            System.out.println("A-");
            return "A-";
        }
        else if (score >=91 && score <= 99) {
            System.out.println("A");
            return "A";
        }
        else if(score==100) {
            System.out.println("A+");
            return "A+";
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
        assertEquals("D", gradeScore(65));
        assertEquals("D+", gradeScore(69));
        assertEquals("C-", gradeScore(70));
        assertEquals("C", gradeScore(75));
        assertEquals("C+", gradeScore(79));
        assertEquals("B-", gradeScore(80));
        assertEquals("B", gradeScore(85));
        assertEquals("B+", gradeScore(89));
        assertEquals("A-", gradeScore(90));
        assertEquals("A", gradeScore(95));
        assertEquals("A+", gradeScore(100));
        assertEquals("error", gradeScore(-1));
        assertEquals("error", gradeScore(101));
    }

    String personsHeight(int height) {
        if(height>=1 && height<=80) {
            System.out.println("short");
            return "short";
        }
        else if(height>=81 && height<=180) {
            System.out.println("medium");
            return "medium";
        }
        else if(height>=181 && height<=250) {
            System.out.println("tall");
            return "tall";
        }
        else {
            System.out.println("Please enter a value in the valid range.");
            return "error";
        }
    }

    @Test
    public void personsHeightTest() {
        assertEquals("short", personsHeight(1));
        assertEquals("short", personsHeight(40));
        assertEquals("short", personsHeight(80));
        assertEquals("medium", personsHeight(81));
        assertEquals("medium", personsHeight(130));
        assertEquals("medium", personsHeight(180));
        assertEquals("tall", personsHeight(181));
        assertEquals("tall", personsHeight(215));
        assertEquals("tall", personsHeight(250));
        assertEquals("error", personsHeight(0));
        assertEquals("error", personsHeight(251));
        assertEquals("error", personsHeight(-5));
    }
}
