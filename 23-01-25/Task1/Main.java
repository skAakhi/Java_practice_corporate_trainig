import java.util.List;
import java.util.ArrayList;

public class Main
{
public static void main(String[] args)
{

List<List<Employee>> empList = new ArrayList<>();


List<Employee> group1 = new ArrayList<>();
List<Employee> group2 = new ArrayList<>();


group1.add(new Employee(101,"Aakhib",600000,"IT"));
group1.add(new Employee(102,"Afzal",400000,"IT"));

group2.add(new Employee(201,"Shushmitha",58000,"HR"));
group2.add(new Employee(202,"Shymala",55000,"HR"));


empList.add(group1);
empList.add(group2);

//---------------------------------------------------------->

group1.get(0).setDepartmentName("Developer section");
group1.get(0).setName("Aakhib reheman");
group1.get(0).setId(107);


for(int i=0;i<empList.size();i++)
{
for(Employee emp : empList.get(i))
{

System.out.println(emp);
}
}

}

}