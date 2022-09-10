package AdapterPattern;

public class Assignment {

    Pen p;
    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignment(String s){
        System.out.println("Finished writing assignment"+s);
    }
}
