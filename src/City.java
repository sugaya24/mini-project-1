import java.util.ArrayList;

public class City {
    // fields
    private String name;
    private int count;
    private ArrayList<String> guessList;
    private String word;
    
    // constructor
    public City() {
        this.name = "Vancouver";
        this.count = 0;
        this.guessList = new ArrayList<>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @return the guessList
     */
    public ArrayList<String> getGuessList() {
        return guessList;
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    public ArrayList<String> remove() {
        ArrayList<String> newGuessList = new ArrayList<>(getGuessList());

        String[] arrayName = name.split("");
        for (String str : arrayName) {
            if (newGuessList.contains(str)) {
                newGuessList.remove(str);
            }
        }
        return newGuessList;
    }

    public boolean isCorrectChar(String input) {
        if (name.contains(input)) {
            return true;
        }
        return false;
    }

    public boolean isCorrectName(String word) {
        if (word.equals(name)) {
            return true;
        }
        return false;
    }

    public int count(String input) {
        if (!isCorrectChar(input)) {
            count++;
        }
        return count;
    }
    
    public String toString(String input) {
        guessList.add(input);
       String s = "";
        for (int i = 0; i < name.length(); i++) {
            if (guessList.contains(name.split("")[i])) {
                s += name.charAt(i);
                word = s;
            } else {
                s += "_";
            }
        }
        return s;
    }
}
