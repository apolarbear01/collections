import java.util.ArrayList;
import java.util.ListIterator;

public class Laura {

    ArrayList<Integer> list;


    public Laura(int suitorCount) {
        list = new ArrayList<Integer>(suitorCount);

            for (int i = 1; i <= suitorCount; i++) {
                list.add(i);
            }
    }

    public Laura(ArrayList<Integer> list) {
        this.list = list;
    }


    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public String toString() {

        for (Integer integer : list) {
            System.out.println(integer);
        }

        return "";
    }


    public void removeFifth() {

        ListIterator<Integer> listIterator =  list.listIterator();
        int count = 0;
            do {
                count++;
                listIterator.next();
                if (count % 5 == 0) listIterator.remove();
                if(!listIterator.hasNext()) listIterator = list.listIterator();

            }while (listIterator.hasNext() && list.size() != 1);


        }
}


