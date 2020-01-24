

package students;

/**
 *
 * @author Nat
 */
//this a change
public class Students 
{
    private String name;
    private String studentID;
    private String program;

    /**
     * A constructor that takes in both parameters
     * @param givenName - the student's name
     * @param givenID - the student's ID
     */
    public Students(String givenName, String givenID)
    {
        name = givenName;
        studentID = givenID;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    /**
     * a method that returns true if a student
     * studied and false otherwise.
     * @return whether or not the student studied
     */
    public boolean didStudy()
    {
        return true;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
    
   
}
