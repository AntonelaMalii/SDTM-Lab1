import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please first select the department of the employee that you would like to add: \n");
        String department = input.readLine();
        System.out.println("Name of the employee ");
        String name = input.readLine();
        System.out.println("Surname of the employee ");
        String surname = input.readLine();
        System.out.println("Age of the employee ");
        Integer age = Integer.parseInt(input.readLine());
        System.out.println("Salary of the employee ");
        Integer salary = Integer.parseInt(input.readLine());
        System.out.println("Enter the job of the employee according to the department that was specified\n ");
        String job = input.readLine();


        Factory fc = Factory.getInstance();
        AbstractFactory employeesfc = fc.getFactory(department);
        EmployeesBuilder employebuild = employeesfc.getEmployeesJobType(job);
        employebuild.addName(name);
        employebuild.addSurname(surname);
        employebuild.addAge(age);
        employebuild.addSalary(salary);
        employebuild.addDepartment(department);
        employebuild.addJob(job);
        employebuild.getJobType();

    }
}
