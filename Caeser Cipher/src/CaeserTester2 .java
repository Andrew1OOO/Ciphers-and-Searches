
/**
 * Tester for Encryption and Decryption class's
 *
 * @Andrew
 * @9/28/19
 */
import java.util.Scanner;
public class CaeserTester2
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int shift = 26;
        String caeserAlphabet = "";
        String dCaeserAlphabet = "";
        String word = "";
        String code = "";
        String quit = "n";
        String type = "";
       while(quit.equalsIgnoreCase("n")){
         while(shift > 25){
        System.out.println("Shift for cipher?");
        shift = in.nextInt();
       }
       dCaeserAlphabet = Decryption2.cipherAlphabet(shift);
       caeserAlphabet = Encryption2.cipherAlphabet(shift);
       
       System.out.println("Alphabet: " + Encryption2.ALPHABET + "\nCeaser Alphabet: " + caeserAlphabet);
       
       System.out.println("\nDecrypt or Encrypt?");
       type = in.next();

      if(type.equalsIgnoreCase("Encrypt")){
        System.out.println("\nWhat word do you want to encrypt?");
        word = in.next();
        code = Encryption2.encrypt(word, shift);
        System.out.println("Encrypted word: " + code);
       }
      else{
       System.out.println("\nWhat word do you want to decrypt?");
       word = in.next();
       code = Decryption2.decrypt(word, shift);
       System.out.println("Decrypted word: " + code);
       
      }
        System.out.println("Do you want to quit?(y/n)");
        quit = in.next();
        shift = 26;
}
    }
}

