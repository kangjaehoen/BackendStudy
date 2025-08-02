package singleton;

public class SingleTon {

    private SingleTon(){
    }

    private static class Holder{
        private static final SingleTon INSTANCE = new SingleTon();
    }

    public static SingleTon getInstance(){
        return Holder.INSTANCE;
    }
}
