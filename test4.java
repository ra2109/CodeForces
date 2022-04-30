import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee(1000, "x1"));
        al.add(new Employee(1001, "x1"));
        al.add(new Employee(1002, "x1"));
        colGiven a string S, find length of the longest substring with all distinct characters.
        Input: abcdae
        Output : 5
        ("bcdae" has all unique characters)
        
    }
    
}
public c
class Employee
{
    int salary;
    String name;
    Employee(int salary,String name)
    {
        this.salary=salary;
        this.name=name;
    }
}
