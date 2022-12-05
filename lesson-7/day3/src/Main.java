import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


class Solution {

    private List<String> strings;





    public Solution(List<String> strings) {
        this.strings = strings;
    }

    public int obtainTotalValue(){

        List<Character> values = new LinkedList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            values.add(c);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            values.add(c);
        }
        final int[] total = {0};
        strings.forEach(s->{
            int middle = s.length()/2;

            String firstHalf = s.substring(0,middle);
            String secondHalf = s.substring(middle,s.length());
            List<Character> visited = new LinkedList<>();
            for (char f : firstHalf.toCharArray()){
                for(char sec: secondHalf.toCharArray()){
                    if(f==sec && !visited.contains(f)){
                        total[0] +=values.indexOf(f)+1;
                        visited.add(f);
                        break;
                    }
                }
            }

        });

    return total[0];
    }

}

public class Main {




    public static void main(String[] args) {

        Path path = Paths.get("./lesson-7/day3/src/input.txt");

        try {
            List<String> read = Files.readAllLines(path);
            System.out.println(new Solution(read).obtainTotalValue());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}