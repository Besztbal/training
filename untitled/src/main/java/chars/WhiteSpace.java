package chars;

public class WhiteSpace {

    public String makeWhitespaceToStar(String text){

        String newString="";

        char[] letters=text.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (!Character.isAlphabetic(text.charAt(i))&&!Character.isDigit(text.charAt(i))){
                letters[i]='*';
            }
        }

        return newString = new String(letters);

    }

    public static void main(String[] args) {
        WhiteSpace whiteSpace=new WhiteSpace();

        System.out.println(whiteSpace.makeWhitespaceToStar("My name is Balazs!"));
    }

}
