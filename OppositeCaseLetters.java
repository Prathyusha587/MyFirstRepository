import java.util.*;

public class OppositeCaseLetters {
    static public void main(String []g) {
    Inversion obj = new Inversion();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String userInput = sc.next();
    System.out.println("After inversion of letters ,the resultant string is: "+obj.convertCases(userInput));

    sc.close();
}
}
//another class for case inversion//
class Inversion {
    String convertCases(String string) {
         char []S = string.toCharArray();
        for(int k=0;k<S.length;k++) {
            if(Character.isAlphabetic(S[k])) {
                S[k]^=(1<<5);
            }
        
        }
        return String.valueOf(S);
    }
}
