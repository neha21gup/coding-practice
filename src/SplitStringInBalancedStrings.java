/*Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings.
*/


public class SplitStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int balancedStrings = 0;

        if(s == null) return 0;

        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                lCount++;
            }
            if(s.charAt(i) == 'R'){
                rCount++;
            }

            System.out.println(lCount + ", "+ rCount);
            if(lCount == rCount){
                balancedStrings++;
            }
        }

        return balancedStrings;
    }
}
