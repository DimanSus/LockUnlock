public class Main {
    public static void main(String[] args) {
        Print print = new Print();

        MyThread myThread1 = new MyThread("Thread1", print);
        MyThread myThread2 = new MyThread("Thread2", print);

        myThread1.start();
        myThread2.start();
    }
}
