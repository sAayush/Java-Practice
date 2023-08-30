package tests.thread;

class test3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    private String name;

    public MyThread(String n) {
        name = n;
    }

    public void run() {
        System.out.println("Starting thread " + name);
        for (int i = 1; i <= 1000; i++) {
            System.out.println(name + ": " + i);
            // try {
            // Thread.sleep(1000); // sleep for 1 second
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
        }
        System.out.println("Exiting thread " + name);
    }
}
