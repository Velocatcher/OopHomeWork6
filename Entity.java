package homework;

public interface Entity {
    String name = null;
    default String getName(){
        return name;
    };
}
