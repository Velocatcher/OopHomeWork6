package homework;



import static homework.Report.report;

public class Main{
    public static void main(String[] args){
        Entity entity = new User("Bob");
//        User user = new User("Bob");

       Persister persister = new Persister();
       persister.save(entity);
       Report report = new Report(entity);
       report(entity);
    }
}