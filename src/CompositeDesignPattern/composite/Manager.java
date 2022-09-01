package CompositeDesignPattern.composite;

import CompositeDesignPattern.component.IEmployee;
import CompositeDesignPattern.leaf.Employee;

import java.util.ArrayList;
import java.util.List;


//Composite Component
public class Manager implements IEmployee {

    private String name;
    private long empId;
    private String position;
    private List<IEmployee> subOrdinates;

    public Manager(long empId,String name, String position)
    {
        this.name = name;
        this.empId=empId;
        this.position= position;
        this.subOrdinates = new ArrayList<>();
    }

    public void addSubordinates(IEmployee emp)
    {
        subOrdinates.add(emp);
    }

    public void removeSubordinates(IEmployee emp)
    {
        subOrdinates.remove(emp);
    }

    @Override
    public void getDetails() {

        System.out.println("Employee name"+name);
        System.out.println("Employee position"+position);
        System.out.println("Employee Id"+empId);
        System.out.println("Subordinates information");
        for(IEmployee employee: subOrdinates){
            employee.getDetails();
        }
    }
}
