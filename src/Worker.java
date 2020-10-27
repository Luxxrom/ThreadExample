public class Worker implements Runnable {
    int count = 0;

    synchronized void next() {
        count++;
    }

    @Override
    public void run() {
        for (int j = 1; j <= 100; j++) {
            next();
//           System.out.println(j + " - " + count);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println(count);

    }
}
