package AdapterPattern;


//because of this adapter we reused the functionality written by pilotPen
public class PenAdapter implements Pen{

    PilotPen pilotPen = new PilotPen();


    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
