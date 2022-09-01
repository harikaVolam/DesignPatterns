package CompositeDesignPattern;


import CompositeDesignPattern.component.IEmployee;
import CompositeDesignPattern.composite.Manager;
import CompositeDesignPattern.leaf.Employee;

//https://www.youtube.com/watch?v=EXuaKKAlfqE
//This desgin pattern has 3 things
//1. Component which is interfacet IEmployee in this example
//2. Leaf Component which is Employee in this example
//3. Composite Components which has list of Component(ex: subOrdinates).



public class Main {

    public static void main(String[] args) {

        IEmployee dev1 = new Employee(100, "Lokesh Sharma", "Pro Developer");
        IEmployee dev2 = new Employee(101, "Vinay Sharma", "Developer");

        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        man1.addSubordinates(dev1);

       Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");
       man2.addSubordinates(dev2);

       Manager director = new Manager(301,"Niharika Volam","Director");
       director.addSubordinates(man1);
       director.addSubordinates(man2);

       director.getDetails();


    }

}
