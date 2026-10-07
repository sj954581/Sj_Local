class RunnerOne extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("RunnerOne 1");
        }
    }
}

class RunnerTwo extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("RunnerTwo 2");
        }
    }
}

public class Multithreading {
    public static void main(String args[]) {
        RunnerOne r1 = new RunnerOne();
        RunnerTwo r2 = new RunnerTwo();
        r1.start();
        r2.start();
    }
}