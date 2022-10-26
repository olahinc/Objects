public class Main {
    public static void main(String[] args) {
        Krolik krolik1= new Krolik(50, "Ziomek", true);
        krolik1.changeName("Lolek");
        System.out.println(krolik1.viewName());
    }

}
