import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SocialNetworkDemo {

    public static void main(String[] args) {


        HashMap<String,User> map = new HashMap<String, User>();

        Scanner fileIn = null;


            try {

                fileIn = new Scanner(new FileInputStream("src/file.txt"));


                while(fileIn.hasNextLine()) {

                    String userName = fileIn.next();

                    HashSet<User> users = new HashSet<User>();

                    User newUser = new User(userName,users);


                }

            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }


    }

}
