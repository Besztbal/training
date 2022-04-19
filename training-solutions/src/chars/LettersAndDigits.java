package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {

        char[] letters=text.toCharArray();

        for (Character c:letters) {
            if (Character.isAlphabetic(c)){
                System.out.println(c + ": betű");
            } else if(Character.isDigit(c)){
                System.out.println(c+ ": szám");
            } else {
                System.out.println(c + ": egyéb");
            }


        }
    }

    public static void main(String[] args) {

        LettersAndDigits lettersAndDigits=new LettersAndDigits();
        String text= "bfa68fF;X";

        lettersAndDigits.printLetterOrDigit(text);


    }
}
