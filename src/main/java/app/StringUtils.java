package app;

public class StringUtils {

    public static String reverse(String input){

        if(input == null) return null;
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length -1;

        while (left< right){
            char tmp = chars[left];
            chars[left] = chars [right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);

    }

    public static boolean isPalindrome(String input){
     if(input == null) return false;

     String normalized = input.toLowerCase().replace(" ","");
     int left = 0;
     int right = normalized.length() -1;

     while (left<right){
         if (normalized.charAt(left)!= normalized.charAt(right)){
             return false;
         }
         left ++;
         right--;
     }
     return false;

    }

}

