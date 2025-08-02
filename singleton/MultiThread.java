package singleton;

public class MultiThread {
    public static void main(String[] args) {

        Runnable task = () -> {
            LazySingleTon singleton = LazySingleTon.getInstance();
            System.out.println("현재 스레드: " + Thread.currentThread().getName()
                    + ", Singleton 인스턴스: " + singleton);
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
