package hw1_java;

public class Department {
	
  private String name;
  private Manager manager;
  private Person[] emps;

  public Department(String name, Manager manager, Person[] emps) {
    this.name = name;
    this.manager = manager;
    this.emps = emps;
  }
  public void setManager(Manager manager) {
	this.manager = manager;
  }

   public void setEmps(Person[] emps) {
	  this.emps = emps;
	}
	  
  public String getName() {
    return name;
  }

  public Manager getManager() {
    return manager;
  }

  public Person[] getEmps() {
    return emps;
  }


}
