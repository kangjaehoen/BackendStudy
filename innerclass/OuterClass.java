package innerclass;

public class OuterClass {

    public class InnerClass1{
        public void hello(){
            System.out.println("안녕1");
        }
    }
    class InnerClass2{
        public void hello(){
            System.out.println("안녕2");
        }

    }
    private class InnerClass3{
        public void hello(){
            System.out.println("안녕3");
        }
    }
    public static class InnerClass4{
        public void hello(){
            System.out.println("안녕4");
        }
    }


}
