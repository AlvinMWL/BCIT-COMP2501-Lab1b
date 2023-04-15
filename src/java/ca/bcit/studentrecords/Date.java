package ca.bcit.studentrecords;

/**
 * @author Mingwei Luo &
 * @version 1.0
 * This class models Date
 */
class Date
{
    //Date variables
    private final int year;
    private final int month;
    private final int day;

    //constructor
    public Date(final int year, final int month, final int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * @return the year of the Date
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the month of the Date
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the day of the Date
     */
    public int getDay() {
        return day;
    }

    /**
     * @return a format of a Date "yyyy-mm-dd", ex: "1981-10-10"
     */
    public String getYyMmDd(){
        return year+"-"+month+"-"+day;
    }
}
