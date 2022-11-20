public class Passby {

    private String name;

    public Passby(String name) {
        this.name = name;
    }

    public Passby() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Passby obj = new Passby("Hasan");

            Passby.function(obj);
        System.out.println(obj.getName());
            Passby.function2(obj);
        System.out.println(obj.getName());

    }



    public static void function(Passby object) {
        Passby newObject = new Passby("Kiraz");
        object = newObject;
    }



    public static void function2(Passby object) {
        object.setName("Kiraz");
    }

}
