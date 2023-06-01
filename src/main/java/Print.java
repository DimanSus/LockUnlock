import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Print {
    private final Lock lock = new ReentrantLock();

    public void change(){
        lock.lock();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(Thread.currentThread().getName().equals("Thread1")) {
            charReplace("a", "o", s);
        } else if (Thread.currentThread().getName().equals("Thread2")) {
            charReplace("a", "n", s);
        }
        lock.unlock();
    }

    private void charReplace (String s1, String s2, String s){

            try {
                System.out.println(s);
                s = s.replaceAll(s1, s2);
                System.out.println(s);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + " end");
            }
    }
}
