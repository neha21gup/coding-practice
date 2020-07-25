//Given a string, find the length of the longest substring with repeating characters.

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        //System.out.println(lengthOfLongestSubstringRepeatinngChars(s));
        System.out.println(lengthOfLongestSubstringNonRepeatinngChars(s));
    }

    public static int lengthOfLongestSubstringRepeatinngChars(String s) {
        int tempCount = 1, finalCount = 1;

        if(s.length()==0) return 0;
        System.out.println(s.length());
        for(int i = 0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                tempCount++;
               System.out.println(tempCount);
            }
            if(s.charAt(i)!=s.charAt(i+1) ){
                if(tempCount > finalCount){
                    finalCount=tempCount;
                }
                tempCount = 1;
            }
        }
        finalCount=tempCount;
        return finalCount;
    }


    //##Not done the way question says ###
    public static int lengthOfLongestSubstringNonRepeatinngChars(String s) {
        int tempCount = 1, finalCount = 1;

        if(s.length()==0) return 0;
        System.out.println(s.length());
        for(int i = 0; i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                tempCount++;
                System.out.println(tempCount);
            }
            if(s.charAt(i)==s.charAt(i+1) ){
                if(tempCount > finalCount){
                    finalCount=tempCount;
                }
                tempCount = 1;
            }
        }
        finalCount=tempCount;
        return finalCount;
    }
}
