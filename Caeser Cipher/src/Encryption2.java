
/**
 * Class to encrypt words using caeser cipher
 *
 * @Andrew Diab
 * @9/28/19
 */
public class Encryption2
{
    // instance variables - replace the example below with your own
    public final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

     public static String cipherAlphabet(int shift)
    {
        int x = ALPHABET.indexOf("a");
        String caeserAlphabet = "";
        if(x + shift <= 26 && x + shift >= 0){
            caeserAlphabet = ALPHABET.substring(x + shift);
        }
        else if(x + shift >= 26){
            caeserAlphabet = ALPHABET.substring((x + shift) - shift); 
        }
        caeserAlphabet = caeserAlphabet + (ALPHABET.substring(x, x + shift));
        
        return caeserAlphabet;
    }
    public static String encrypt(String word, int shift){
        String code = word.toLowerCase();
        String newWord = "";
        String caeserAlphabet = cipherAlphabet(shift);
        int index = 0;
        for(int i = 0; i < code.length(); i++){
            index = ALPHABET.indexOf(code.substring(i,i+1));
            newWord += caeserAlphabet.substring(index, index + 1);
        }
        return newWord;
    }
}

