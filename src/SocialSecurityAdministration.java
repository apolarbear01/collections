import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class SocialSecurityAdministration {


    public static void main(String[] args) {

 /*       HashSet<String> girlsandboys = new HashSet<>();
        Scanner fileIn = null;

        ArrayList<String> commonNames = new ArrayList<>();

        try {
            fileIn = new Scanner(new FileInputStream("girlnames.txt"));

            while(fileIn.hasNextLine()) {
                String name = fileIn.next();
                Integer number = fileIn.nextInt();
                girlsandboys.add(name);
            }

            fileIn.close();

            fileIn = new Scanner(new FileInputStream("boynames.txt"));

            while(fileIn.hasNext()) {
                String name = fileIn.next();
                Integer number = fileIn.nextInt();

                if(girlsandboys.contains(name)) {
                            commonNames.add(name);
                    }

            }

            fileIn.close();

                System.out.println("Common names");
                for(String commons : commonNames)
                    System.out.println(commons);

        }
        catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }*/


        HashMap<String,Name> map = new HashMap<String, Name>();
        Scanner fileInput = null;
        ArrayList<Name> commonNameSet = new ArrayList<>();



            try {
                fileInput = new Scanner(new FileInputStream("girlnames.txt"));

                while (fileInput.hasNext()) {
                    String name = fileInput.next();
                    Integer number = fileInput.nextInt();
                    Name object = new Name(name,number);
                        map.put(name,object);


                }

                fileInput.close();

                fileInput = new Scanner(new FileInputStream("boynames.txt"));

                while (fileInput.hasNext()) {
                    String name = fileInput.next();
                    Integer number = fileInput.nextInt();

                    if(map.containsKey(name)) {

                        Name object = new Name(name, map.get(name).getNumberGirls(),number);

                        commonNameSet.add(object);
                    }

                }
                fileInput.close();


                Iterator<Name> i = commonNameSet.iterator();


                    while (i.hasNext()) {
                        System.out.println(i.next());
                    }


            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }







    }

}
