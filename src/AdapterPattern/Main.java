package AdapterPattern;

//Pen Adapter made use of pilot pen internally to write
//Because of adapter we re-used the functionality of writing which is already written by pilotpen


//In the Java API, one can find java.io.InputStreamReader and java.io.OutputStreamWriter as examples of the adapter pattern

public class Main {

    public static void main(String[] args) {

        Assignment assignment= new Assignment();
        PenAdapter penAdapter = new PenAdapter();
        assignment.setP(penAdapter);

        assignment.writeAssignment("HAI from main");


    }
}
