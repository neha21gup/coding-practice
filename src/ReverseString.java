//Function that reverses a string. The input string is given as an array of characters char[].

public class ReverseString {
    public static void main(String[] args){
        //char[] s = new char[5];
        char[] s = {'h','e','l','l','o'};
        System.out.println(s);
        reverse(s);

        reverse(-2);
        System.out.println(getDigitCount(1));

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

    public static int reverse(int number){
        boolean flag = false;
        if(number < 0) {
            number = Math.abs(number);
            flag = true;
        }

        //System.out.println(number);
        int reversed = 0;
        while(number > 0){

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
            System.out.println(number);
            System.out.println(reversed);
        }

        if(flag)
            reversed = -reversed;
        System.out.println(reversed);
        return reversed;
    }

    public static int getDigitCount(int number){
        if(number < 0 ) return -1;
        int count = 0;
        while(number >= 0){
            number = number / 10;
            System.out.println(number);
            count++;
            break;
           // System.out.println(count);
        }
        return count;
    }
}
