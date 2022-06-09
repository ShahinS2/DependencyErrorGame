package game;

public class Game {
    String word_to_guess;
    int attempt = 10;
    
    Game(WordChoser choser){
        word_to_guess = choser.getRandomWordFromDictionary();
    }

    public String getWordToGuess(){
        StringBuilder sb = new StringBuilder(word_to_guess);
        sb.replace(1, word_to_guess.length(), "_".repeat(word_to_guess.length()-1));
        String result = sb.toString();
        return result;
    }

    public int getRemainingAttempt(){
        return attempt;
    }

}
