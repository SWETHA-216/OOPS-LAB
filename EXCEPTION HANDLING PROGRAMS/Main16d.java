class WorkerThread extends Thread {
    private int id;

    public WorkerThread(int id) {
        this.id = id;
    }

    public void run() {
        try {
            System.out.println("Thread " + id + " starting.");
            if (id % 2 == 0) {
                throw new ArithmeticException("Simulated failure on even ID");
            }
            Thread.sleep(1000);
            System.out.println("Thread " + id + " completed successfully.");
        } catch (ArithmeticException e) {
            System.out.println("Thread " + id + " crashed: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Thread " + id + " was interrupted.");
        } finally {
            System.out.println("Thread " + id + " cleanup done.");
        }
    }
}

public class Main16d {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            Thread t = new WorkerThread(i);
            t.start();
        }
    }
}
