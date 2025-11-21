package example.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Department_Master")
public class Department {
	@Id
	@Column(name="dept_No")
	private Integer deptNo;
	@Column(name="dept_Name",length = 20)
	private String name;
	@Column(name="dept_loc",length = 30)
	private String location;
	@OneToMany(cascade = CascadeType.ALL)// All :-> Along with parent child is also implemented
	
	@JoinColumn(name="dept_id")  // it is the foreign key column referred from child column 
	
	private List<Employee>employeeList;
	
	public Department() {
		employeeList = new ArrayList<>();
	}

	public Department(Integer deptNo, String name, String location, List<Employee> employeeList) {
		super();
		this.deptNo = deptNo;
		this.name = name;
		this.location = location;
		this.employeeList = employeeList;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", name=" + name + ", location=" + location + ", employeeList="
				+ employeeList + "]";
	}
			
	
// providing an additional utility method that allows users to add single employee at a time	
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}
	
}
