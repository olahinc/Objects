public class Main {
    public static void main(String[] args) {
        Krolik krolik1= new Krolik(50, "Ziomek", true);
        krolik1.changeName("Lolek");
        System.out.println(krolik1.viewName());
        krolik1.changeSoftness(false);
        System.out.println(krolik1.viewSoftness());
        krolik1.changeLength(30);
        System.out.println(krolik1.viewLength());
        System.out.println(krolik1.convert(krolik1.viewLength()));
    }

}
