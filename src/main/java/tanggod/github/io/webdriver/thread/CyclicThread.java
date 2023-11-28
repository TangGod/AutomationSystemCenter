package tanggod.github.io.webdriver.thread;

/**
 * Created by TangGod on 2018/10/31.
 */
public abstract class CyclicThread extends Thread {

    private boolean isRunning = true;

    public CyclicThread() {
    }

    public abstract void work() throws InterruptedException;

    public void quit() {
        this.isRunning = false;
        this.interrupt();
    }

    public void run() {
        while(this.isRunning) {
            try {
                this.work();
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }
        }

    }
}
