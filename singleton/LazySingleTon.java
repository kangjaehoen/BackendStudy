package singleton;

public class LazySingleTon {
    private static LazySingleTon lazySingleTon;

    private LazySingleTon(){
    }

    public static LazySingleTon getInstance(){
        if(lazySingleTon == null){
            lazySingleTon = new LazySingleTon();
        }
        return lazySingleTon;
    }
}
