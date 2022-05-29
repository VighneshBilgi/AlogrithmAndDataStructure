package algorithmanddatastructure;

import java.util.Arrays;

public class Anagram {

    public static void isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static void main(String[] args) {

        Anagram anagram = new Anagram();

        anagram.isAnagram("earth","heart");
        anagram.isAnagram("abcd","dcba");
        anagram.isAnagram("brush","shrub");
        anagram.isAnagram("cat","dog");
    }
}
