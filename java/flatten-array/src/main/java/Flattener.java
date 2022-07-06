import java.util.*;

public class Flattener {

    private List<Object> flattenedArray;

    // Constructor
    public Flattener() {
        flattenedArray = new ArrayList<>();
    }

    public List<Object> flatten (List<Object> listToFlatten) {

        // Iterate through list
        for (Object object : listToFlatten) {

            // check if it is null
            if (object != null) {

                // if not null, check if it is a list
                if (object instanceof List) {
                    // if list, check recursively, again
                    flatten((List<Object>) object);
                } else {
                    flattenedArray.add(object);
                }
            }
        }

        return flattenedArray;
    }
}