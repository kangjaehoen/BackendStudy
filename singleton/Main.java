package singleton;

public class Main {
    public static void main(String[] args) {
        // 객체 초기화 끝....
        SingleTonEnum singleton = SingleTonEnum.instance;
        SingleTonEnum singleton2 = SingleTonEnum.instance;
        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
