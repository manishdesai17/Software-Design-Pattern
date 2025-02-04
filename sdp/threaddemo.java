class Thread1 extends Thread {
    public synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i=" + i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int j = 0; j <= 10; j++) {
            System.out.println("j=" + j);
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
