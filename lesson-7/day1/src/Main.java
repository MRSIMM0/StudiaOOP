import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution{

    private List<String> strings;

    public Solution(List<String> strings) {
        this.strings = strings;
    }

    public int caloricCounter(){
        final List<Integer> sums = new ArrayList<>();
        final int[] sum = {0};
        strings.forEach(s->{
            if(s.length()==0){
                sums.add(sum[0]);
                sum[0] = 0;
            }else{
                sum[0] +=Integer.valueOf(s);
            }
        });

        return Collections.max(sums);
    }

}

public class Main {




    public static void main(String[] args) {

        Path path = Paths.get("./lesson-7/day1/src/input.txt");

        try {
            List<String> read = Files.readAllLines(path);
            System.out.println(new Solution(read).caloricCounter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}