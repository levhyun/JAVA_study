// 스레드

public class C10_Threads extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            C10_Threads thread = new C10_Threads();
            thread.start();
        }
    }
    public void run() {
        System.out.println("thread");
    }
}

