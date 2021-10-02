public class Factory {
    public static Factory instance;

    private Factory(){

    }
    public static synchronized Factory getInstance(){
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public AbstractFactory getFactory(String department){
        AbstractFactory fc = null;
        switch(department){
            case "Surgery":
                fc = new SurgeryFactory();
                break;
            case "Cardiology":
                fc = new CardiologyFactory();
                break;
            case "Pediatry":
                fc= new PediatryFactory();
                break;
            default:
                System.out.println("Unexisting department in our hospital");
                break;
        }
        return fc;

    }
}
