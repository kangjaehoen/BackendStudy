package singleton;

public class NotSingleTonObject {
    private String name;

    public NotSingleTonObject(){}

    public NotSingleTonObject(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
