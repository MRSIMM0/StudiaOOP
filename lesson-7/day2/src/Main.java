import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


class Solution {

    private List<String> strings;


    Map<String,Integer> movesValue = new HashMap<String,Integer>(){{
        put("X",1);
        put("Y",2);
        put("Z",3);
    }};

    private int getResultPoints(String opponentMoves,String myMoves){

        switch (opponentMoves){
            case "A":
                switch (myMoves){
                    case "Y":
                        return 6;

                    case "X":
                        return 3;
                    default:
                        return 0;
                }

            case "B":
                switch (myMoves){
                    case "Z":
                        return 6;
                    case "Y":
                        return 3;
                    default:
                        return 0;
                }
            case "C":
                switch (myMoves){
                    case "X":
                        return 6;
                    case "Z":
                        return 3;
                    default:
                        return 0;
                }
            default:
                return 0;

        }
    }

    public Solution(List<String> strings) {
        this.strings = strings;
    }

    public int obtainTotalScore(){

        final int[] totalSum = {0};

        strings.forEach(s->{
            var moves = s.split(" ");

            totalSum[0] +=getResultPoints(moves[0],moves[1]);
            totalSum[0] += movesValue.get(moves[1]);

        });

        return totalSum[0];
    }

}

public class Main {




    public static void main(String[] args) {

        Path path = Paths.get("./lesson-7/day2/src/input.txt");

        try {
            List<String> read = Files.readAllLines(path);
            System.out.println(new Solution(read).obtainTotalScore());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}