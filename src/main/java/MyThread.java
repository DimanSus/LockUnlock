public class MyThread extends Thread{
    Print print;

    public MyThread(String name, Print print) {
        super(name);
        this.print = print;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start");

        print.change();
    }
}
