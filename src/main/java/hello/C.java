package hello;

public class C extends B {
    C()
    {
        super(10);
        System.out.println("from C");
    }
    C(int x)
    {
        super();
        System.out.println(x);
    }

    public static void main(String[] args) {
        new C();
        new C(10);
    }
}
