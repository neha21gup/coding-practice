//Function that reverses a string. The input string is given as an array of characters char[].

public class ReverseString {
    public static void main(String[] args){
        //char[] s = new char[5];
        char[] s = {'h','e','l','l','o'};
        System.out.println(s);
        reverse(s);

    }

    public static void reverse(char[] s){
        int j = s.length-1;
        for(int i = 0; i < j; i++){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;

            j--;
        }
        System.out.println(s);
    }
}
