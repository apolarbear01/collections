import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumbers {


    public static void main(String[] args) {

        ArrayList<Integer> allNumbers = new ArrayList<>(99);


            for (int i = 2; i <= 100; i++) {
                allNumbers.add(i);
            }

        Iterator<Integer> i = allNumbers.iterator();


        System.out.println("ArrayList of integers at the start.");
            while(i.hasNext()) System.out.println(i.next());


        System.out.println("ArrayList of integers after that sleeping program.");


        Iterator<Integer> iteratorInteger = allNumbers.iterator();
        int count = 0;

                        while (allNumbers.size() -1 != count) {

                            Integer atHand = allNumbers.get(count);

                            if (isPrime(atHand)) {

                                while(iteratorInteger.hasNext()) {
                                    Integer temp = iteratorInteger.next();
                                    if (temp % atHand == 0 && !temp.equals(atHand)) iteratorInteger.remove();
                                }

                            }


                            count++;

                            iteratorInteger = allNumbers.iterator();


                        }

                        for (Integer current:
                             allNumbers) {
                            System.out.println(current);
                        }


    }

    public static boolean isPrime(Integer number) {

        if(number == 2)  return true;


        for(int i = 2 ; i < number ; i++) {

                if(number % i == 0) return false;
        }

            return true;
    }

}






