import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        StringBuilder sb = new StringBuilder();

         for(int i = 0; i < text.length(); i++){
             char c = text.charAt(i);

             if (c >= 'a' && c <= 'm'){
                    c += 13;
             } else if (c >= 'A' && c <= 'M'){
                    c += 13;
             } else if (c >= 'n' && c <= 'z'){
                    c -= 13;
            } else if (c >= 'N' && c <= 'Z') {
                    c -= 13;
            }
            sb.append(c);

         }

         return sb.toString();
        }
    }

    public String encrypt(String text) {

        return crypt(text);
    }

    public String decrypt(String text) {

        return crypt(text);
    }

    public static String rotate(String s, Character c) {

        int startIndex = s.indexOf(c);
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(startIndex, s.length()));
        sb.append(s.substring(0, startIndex));
        return sb.toString();


//        String sonnet18 = "Shall I compare thee to a summer’s day?\n" +
//                "Thou art more lovely and more temperate:\n" +
//                "Rough winds do shake the darling buds of May,\n" +
//                "And summer’s lease hath all too short a date;\n" +
//                "Sometime too hot the eye of heaven shines,\n" +
//                "And often is his gold complexion dimm'd;\n" +
//                "And every fair from fair sometime declines,\n" +
//                "By chance or nature’s changing course untrimm'd;\n" +
//                "But thy eternal summer shall not fade,\n" +
//                "Nor lose possession of that fair thou ow’st;\n" +
//                "Nor shall death brag thou wander’st in his shade,\n" +
//                "When in eternal lines to time thou grow’st:\n" +
//                "   So long as men can breathe or eyes can see,\n" +
//                "   So long lives this, and this gives life to thee.\n";
//
//                public String cryptSonnet (String sonnet ) {
//            return crypt(sonnet18);
    }

}
