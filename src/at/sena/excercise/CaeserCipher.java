package at.sena.excercise;

public class CaeserCipher {
    public static void main(String[] args) {
        String word = "Abc";
        int offset = 1;
        System.out.println(word);
        System.out.println("Encrypted Word: " + encryptedString(word, offset));
        System.out.println("Decrypted word: " + decryptedString(word, offset));
    }

    public static String encryptedString(String word, int offset){
        String ret = "";
        for(int i = 0; i < word.length(); i++){
            ret += encrypt(word.charAt(i), offset);
        }
        return ret;
    }
    public static char encrypt(char c, int offset){
        if ((int)c+offset > 122){
            return (char)((int)c + offset-26);
        }
        else{
            return (char)((int)c + offset);
        }
    }

    public static String decryptedString(String word, int offset) {
        String ret = "";
        for(int i = 0; i < word.length(); i++){
            ret += decrypt(word.charAt(i), offset);
        }
        return ret;
    }

    public static char decrypt(char c, int offset) {
        if ((int)c+offset > 122){
            return (char)((int)c - offset+26);
        }
        else {
            return (char)((int)c - offset);
        }
    }
}
