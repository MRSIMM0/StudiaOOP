import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.*;


interface Game {

    Shiritori play(String World) throws IOException;

    Shiritori restart();

    String printWords();

    boolean gameStatus();
}

final class Shiritori implements Game {

    private final String validationUrl = "https://api.dictionaryapi.dev/api/v2/entries/en/";
    private final List<String> words;

    private final boolean gameOver;

    public Shiritori() {
        this.words = new ArrayList<>();
        this.gameOver = false;
    }

    private Shiritori(boolean gameOver, List<String> words) {
        this.words = words;
        this.gameOver = gameOver;
    }


    @Override
    public Shiritori play(String word){
        if(gameOver){
            System.out.println("You cannot play because game is already over");
            return this;
        }
        try {
            if(!wordValidation(word)){
                System.out.println("Word does not exist");
                return this;
            }
        } catch (IOException e) {
            System.out.println("Http request failed. You have to check word validation yourself");
        }
        String lastWord = this.words.size() > 0 ? this.words.get(this.words.size()-1):word;
        char firstChar = word.toCharArray()[0];
        char lastChar = lastWord.toCharArray()[lastWord.length()-1];
        if( firstChar != lastChar ){
            System.out.println(String.format("%s does not start with %c",word,lastChar));
            return new Shiritori(true,this.words);
        }
        List<String> newList = new ArrayList<>(this.words);

        newList.add(word);
        return new Shiritori(false,newList);


    }

    @Override
    public Shiritori restart() {
        return new Shiritori();
    }

    @Override
    public String printWords() {

        StringBuilder builder = new StringBuilder();
        final int[] index = {1};
        this.words.stream().forEach(word -> {
            builder.append(String.format("%d. %s \n", index[0],word));
            index[0]++;
        });

        return builder.toString();
    }

    private boolean wordValidation(String world) throws IOException {
        String url = new StringBuilder(validationUrl).append(world).toString();

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();

        return responseCode != 404;
    }

    @Override
    public boolean gameStatus() {
        return this.gameOver;
    }
}


public class Main {
    public static void main(String[] args) {
        Shiritori game = new Shiritori();
        while (!game.gameStatus()){
            System.out.println("Choose action:\n1.Add World\n2.Print Words\n3.Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){

                case (1):{
                    Scanner word = new Scanner(System.in);
                    game = game.play(word.next());
                    System.out.println(game.printWords());
                }
                case (2):{
                    System.out.println(game.printWords());
                }
                case (3):{

                } default:{
                    System.out.println("Invalid option");
                }

            }
        }
    }
}