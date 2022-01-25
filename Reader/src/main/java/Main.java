import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*FileInputStream in;
        FileOutputStream out;
        in = new FileInputStream("ProgrammingHistory.txt");
        out = new FileOutputStream("out.txt");
         int c;
        while((c = in.read()) != -1){
            out.write(c);
            out.write(c+1);
        }



        String addtoFile = "\rAdding another line";
        byte[] addding = addtoFile.getBytes();
        for(byte b : addding){
            out.write(b);
        }*/

        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            //System.out.println("Just read: "+line);
            lines.add(line);
        }
        br.close();

        /*for(String s : lines){
            //System.out.println(s);
        }*/

        FileWriter fw = new FileWriter("out.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //bw.write("Writing to out File\r");

        /*for(String s : lines){
            bw.write(s+"\r");
        }*/
        for(String s : lines){
            if(s.equals("")) {

            } else{
                    for (int c = 0; c < s.length(); c++) {

                        if ((s.charAt(c) == '.')) {
                            if (((c + 1) == s.length())) {
                                bw.write(s.charAt(c) + "\r");
                            } else if ((s.charAt(c + 1) == ' ')) {
                                bw.write(s.charAt(c) + "\r");
                            } else if ((s.charAt(c + 1) == '[')) {
                                bw.write(s.charAt(c));
                            } else {
                                bw.write(s.charAt(c));
                            }
                        } else if (s.charAt(c) == ' ') {
                            if (c - 1 > -1) {
                                if (s.charAt(c - 1) == '.') {

                                } else if (c - 4 > -1) {
                                    if (s.charAt(c - 4) == '.' && s.charAt(c - 1) == ']' && s.charAt(c) == ' ') {

                                    } else {
                                        bw.write(s.charAt(c));
                                    }
                                } else {
                                    bw.write(s.charAt(c));
                                }
                            } else {
                                bw.write(s.charAt(c));
                            }

                        } else if(s.charAt(c) == ']'){
                            if (c - 3 > -1) {
                                if (s.charAt(c - 3) == '.') {
                                    if(!(c+1 >= s.length())) {
                                        bw.write(s.charAt(c) + "\r");
                                    } else {
                                        bw.write(s.charAt(c));
                                    }
                                } else {
                                    bw.write(s.charAt(c));
                                }
                            } else {
                                bw.write(s.charAt(c));
                            }
                        } else {
                            bw.write(s.charAt(c));
                        }
                    }
                }
            }
        bw.close();

        ArrayList<String> sentences = new ArrayList<>();
        FileReader fr2 = new FileReader("out.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        while ((line = br2.readLine()) != null){
            sentences.add(line);
            System.out.println(line+"\r");
        }
        br2.close();

        System.out.println("What word are you searching for?");
        Scanner scanner = new Scanner(System.in);
        String findthis = scanner.nextLine();

        int found = 0;
        for(String s : sentences){
            if(s.length() < findthis.length()){
                System.out.println("That search is too long!");
            } else if(findthis.equals("")){
                System.out.println("You are searching for nothing!");
            } else if(searcher(findthis,s)){
                        for(int p = 0; p < s.length()-findthis.length(); p++) {
                        boolean g = true;
                        for (int q = 0; q < findthis.length(); q++){
                            boolean i = true;
                            for(int r = 0; r < findthis.length(); r++) {
                                if(findthis.charAt(r) == s.charAt(p+r)){
                                    g = g && true;
                                } else{
                                    g = g && false;
                                }
                            }

                        }
                            if(g){
                                System.out.println("Found at sentence: "+Math.addExact(sentences.indexOf(s),1)+" At position: "+Integer.toString(p+1));
                                found++;
                            }
                    }

                }

        }
        if(found > 0){

        } else{
            System.out.println("None found");
        }

    }
    private static boolean searcher(String s,String t){
        if(s.length() > t.length()){
            return false;
        } else if(s.equals("")){
            return false;
        }
        else{
            boolean h = false;
            for(int p = 0; p < t.length()-s.length(); p++) {
                boolean g = true;
                for(int q = 0; q < s.length(); q++) {
                    if(s.charAt(q) == t.charAt(p+q)){
                        g = g && true;
                    } else{
                        g = g && false;
                    }
                }
                h = h || g;
            }
            return h;
        }
    }
}
