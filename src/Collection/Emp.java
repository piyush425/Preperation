package Collection;

import java.util.Objects;

public class Emp implements Comparable<Emp>{

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empId == emp.empId && Objects.equals(name, emp.name) && Objects.equals(role, emp.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role, empId);
    }

    public String getRole() {
        return role;
    }

    public Emp(String name, String role, int empId) {
        this.name = name;
        this.role = role;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmpId(String empId) {
        this.empId = Integer.parseInt(empId);
    }

    private  String role;

    public int getEmpId() {
        return empId;
    }

    private  int empId;


    @Override
    public int compareTo(Emp o) {
        return this.empId-o.empId;
    }
}
