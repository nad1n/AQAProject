package school.lesson8;

import java.util.*;

public class HomeWorkApp {

    public static void main(String[] args) {

        //Task 1

        //Create an array with 10-20 words (words can be repeated)
        String[] arrWords = new String[]{"Australia", "China", "Japan", "Czech", "Ukraine", "German", "Poland",
                "New Zealand", "Canada", "China", "Japan", "Russia", "Ukraine", "German", "Poland", "China", "Ukraine", "German", "Ukraine"};
        String[] arrSides = new String[]{"Left", "Right", "Top", "Bottom", "Center", "Right", "Center",
                "Right", "Center", "Left", "Right", "Left", "Center", "Left", "Center", "Right", "Left", "Top", "Bottom"};

        //Find and out list of unique words
        printUnique(arrWords);
        printUnique(arrSides);

        //Calculate the number of each word
        acountWords(arrWords);
        acountWords(arrSides);


        //Task 2
        PhoneList phoneList = new PhoneList();
        phoneList.add("Mike", "+12345678987");
        phoneList.add("Sue", "+30997654321");
        phoneList.add("Sue", "+30669876541");
        phoneList.add("Help", "911");
        phoneList.add("Paul", "+35551234567");
        phoneList.add("Paul", "+30991234567");
        phoneList.add("Info", "101");
        phoneList.add("George", "+98765432101");

        //Print all phoneList
        phoneList.print();
        System.out.println();
        //Print phone for surname
        phoneList.getPhone("Sue");
        phoneList.getPhone("Anna"); //checking if surname is missed
        phoneList.getPhone("Mike");
        phoneList.getPhone("Paul");
    }

    public static void acountWords(String[] array){
        LinkedHashMap<String, Integer> acountWords = new LinkedHashMap<>();
        for (String word : array) {
            Integer value = acountWords.get(word);
            if (value == null) {
                acountWords.put(word, 1);
            } else {
                acountWords.put(word, ++value);
            }
        }
        System.out.println(acountWords);
        System.out.println();
    }

    public static void printUnique(String[] array){
        Set<String> uniqList = new LinkedHashSet<>();
        uniqList.addAll(Arrays.asList(array));
        System.out.println(uniqList);
        System.out.println();
    }
}
