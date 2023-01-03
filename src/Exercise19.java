import java.util.Arrays;

//Exercise 19 and 20 togethere
public class Exercise19 {
    public static void main(String[] args) {
        //Int
        int[] numbers = {10, 3, 6, 2, 7, 1, 8, 4, 9, 5};

        Arrays.sort(numbers);

        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));

        //String
        String[] words = {"carrot", "elderberry", "apple", "banana", "cherry", "date", "fig"};

        Arrays.sort(words);

        System.out.println("Sorted string array: " + Arrays.toString(words));
    }
}


// Arrays.sort() method uses the natural ordering of the elements,
// which for strings is based on their Unicode values.
// This means that uppercase letters are considered to be "less than" lowercase letters,
// so the sorting algorithm will place them first.
//The Comparator interface defines a single method called compare() that takes two objects as parameters
// and returns an integer indicating their relative order.
//Example code below
/*
import java.util.Arrays;
import java.util.Comparator;

public class Exercise19 {
  public static void main(String[] args) {
    String[] words = {"Carrot", "apple", "banana", "cherry", "date", "elderberry", "fig"};

    Arrays.sort(words, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
      }
    });

    System.out.println("Sorted string array: " + Arrays.toString(words));
  }
}
*/