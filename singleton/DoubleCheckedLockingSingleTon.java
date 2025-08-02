package singleton;

public class DoubleCheckedLockingSingleTon {
    private static volatile DoubleCheckedLockingSingleTon instance;

    private DoubleCheckedLockingSingleTon(){
    }

    public static DoubleCheckedLockingSingleTon getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLockingSingleTon.class){
                if(instance == null){
                    instance = new DoubleCheckedLockingSingleTon();
                }
            }
        }
        return instance;
    }

}
