package de.geek237.library.java_challenge;

public interface Challenge {
    /**
    Very simple, given an integer or a floating-point number, find its opposite.
     */
    int opposite(int number);

    /**
Your task is to create a function that does four basic mathematical operations. The
function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.
     */
    int basicMath(String op, int v1, int v2);

    /**
     * This code does not execute properly. Try to figure out why.
    a*b
     */
    double multiply(Double a, Double b) ;

    /**
     *We need a function that can transform a string into a number. What ways of achieving
     * this do you know?
     * Note: Don’t worry, all inputs will be strings, and every string is a perfectly valid represen-
     * tation of an integral number.
     */
    int stringToNumber(String str) ;

    /**
     *Consider an array/list of sheep where some sheep may be missing from their place.
     * We need a function that counts the number of sheep present in the array (true means present).
     * Hint: Don’t forget to check for bad values like null/undefined
     */
    int countSheeps(Boolean[] arrayOfSheeps) ;

    /**
     *Make a simple function called greet that returns the most-famous "hello world!".
     */
    String greet() ;

    /**
     Trolls are attacking your comment section!
     A common way to deal with this situation is to remove all of the vowels from the trolls’ com-
     ments, neutralizing the threat.
     Your task is to write a function that takes a string and return a new string with all vowels
     removed.
     For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
     Note: for this kata y isn’t considered a vowel.
     */
    String disemvowel(String str) ;

    /**
     *Given two integers a and b, which can be positive or negative, find the sum of all the
     * integers between and including them and return it. If the two numbers are equal return a or b.
     * Note: a and b are not ordered!
     */
    int GetSum(int a, int b);

    /**
     *Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010)
     * and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via
     * Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For
     * simplicity, you’ll have to capitalize each word, check out how contractions are expected to be
     * in the example below.
     * Your task is to convert strings to how they would be written by Jaden Smith. The strings
     *are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally
     * typed them.
     */
    String toJadenCase(String phrase);

    /**
     *Create a function that takes an integer as an argument and returns "Even" for even
     * numbers or "Odd" for odd numbers.
     */
    String even_or_odd(int number);
}
