import java.util.*;

public class SortVector {

    public static void main(String[] args) {

        Vector<String> sentence = new Vector<>();

        System.out.println("What did you eat for the dinner?");
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();


        StringTokenizer tokenizer = new StringTokenizer(line);


            while(tokenizer.hasMoreTokens()) {
                sentence.add(tokenizer.nextToken());
            }


        Collections.sort(sentence);


                for(String e : sentence)
                    System.out.print(e + " ");

        System.out.println();


    }
}
