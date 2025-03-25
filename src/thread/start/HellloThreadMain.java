package thread.start;

public class HellloThreadMain {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(HelloThread.currentThread().getName() + ": start() 호출 전");
        helloThread.start();
        System.out.println(HelloThread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
