package CompositeDesignPattern.leaf;

import CompositeDesignPattern.component.IEmployee;


//Leaf Component
public class Employee implements IEmployee {


    private String name;
    private long empId;
    private String position;

    public Employee(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
    @Override
    public void getDetails()
    {
        System.out.println("Employee name"+name);
        System.out.println("Employee position"+position);
        System.out.println("Employee Id"+empId);

    }


}
