import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

  // The time complexity is:
  // YOUR ANSWER HERE
  // O(x^2)
  // X = Size of the integer x
  public static void timesTable(int x) {
    for(int i = 1; i <= x; i++) {
        for(int j = 1; j <= x; j++) {
            System.out.print(i*j + " ");
        }
        System.out.println();
    }
  }

  // The time complexity is:
  // YOUR ANSWER HERE
  // O(n)
  // n is the length of the string
  public static void printLetters(String word) {
    char[] letters = word.toCharArray();

    for (char letter : letters) {
        System.out.println(letter);
    }
  }

  // The time complexity is:
  // YOUR ANSWER HERE
  //O(n)
  // n is the fixed elements within the banned passwords array
  public static boolean isBanned(String password) {
    String[] bannedPasswords = {"password", "hello", "qwerty"};
    boolean banned = false;
    for(String bannedPassword : bannedPasswords) {
        if(password.equals(bannedPassword)) {
            banned = true;
        }
    }
    return banned;
  }


  // The time complexity is:
  // YOUR ANSWER HERE
  // O(n)
  // Where n equals the length of nums
  public static int computeProduct(int[] nums) {
    int total = 1;
    for(int num : nums) {
        total *= num;
    }
    return total;
  }

  // The time complexity is:
  // YOUR ANSWER HERE
  //O(n)
  // n is the length of nums
  public static void describeProduct(int[] nums) {
    System.out.println("About to compute the product of the array...");
    int product = computeProduct(nums);
    System.out.println("The product I found was " + product);
  }


  // The time complexity is:
  // YOUR ANSWER HERE
  // O(n)
  // Where n is the length
  public static int computeFactorial(int n) {
    int result = 1;
    for(int i = 1; i <= n; i++) {
        result *= n;
    }
    return result;
  }

  // Assume that the largest number is no bigger than the length
  // of the array
  //O(n)
  // n is the length and values of nums
  public static void computeAllFactorials(int[] nums) {
    for(int num : nums) {
        int result = computeFactorial(num);
        System.out.println("The factorial of " + num + " is " + result);
    }
  }


  // assume that each String is bounded by a constant length
  // The time complexity is:
  // YOUR ANSWER HERE
  //O(n)
  // contains is o(n) time complexity
  public static void checkIfContainedArrayList(ArrayList<String> arr, String target) {
    if (arr.contains(target)) {
        System.out.println(target + " is present in the list");
    } else {
        System.out.println(target + " is not present in the list");
    }
  }


  // assume n = wordsA.length = wordsB.length
  // assume that each String is bounded by a constant length
  // The time complexity is:
  // YOUR ANSWER HERE
  // O(n^2)
  // Where n is the length of arr words
  public static boolean containsOverlap(String[] wordsA, String[] wordsB) {
    for(String wordA : wordsA) {
        for(String wordB : wordsB) {
            if(wordA.equals(wordB)) {
                return true;
            }
        }
    }
    return false;
  }

  // assume that each String is bounded by a constant length
  // The time complexity is:
  // YOUR ANSWER HERE
  //O(N)
  // .add is O(1) .contains is O(N) 
  public static boolean containsOverlap2(String[] wordsA, String[] wordsB) {
    Set<String> wordsSet = new HashSet<>();
    for(String word : wordsA) {
        wordsSet.add(word);
    }

    for(String word : wordsB) {
        if(wordsSet.contains(word)) {
            return true;
        }
    }

    return false;
  }

  // The time complexity is:
  // YOUR ANSWER HERE
  // O(n)
  // Where n is length of chars
  public static void printCharacters(char[] chars) {
    for (int i = 0; i < chars.length; i++) {
      char character = chars[i];
      System.out.println("The character at index " + i + " is " + character);
    }
  }
  // The time complexity is:
  // YOUR ANSWER HERE
   //O(1)
 //Returns the same time complexity value everytime, because (a) and (b) will always be a constant value.
  public static double computeAverage(double a, double b) {
    return (a + b) / 2.0;
  }

  // assume that each String is bounded by a constant length
  // The time complexity is:
  // YOUR ANSWER HERE
   //O(1)
 //Because (.contains) returns a time complexity of O(1) and the target will always be a constant value, also a O(1) complexity
  public static void checkIfContainedHashSet(HashSet<String> set, String target)
  {
    if (set.contains(target)) {
      System.out.println(target + " is present in the set");
    } else {
      System.out.println(target + " is not present in the set");
    }
  }

  // emailLookup attempts to find the email associated with a name.
  // The name at index i of names corresponds to the email at index i of emails
  // A queryName is given, and this method returns the corresponding email if it is found
  // Otherwise, it returns "Person not found"
  // assume that each String is bounded by a constant length
  // What is the time complexity of this method?
  // YOUR ANSWER HERE
  //O(n) 
//Because the size of how many names and emails can differ, causing the code to check each and every element, making it scale in size.
  public static String emailLookup(String[] names, String[] emails, String queryName) {
    for(int i = 0; i < names.length; i++) {
      if (names[i].equals(queryName)) {
        return emails[i];
      }
    }
    return "Person not found";
  }

  // Suppose that emailLookupEfficient performs the same task as emailLookup
  // However, instead of two arrays it is passed a map where the
  // keys are names and the values are emails.
  // Write this method to efficiently return the corresponding email or "Person not found" if appropriate
  // assume that each String is bounded by a constant length
  // What is the time complexity of your solution?
  // YOUR ANSWER HERE
  // O(1) 
  // get is an o(1) time complexity.
  public static String emailLookupEfficient(HashMap<String, String> namesToEmails, String queryName) {
    String result = namesToEmails.get(queryName);

    if(result == null){
      result = "Person not found.";
    }
    
    return result;
  }

  // What is the time complexity of this method?
  // assume that each String is bounded by a constant length
  // (assume the set and list have the same number of elements)
  // YOUR ANSWER HERE
  // O(n^2)
  // because wordSet and wordList are the same size the act as n * n
  public static boolean hasCommon(HashSet<String> wordSet, ArrayList<String> wordList) {
    for(String word : wordSet) {
      if(wordList.contains(word)) {
        return true;
      }
    }
    return false;
  }
  // Rewrite hasCommon so it does the same thing as hasCommon, but with a better time complexity.
  // Do not change the datatype of wordSet or wordList.
  // assume that each String is bounded by a constant length
  // What is the time complexity of your new solution?
  // YOUR ANSWER HERE
  // O(n) 
  // swap operations now .contains is O(1) and the total is O
  public static boolean hasCommonEfficient(HashSet<String> wordSet, ArrayList<String> wordList) {
    for (String word : wordList) {
      if (wordSet.contains(word)) {
        return true;
      }
    }
    return false;
  }

  // Suppose you are building a dashboard that displays real-time stock prices.
  // You want to keep track of the current price of each stock, with the stock's ticker symbol as the key.
  // The prices will be updated frequently throughout the day, and you need to efficiently update
  // and access the current price for each stock. The order of the ticker symbols is not important.
  // What would be a good choice of data structure?
  // YOUR ANSWER HERE

  //HashMap 
  //The HashMap can store keys and values, making it easy to store the stocks and the ticker symbol.

  // Suppose you are building a music player application where users can create playlists.
  // Songs can be added to the end of the playlist in the order the user chooses, and the user can
  // skip to the next or previous song. Most operations involve adding songs and accessing them by
  // their position in the playlist.
  // What would be a good choice of data structure?
  // YOUR ANSWER HERE

  //List
  //The list can store and access by position. 

  // Suppose you are developing a search feature that keeps track of the user's
  // recent search queries. You want to store the queries in the order they were made,
  // so you can display them to the user for quick access. The number of recent searches is
  // relatively small, and it is more important to preserve the order of the searches than
  // to optimize for fast lookups or deletions.
  // What would be a good choice of data structure?
  // YOUR ANSWER HERE

  //HashMap
  //HashMap would allow for fast lookups and deletion with an O(1) time complexity.
}