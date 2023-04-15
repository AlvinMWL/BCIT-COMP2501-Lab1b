package ca.bcit.studentrecords;

public class Main
{
    public static void main(String[] args) {
        Student a = new Student(new Name("Tiger","Woods"),"A00123456",new Date(1975,12,30),true);
        Student b = new Student(new Name("Bill","Gates"),"A00987654",new Date(1955,10,28),false);

        System.out.println(a.getName().getFullName()+"("+a.getName().getInitials()+")"+"(st#"+a.getStudentNumber()+")"+
                " was born on "+a.getDate().getYyMmDd()+". The student "+a.getGraduated());
        System.out.println(b.getName().getFullName()+"("+b.getName().getInitials()+")"+"(st#"+b.getStudentNumber()+")"+
                " was born on "+b.getDate().getYyMmDd()+". The student "+b.getGraduated());
    }
}
