package сourses.nailAlishev.StartJavaNeil.EqualsStringPool;

public class PereopredelenieMetodov {
    public static void main(String[] args) {
        Pepka tanya = new Pepka();
        tanya.age = 37;
        tanya.name = "Tatiana";
        Pepka dasha = new Pepka();
        dasha.age = 37;
        dasha.name = "Tatiana";

        System.out.println(tanya.equals(dasha));
        System.out.println(tanya.hashCode());
        System.out.println(dasha.hashCode());

    }
}

class Pepka {
    int age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pepka pepka = (Pepka) o;

        if (age != pepka.age) return false;
        return name != null ? name.equals(pepka.name) : pepka.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
  }
}
