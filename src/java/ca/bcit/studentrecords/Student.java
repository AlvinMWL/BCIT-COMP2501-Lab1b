package ca.bcit.studentrecords;

/**
 * @author Mingwei Luo &
 * @version 1.0
 * This class models Student
 */
public class Student
{
    private final Name Name;
    private final String studentNumber;
    private final Date Date;
    private final boolean graduated;

    public Student(ca.bcit.studentrecords.Name name,
                   String studentNumber,
                   ca.bcit.studentrecords.Date date,
                   boolean graduated)
    {
        Name = name;
        this.studentNumber = studentNumber;
        Date = date;
        this.graduated = graduated;
    }

    public ca.bcit.studentrecords.Name getName() {
        return Name;
    }

    /**
     * @return the student number of a student
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    public ca.bcit.studentrecords.Date getDate() {
        return Date;
    }

    /**
     * @return the result of graduated or not
     */
    public boolean isGraduated() {
        return graduated;
    }

    /**
     * @return "has graduated" if true, "has not graduated if false
     */
    public String getGraduated(){
        if (isGraduated() == true)
            return "has graduated";
        return "has not graduated";
    }

}
