import java.util.HashMap;
import java.util.Iterator;

public class Name  {

    private String name;
    private Integer numberGirls;
    private Integer numberBoys;


    public Name(String name, Integer numberGirls, Integer numberBoys) {
        this.name = name;
        this.numberGirls = numberGirls;
        this.numberBoys = numberBoys;
    }

    public Name(String name, Integer numberGirls) {
        this.name = name;
        this.numberGirls = numberGirls;
        this.numberBoys = 0;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberGirls() {
        return numberGirls;
    }

    public void setNumberGirls(Integer numberGirls) {
        this.numberGirls = numberGirls;
    }

    public Integer getNumberBoys() {
        return numberBoys;
    }

    public void setNumberBoys(Integer numberBoys) {
        this.numberBoys = numberBoys;
    }


    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", numberGirls=" + numberGirls +
                ", numberBoys=" + numberBoys +
                '}';
    }
}
