package stringprograms;

import java.util.ArrayList;

public class CheckPlindrome {
    public static void main(String[] args) {

        String nodes[] ={"madam","sir","mam"};


        for (int i = 0; i <nodes.length ; i++) {
            boolean palindrome = CheckPlindrome.isPalindrome(nodes[i]);
            if(palindrome){
                System.out.println(nodes[i]);
            }

        }

    }
    static boolean isPalindrome(String input){

        String result="";
        for (int i = input.length()-1; i >=0 ; i--) {
            result = result + input.charAt(i);
        }
        if(result.equals(input)){
            return true;
        }
        else {
            return false;

        }

    }
}
