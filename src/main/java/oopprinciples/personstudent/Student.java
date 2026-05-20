package personstudent;

public class Student extends Person {
    int studentID;

    public Student(String name, String surname, int age, String gender, int studentID) {
        super(name,surname,age,gender);
        this.studentID=studentID;
    }

    public Student() {

    }

    public void setStudentID(int studentID) {
        if(studentID < 1 || studentID > 100000) {
            throw new IllegalArgumentException("The studentID must be between 1 and 100000.");
        }
        this.studentID=studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void numberIDOfStudent() {
        System.out.println("Student " + name + " " + surname + " ID: " + studentID);
    }
}
