

package students;

/**
 *
 * @author Nat
 */
public class StudentList {
    public static void main(String[] args) {
        
       Students[] studentList = new Students[5];
        //make up 5 students to put inside
        studentList[0] = new Students("Superman", "007");
        studentList[1] = new Students("James Bond", "700");
        studentList[2] = new Students("Wonder Woman", "100");
        studentList[3] = new Students("Batman", "001");
        studentList[4] = new Students("Joker", "002");
        //the for each loop iterates over a list of Objects
        for(Students s : studentList)
        {
            System.out.println(s.getName());
        }
    }  

}
