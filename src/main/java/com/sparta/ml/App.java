package com.sparta.ml;


public class App {
    public static void main(String [] args) {
        String palindromeWord = "rotator";
        boolean flag = true;

        palindromeWord = palindromeWord.toLowerCase();
        for(int i = 0; i < palindromeWord.length()/2; i++){
            if(palindromeWord.charAt(i) != palindromeWord.charAt(palindromeWord.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Your word is a palindrome");
        else
            System.out.println("Your word is not a palindrome");
    }
}
