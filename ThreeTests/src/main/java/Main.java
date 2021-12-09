import java.util.Scanner;
public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        //TODO
        int leng = s.length();
        int count = 0;
        for (int testedchara = 0; testedchara < leng; testedchara++) {
            if(s.charAt(testedchara) == 'a' || s.charAt(testedchara) == 'e' || s.charAt(testedchara) == 'i' || s.charAt(testedchara) == 'o' || s.charAt(testedchara) == 'u'){
                count++;
            }
        }
        return count;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        //TODO
        int leng = s.length();
        int bobbers = 0;
        for (int testedcharb = 1; testedcharb < leng-1; testedcharb++) {
            if(s.charAt(testedcharb - 1) == 'b' && s.charAt(testedcharb) == 'o' && s.charAt(testedcharb + 1) == 'b'){
                bobbers++;
            }
        }
        return bobbers;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        int leng = s.length();
        String longest = "";
        String current = ""+s.charAt(0);
        for (int testedcharc = 0; testedcharc < leng-1; testedcharc++) {
             boolean alph = s.charAt(testedcharc) <= s.charAt(testedcharc+1);
             
             if(alph){
                current = current + s.charAt(testedcharc+1);
             }else {
                 current = "" + s.charAt(testedcharc+1);
             }
             if(current.length() > longest.length()){
                 longest = current;
             } else {
                 //do nothing
             } 
        }
        return longest;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        
        System.out.println("Which starter do you pick?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(problemOne(s));
        System.out.println(problemTwo(s));
        System.out.println(problemThree(s));
    }
}