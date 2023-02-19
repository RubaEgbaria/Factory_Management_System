package hw1_java;

public class program {

	public static void main(String[] args) {
//		System.out.println("hello world");
		
		
		Person emp1 = new Person("Ruba", "ruba.egb@gmail.com", 22, "CEO", 100000);
		Person emp2 = new Person("zena", "zena.egb@gmail.com", 34 , "Developer", 90000);

		Person[] emps = {emp1, emp2};
		
		
		Manager ceo = new Manager("ruba2", "ceo@rubacompany.com", 25, "CEO", 5000000, 400000);
		Department dept1 = new Department("Tech", ceo, emps);
		
		Person emp3 = new Person("suzan","suzan@rubacompany.com", 35,  "UI/UX", 55000);

		Person[] emps2 = {emp3};
		Manager ceo2 = new Manager("someone", "someone@someone.com", 33, "ceo", 230000, 21000);
		Department dept2 = new Department("Ads", ceo2, emps2);

		Department[] depts = {dept1, dept2};
		
		Manager ceo3 = new Manager("RIO", "RIO@RIO.com", 50, "CEO", 1000000, 100000);
		Factory factory = new Factory("999", ceo3 ,"Tech", depts);


		// Print all the data 
		
		System.out.println("*** Factory ***");
		System.out.println("Factory: " + factory.getName());
		System.out.println("Factory #: " + factory.getNumber());
		System.out.print("\n");

		Manager manager_data = factory.getCEO();
		System.out.println("CEO: " + manager_data.getName());
		System.out.println("CEO Salary: " + manager_data.getSalary());
		System.out.print("\n");

		System.out.println("*** Department ***");
		Department[] depts_data = factory.getDepts();
		for (Department dept_data : depts_data) {
		System.out.println("Department: " + dept_data.getName());
		System.out.print("\n");
		
		System.out.println("*** Manager ***");
		Manager manager = dept_data.getManager();
		System.out.println("Manager: " + manager.getName());
		System.out.println("Manager Position: " + manager.getPos());
		System.out.println("Manager Salary: " + manager.getSalary());
		System.out.print("\n");

		System.out.println("*** Emplyees ***");
		Person[] emps_data = dept_data.getEmps();
		for (Person emp_data : emps_data) {
		System.out.println("Employee: " + emp_data.getName());
		System.out.println("Employee Position: " + emp_data.getPos());
		System.out.println("Employee Salary: " + emp_data.getSalary());
		System.out.print("\n");
			}
		}
	}
}
