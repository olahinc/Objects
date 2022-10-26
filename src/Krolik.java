public class Krolik {
    private int length;
    private String name;
    private boolean softness;

    Krolik(int lenght, String name, boolean softness) {
        this.length = lenght;
        this.name = name;
        this.softness = softness;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String viewName() {
        return name;
    }
    public void changeSoftness(boolean softness) {
        this.softness = softness;
    }
    public boolean viewSoftness () {
        return softness;
    }

    public void changeLength(int length) {
        this.length=length;
    }
    public int viewLength(){
        return length;
    }
    public double convert(int lenght) {
        double cale=length*2.54;
        return cale;
    }

}
