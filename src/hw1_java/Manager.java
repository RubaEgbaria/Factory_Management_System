package hw1_java;

public class Manager extends Person {
	private double bonus;

	public Manager(String name, String email, int age, String pos, double salary, double bonus) {
		super(name, email, age, pos, salary);
		this.bonus = bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public double getSalary() {
		return super.getSalary() * 12 + bonus;
	}
}
