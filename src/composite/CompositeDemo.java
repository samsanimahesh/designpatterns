package composite;

public class CompositeDemo {
	public static void main(String[] args) {
		Department computerDepartment = new ComputerDepartment();
		Department mechanicalDepartment = new Mechanical();

		DepartmentComposite headDepartment = new DepartmentComposite("Composite");

		headDepartment.addDepartment(computerDepartment);
		headDepartment.addDepartment(mechanicalDepartment);

		System.out.println(headDepartment.getName());
	}

}
