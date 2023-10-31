package maven_midterm;


public class PersonInfo {

    public String getPersonDetails(String name, int id) {
        if ("ram".equals(name) && id == 3025) {
            return "Correct Person";
        } else {
            return "Incorrect Person";
        }
    }
}



