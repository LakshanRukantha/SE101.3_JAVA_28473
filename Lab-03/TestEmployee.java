public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Lakshan");
        emp.setAge(20);
        emp.setSalary(80000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}