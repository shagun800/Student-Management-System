public class Student{
    private String studentName;
    private int rollNumber;
    public Student(String studentName, int rollNumber){
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getRollNumber(){
        return rollNumber;
    }

}