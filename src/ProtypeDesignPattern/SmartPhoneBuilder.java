package ProtypeDesignPattern;

//https://www.studytonight.com/java-examples/how-to-make-a-deep-copy-of-an-object-in-java
//https://levelup.gitconnected.com/a-look-at-the-prototype-design-pattern-3e4032b072d2
//Clone create a object with same data with new reference but internal object has same reference
//inorder to have different reference we need to implement clone in child objects also...see implementation in smartphone class
public class SmartPhoneBuilder {
    public static void main(String[] args) throws CloneNotSupportedException {

        SmartPhone note10 = new Samsung("Note10",new User("Niha Note10"));
        SmartPhone iphoneX = new Apple("iPhoneX",new User("Niha iphoneX"));

        System.out.println(note10);
        System.out.println(iphoneX);


        System.out.println("=== Products for VIPs ===");

        SmartPhone note10GoldVips = note10.clone();
        note10GoldVips.setAdditionalPrice(50);
        note10GoldVips.setModel("note10GoldVips");
        note10GoldVips.getUser().setName("Changed name");

        System.out.println("***********************************");
        System.out.println(note10);
        System.out.println(note10GoldVips);
        System.out.println("***********************************");

        SmartPhone iphoneX128Vips = iphoneX.clone();
        iphoneX128Vips.setAdditionalPrice(100);
        System.out.println(iphoneX128Vips);

        System.out.println("=== Products for Students ===");

        SmartPhone note10Students = note10.clone();
        note10Students.setAdditionalPrice(-200);
        System.out.println(note10Students);

        SmartPhone iphoneXStudents = iphoneX.clone();
        iphoneXStudents.setAdditionalPrice(-300);
        System.out.println(iphoneXStudents);
    }
}
