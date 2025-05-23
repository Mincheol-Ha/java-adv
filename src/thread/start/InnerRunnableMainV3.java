package thread.start;

import static utill.MyLogger.log;

public class InnerRunnableMainV3 {

    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(new Runnable() {

            public void run() {
                log("run()");
            }
        });
        thread.start();

        log("main() end");
    }

}
