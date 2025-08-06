package innerclass;

public class Main {
    public static void main(String[] args) {
         OuterClass.InnerClass1 inner = new OuterClass().new InnerClass1();
         inner.hello();

        OuterClass.InnerClass4 staticInner = new OuterClass.InnerClass4();
        staticInner.hello();
        System.out.println("이너 클래스");

    }
}
