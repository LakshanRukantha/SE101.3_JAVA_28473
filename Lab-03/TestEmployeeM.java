public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(10000);
        emp.setName("Lakshan");
        emp.setBasicSalary(80000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
}