public abstract class AbstractFactory {

    public abstract EmployeesBuilder getEmployeesJobType(String job);

}

class SurgeryFactory extends AbstractFactory{
    public EmployeesBuilder getEmployeesJobType(String job){
        EmployeesBuilder jobtype = null;
        switch(job){
            case "Surgeon":
                jobtype = new SurgeonBuild();
                break;
            case "Surgeon Assistant":
                jobtype =  new SurgeonAssistantBuild();
                break;
            case "Surgery Nurse":
                jobtype = new NurseSurgeryBuild();
                break;
            default:
                System.out.println("No such job in surgery department!");
        }
        return jobtype;
    }
}

class CardiologyFactory extends AbstractFactory{
    public EmployeesBuilder getEmployeesJobType(String job){
        EmployeesBuilder jobtype = null;
        switch(job){
            case "Cardiolog":
                jobtype = new CardiologBuild();
                break;
            case "Cardiolog Assistant":
                jobtype =  new CardiologAssistantBuild();
                break;
            case "Cardiology Nurse":
                jobtype = new NurseCardiologyBuild();
                break;
            default:
                System.out.println("No such job in cardiology department!");
        }
        return jobtype;
    }
}

class PediatryFactory extends AbstractFactory{
    public EmployeesBuilder getEmployeesJobType(String job){
        EmployeesBuilder jobtype = null;
        switch(job){
            case "Pediater":
                jobtype = new PediaterBuild();
                break;
            case "Pediater Assistant":
                jobtype =  new PediaterAssistantBuild();
                break;
            case "Pediatry Nurse":
                jobtype = new NursePediatryBuild();
                break;
            default:
                System.out.println("No such job in pediatry department!");
        }
        return jobtype;
    }
}
