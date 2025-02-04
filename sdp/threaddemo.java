class Thread1 extends Thread {
    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                System.out.println("i=" + i);
                try {
                    Thread.sleep(500); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        synchronized (this) {
            for (int j = 0; j <= 10; j++) {
                System.out.println("j=" + j);
                try {
                    Thread.sleep(500); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class threaddemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
