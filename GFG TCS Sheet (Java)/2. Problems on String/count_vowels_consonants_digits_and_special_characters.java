/*
Given a string and the task is to count vowels, consonants, digits, and special characters in the string. 
Special characters also include white spaces.

Examples: 
Input : str = "geeks for geeks121"
Output : 
Vowels: 5
Consonants: 8
Digits: 3
Special Characters: 2

Input : str = " A1 B@ d  adc"
Output : 
Vowels: 2
Consonants: 4
Digits: 1
Special Characters: 6
*/

import java.util.*;

class count_vowels_consonants_digits_and_special_characters {
    static void getCount(String s) {
        int countVowels = 0, countConsonants = 0, countDigits = 0, countSpecial = 0;
        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                countDigits++;
            } else if ("aeiou".indexOf(ch) != -1) {
                countVowels++;
            } else if (Character.isLetter(ch)) {
                countConsonants++;
            } else {
                countSpecial++;
            }
        }

        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);
        System.out.println("Digits: " + countDigits);
        System.out.println("Special Characters: " + countSpecial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getCount(s);
    }
}
