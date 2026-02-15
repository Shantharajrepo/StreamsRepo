package stringprograms;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input="jnfejfnemfnnfnejnfnj";

        int freq[]=new int[128];

        for (int i = 0; i < input.length(); i++) {

            freq[input.charAt(i)]++;

            }

//        for(int num:freq){
//            System.out.println(num);
//        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==1)
            {
                System.out.println("FirstNonRepeatingCharacter :" +(char) i);
                break;
            }

        }


    }
}
