package ca.bcit.studentrecords;

/**
 * @author Mingwei Luo &
 * @version 1.0
 * This class models Name
 */
class Name
{
    private final String firstName;
    private final String lastName;

    public Name(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the firstname of the student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastname of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the full name of the student
     */
    public String getFullName(){
        return firstName + " " + lastName;
    }

    /**
     * @return the initial of the student
     */
    public String getInitials(){
        return firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0)+".";
    }
}
