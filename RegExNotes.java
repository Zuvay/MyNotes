import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ex {
    public static void main(String[] args) {
        Pattern patern = Pattern.compile("BEY",Pattern.CASE_INSENSITIVE);
        Matcher bulucu = patern.matcher("beykoz");
        boolean icindevar = bulucu.find();
        if (icindevar){
            System.out.println("bulundu");
        }else{
            System.out.println("bulunamadı");
        }
        // |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
        // .	Find just one instance of any character
        // ^	Finds a match as the beginning of a string as in: ^Hello
        // $	Finds a match at the end of the string as in: World$
        // \d	Find a digit
        // \s	Find a whitespace character
        // \b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
        
        //         n+	Matches any string that contains at least one n
        // n*	Matches any string that contains zero or more occurrences of n
        // n?	Matches any string that contains zero or one occurrences of n
        // n{x}	Matches any string that contains a sequence of X n's
        // n{x,y}	Matches any string that contains a sequence of X to Y n's
        // n{x,}	Matches any string that contains a sequence of at least X n's


    }
}
