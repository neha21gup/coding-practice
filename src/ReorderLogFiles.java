import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.isDigit;

public class ReorderLogFiles {
    public static String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (log1, log2) -> {
            System.out.println(log1.length() + ", "+ log2.length());
            System.out.println(log1.charAt(0)+ ", "+ log2.charAt(0));
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = isDigit(split1[1].charAt(0));
            boolean isDigit2 = isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        for(int i =0; i< logs.length; i++){
            System.out.println(logs[i]);
        }
        return logs;
    }

    public static String[] reorder(String[] logs){


        ArrayList<String> letters = new ArrayList<>();
        ArrayList<String> digits = new ArrayList<>();

        for(String words : logs){

            String[] splitted = words.split(" ", 2);
            if(isDigit(splitted[1].charAt(0))){
                digits.add(words);
            }
            else {
                letters.add(words);
            }
        }

        letters.sort((o1,o2) ->{
            String s1 = o1.substring(o1.indexOf(" ")+1);
            String s2 = o2.substring(o2.indexOf(" ")+1);

            return s1.equals(s2) ? o1.compareTo(o2) : s1.compareTo(s2);
        });

        String[] finalList = new String[letters.size() + digits.size()];
        int index = 0;

        for(String s : letters){
            finalList[index] = s;
            System.out.println(finalList[index]);
            index++;
        }
        for(String s : digits){
            finalList[index] = s;
            System.out.println(finalList[index]);
            index++;
        }


        return finalList;
    }

    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        //reorderLogFiles(logs);
        reorder(logs);

    }

}
