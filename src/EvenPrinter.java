public class EvenPrinter implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    notify();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
