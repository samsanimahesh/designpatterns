package composite;

import java.util.ArrayList;
import java.util.List;

public class DepartmentComposite implements Department {

	private String name;

	private List<Department> childDepartments;

	public DepartmentComposite(String name) {
		this.name = name;
		childDepartments = new ArrayList<>();
	}

	public void addDepartment(Department department) {
		childDepartments.add(department);
	}

	public void removeDepartment(Department department) {
		childDepartments.remove(department);
	}

	@Override
	public String getName() {
		StringBuffer buffer = new StringBuffer();
		for (Department dep : childDepartments) {
			buffer.append(dep.getName());
		}
		return buffer.toString();
	}

}
