abstract class EmployeesBuilder {


    private MedicalCenterEmployee employee;

    public MedicalCenterEmployee getEmployee(){
        return employee;
    }

    public EmployeesBuilder(){
        employee=new MedicalCenterEmployee();

    }

    public void addName(String name) {
        employee.setName(name);
    }

    public void addSurname(String surname) {
        employee.setSurname(surname);
    }

    public void addAge(Integer age) {
        employee.setAge(age);
    }

    public void addSalary(Integer salary) {
        employee.setSalary(salary);
    }

    public void addDepartment(String department) {
        employee.setDepartment(department);
    }

    public void addJob(String job) {
        employee.setJob(job);
    }
    public abstract String getJobType();

}

class SurgeonBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Doctor-Surgeon";
    }
}

class SurgeonAssistantBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Resident/Student-Surgeon Assistant";
    }
}

class NurseSurgeryBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Nurse-Surgery Department";
    }
}


class CardiologBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Doctor-Cardiolog";
    }
}

class CardiologAssistantBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Resident/Student-Cardiolog Assistant";
    }
}

class NurseCardiologyBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Nurse-Cardiology Department";
    }
}

class PediaterBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Doctor-Pediatry";
    }
}

class PediaterAssistantBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Resident/Student-Pediatry Assistant";
    }
}

class NursePediatryBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Nurse-Pediatry Department";
    }
}