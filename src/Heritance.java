
abstract class DummyClass {
    public abstract void printThings();

    public void sayHi() {

        System.out.println("hi<3");
    }

}

interface DummyInterface {
    public int r = 143; // as finale variable.

    public void printJ();


}

class function extends DummyClass implements DummyInterface {

    public void printThings() {
        System.out.println("wow,its pretty cool");
    }

    public void printJ() {
        System.out.println("here is j!");
    }
}

public class Heritance {
    public static void main(String[] args) {
        function k = new function();
        k.printThings();
        k.sayHi();
        k.printJ();
        // function.r=12;     error
        System.out.println(DummyInterface.r);
    }


}
