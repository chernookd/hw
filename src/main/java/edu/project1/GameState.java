package edu.project1;


@SuppressWarnings("RegexpSinglelineJava")
public class GameState {
    private String hiddenWord;

    private final String theWord = "The word ";
    private char[] currentWord;

    private static String openLetters = "";
    private static final int ATTEMPS = 5;
    private int currentAttemp = 0;
    private boolean testFlag = false;

    public static int getATTEMPS() {
        return ATTEMPS;
    }

    public GameState(int currentAttemp, String hiddenWord, char[] currentWord, String openLetters, boolean test) {
        this.currentAttemp = currentAttemp;
        this.currentWord = currentWord;
        this.hiddenWord = hiddenWord;
        GameState.openLetters = openLetters;
        this.testFlag = test;

    }

    public GameState() {
    }

    public void setCurrentAttemp(int newCurrentAttemp) {
        this.currentAttemp = newCurrentAttemp;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public int getCurrentAttemp() {
        return this.currentAttemp;
    }

    public String getCurrentWordToString() {
        return new String(this.currentWord);
    }

    public String getOpenLetters() {
        return openLetters;
    }

    public char[] getCurrentWord() {
        return currentWord;
    }

    public void setup() {
        this.hiddenWord = RandomWord.getRandomString();
        this.currentWord = new char[this.hiddenWord.length()];
        for (int i = 0; i < this.hiddenWord.length(); i++) {
            this.currentWord[i] = '*';
        }
        System.out.println("if you want stop game write '!'");
    }

    public void checkState() {
        if (this.currentAttemp == ATTEMPS) {
            System.out.println("YOU LOST!");
            //LOGGER.info("LOSE!");
            hiddenWordPrint();
            if (!testFlag) {
                System.exit(0);
            }
        } else if (!GameActions.areInCurrentWordClosedLetters(this.currentWord)) {
            System.out.println("WIN!");
            //LOGGER.info("WIN!");
            if (!testFlag) {
                System.exit(0);
            }
        }
    }

    public void openLetter(char ch) {
        if (ch == '!') {
            System.exit(0);
        }
        if (this.hiddenWord.toLowerCase().contains(String.valueOf(ch).toLowerCase())
            && !openLetters.toLowerCase().contains(String.valueOf(ch).toLowerCase())) {
            for (int i = 0; i < this.currentWord.length; i++) {
                char low1 = Character.toLowerCase(this.hiddenWord.toCharArray()[i]);
                char low2 = Character.toLowerCase(ch);
                if (low1 == low2) {
                    this.currentWord[i] = ch;
                    openLetters += ch;
                }
            }
            checkState();
            hitPrint();
            currentWordPrint();
        } else {
            this.currentAttemp++;
            checkState();
            mistakeSout();
            currentWordPrint();
        }
    }

    public void mistakeSout() {
        System.out.println("Missed, mistake " + this.currentAttemp + " out of " + ATTEMPS);
        //LOGGER.info("Missed, mistake " + this.currentAttemp + " out of " + ATTEMPS);
    }

    public void hitPrint() {
        System.out.println("Hit!");
    }

    public void hiddenWordPrint() {
        System.out.println(theWord + this.hiddenWord);
        //LOGGER.info("The word " + this.hiddenWord);
    }

    public void currentWordPrint() {
        String str = new String(this.currentWord);
        System.out.println(theWord + str);
        //LOGGER.info("The word " + str);
    }
}
