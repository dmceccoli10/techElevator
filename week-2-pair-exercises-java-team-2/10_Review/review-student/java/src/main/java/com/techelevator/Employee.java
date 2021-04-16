package com.techelevator;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;
    static final double BASE_SALARY = 60000.00;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.lastName + ", " + this.firstName;
    }

    public void raiseSalary (double percent) {
        salary = salary + salary * (percent / 100);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //public Double raiseSalary(double percent) {
      //  return this.BASE_SALARY * percent;
    // }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public Employee (long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
        setEmployeeId(employeeId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setDepartment(department);
        setHireDate(hireDate);
        this.salary = BASE_SALARY;
    }


    public Employee() {
        // this.employeeId = 0;
        // this.firstName = "";
        // this.lastName = "";
        // this.email = "";
        this.salary = BASE_SALARY;
        // this.department = null;
        // this.hireDate = "";
    }

}
