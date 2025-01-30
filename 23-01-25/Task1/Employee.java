class Employee {
private int id;
private String name;
private double salary;
private String dept;

public Employee(int id, String name, double salary, String dept) {
this.id = id;
this.name = name;
this.salary = salary;
this.dept = dept;
}

public int getId() {  return id;  }


public String getName() {  return name;  }


public double getSalary() {  return salary;  }


public String getDepartmentName() {  return dept;  }







public void setId(int id) {  this.id = id;  }



public void setName(String name) {  this.name = name;  }



public void setSalary(double salary) {  this.salary = salary;  }



public void setDepartmentName(String departmentName) {  this.dept = departmentName;  }

   


public String toString() {
return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + 
", departmentName=" + dept +"}";  

}
}