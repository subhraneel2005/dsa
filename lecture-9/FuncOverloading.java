
public class FuncOverloading {

    public static void main(String[] args) {
        func1(10);
        func1("lord subhraneel");
    }

    static int func1(int num) {
        System.out.println(num);
        return num;
    }

    static String func1(String name) {
        System.out.println("Hello " + name);
        return name;
    }

    // we can only declare a function with the same name when their parameters are different, if not then we cant, and this is known as function overloading
}
