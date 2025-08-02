package finalkeyword;

public class ArrObject {
    private final int[] arr;

    public ArrObject(int[] arr) {
        this.arr = arr.clone()  ;
    }

    public int[] getArr(){
        return arr.clone();
    }
}
