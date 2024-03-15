package homework;

public class Report {
    public Report(Entity entity) {
    }
//    public Report(String name) {
//        super(name);
//
//    }

    public static void report(Entity entity){
        System.out.println("Report for entity: " + entity.getName());
    }

//    @Override
//    public String getName() {
//        return getName();
//    }
//
//    @Override
//    public String toString() {
//        return this.getName();
//    }


}

