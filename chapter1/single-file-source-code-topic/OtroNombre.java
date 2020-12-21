public class HelloWorld {
    public static void main(String[] args) {
        String nombre = "";
        if (args.length > 0) {
            nombre = args[0];
        }
        System.out.println("Hello World " + nombre);
    }
}
