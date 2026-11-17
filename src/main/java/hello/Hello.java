package hello;

/** A first class, so the build has something to compile. Feel free to delete it later. */
public class Hello {
    public static String greeting(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting("world"));
    }
}
