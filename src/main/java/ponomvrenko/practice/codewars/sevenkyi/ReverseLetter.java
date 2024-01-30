package ponomvrenko.practice.codewars.sevenkyi;

/**
 * Task
 * Given a string str, reverse it and omit all non-alphabetic characters.
 *
 * Example:
 * For str = "krishan", the output should be "nahsirk".
 *
 * For str = "ultr53o?n", the output should be "nortlu".
 *
 * Input/Output:
 * [input] string str
 * A string consists of lowercase latin letters, digits and symbols.
 *
 * [output] a string
 */

public class ReverseLetter {
    public static String reverseLetter(final String str) {
      StringBuilder builder = new StringBuilder();
      for (char ch : str.toCharArray()) {
        if (ch >= 65 && ch <= 122) {
          builder.append(ch);
        }
      }
      return builder.reverse().toString().toLowerCase();
    }
}