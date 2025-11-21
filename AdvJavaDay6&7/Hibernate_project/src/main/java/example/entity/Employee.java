package example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Employee_Master")
public class Employee {
	@Id
    @Column(name = "emp_no")
    private Integer empNo;

    @Column(name = "emp_name", length = 30)
    private String name;

    @Column(name = "emp_sal")
    private float salary;
    

	public Employee() {
		// TODO Auto-generated constructor stub
		
	}

	 public Employee(Integer empNo, String name, float salary) {
			super();
			this.empNo = empNo;
			this.name = name;
			this.salary = salary;
		}

}
