
/**
 * used to decyrted words using the caeser cipher
 *
 * @Andrew Diab
 * @9/28/19
 */
public class Decryption2
{
    // instance variables - replace the example below with your own

     public static String cipherAlphabet(int shift)
    {
        int x = Encryption2.ALPHABET.indexOf("a");
        String ceaserAlphabet = "";
        if(x + shift <= 26 && x + shift >= 0){
            ceaserAlphabet = Encryption2.ALPHABET.substring(x + shift);
        }
        else if(x + shift >= 26){
            ceaserAlphabet = Encryption2.ALPHABET.substring((x + shift) - shift); 
        }
        ceaserAlphabet = ceaserAlphabet + (Encryption2.ALPHABET.substring(x, x + shift));
        return ceaserAlphabet;
    }
    public static String decrypt(String word, int shift){
        String code = word.toLowerCase();
        String newWord = "";
        String ceaserAlphabet = cipherAlphabet(shift);
        int index = 0;
        for(int i = 0; i < code.length(); i++){
            index = ceaserAlphabet.indexOf(code.substring(i,i+1));
            newWord += Encryption2.ALPHABET.substring(index, index + 1);
        }
        return newWord;
    }
}

