public class Krolik {
    private int length;
    private String name;
    private boolean softness;

    Krolik(int lenght, String name, boolean softness) {
        this.length=lenght;
        this.name=name;
        this.softness=softness;
    }
    public void changeName(String name) {
        this.name=name;
    }
    public String viewName () {
        return name;
    }
}
