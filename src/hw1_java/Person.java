package hw1_java;

public class Person {
		  private String name;
		  private String email;
		  private int age;
		  private String pos;
		  private double salary;

		  public Person(String name, String email, int age, String pos, double salary) {
		    this.name = name;
		    this.email = email;
		    this.age = age;
		    this.pos = pos;
		    this.salary = salary;
		  }

		  public double getSalary() {
			    return salary;
			}

		  public void setSalary(double salary) {
			    this.salary = salary;
			}
		  
		  public String getName() {
		    return name;
		  }
		  
		  public String getEmail() {
			    return email;
			  }

		  public int getAge() {
		    return age;
		  }


		  public String getPos() {
		    return pos;
		  }


}
