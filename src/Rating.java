import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Rating {

    public static void main(String[] args) {

        Scanner fileIn = null;
        ArrayList<FacultyMember> list = null;

        try {

            fileIn = new Scanner(new FileInputStream("src/ratings.txt"));

            Integer count = Integer.valueOf(fileIn.nextLine());

             list = new ArrayList<>(count);

            int yeaHH = 0;
            String line = null;
            FacultyMember newMember = null;
            Integer rating = null;
            while (fileIn.hasNextLine()) {


                if(yeaHH % 2 == 0) {
                    line = fileIn.nextLine();
                }
                else {

                    rating = Integer.valueOf(fileIn.nextLine());
                    newMember = new FacultyMember(line,1,rating);


                    if(list.contains(newMember)) {
                        int index = list.indexOf(newMember);
                        list.get(index).setCount(1);
                        list.get(index).setRatingSum(rating);
                    }
                    else {
                        list.add(newMember);
                    }
                }

                yeaHH++;

            }



        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        for (FacultyMember e: list) {
            System.out.println(e);

        }


        list.trimToSize();

        for (int i = 0; i < list.size() ; i++) {
            System.out.println("The average of " + list.get(i).getId() + " is " + list.get(i).getRatingSum()/list.get(i).getCount());
        }



    }

}
