import java.util.HashMap;  // import the HashMap class
import ecs100.*;
/**
 * A class containing students and their fave shows in a Hashmap
 *
 * @author Phoebe williamson
 * @version 1.0 27/03/23
 */
public class StudentShows
{
    // instance variables
    private HashMap<String, String> studentShows;

    /**
     * Constructor for objects of class StudentShows
     */
    public StudentShows()
    {
        // initialise instance variables
        studentShows = new HashMap<String, String>();
        addValues();    // populate the hashmap
    }

    /**
     * put some values in Hashmap
     */
    public void addValues(){
        // key (student), value (show)
        studentShows.put("Cecilia", "Chainsaw Man");
        studentShows.put("Gabrielle", "Skins");
        studentShows.put("Janelle", "The Mandalorian");
        studentShows.put("Kimberli", "Shadow and Bone");
        studentShows.put("Phoebe", "Suits");
        studentShows.put("Raina", "FRIENDS");
        studentShows.put("Rayha", "Full Metal Alchemist");
        studentShows.put("Ruth", "City and sweet");
    }
    
    /**
     * get a value based on the key
     */
    public void getValue() {
        String name, show;
        name = UI.askString("Enter student name: ");
        
        // pull the val from the hashmap
        show = studentShows.get(name);
        // if the show is not empty
        if (show != (null)) {
            UI.println(name + " fav show is " + show);
        } else {
            UI.println(name + " not found in collection");
        }
    }
    
}