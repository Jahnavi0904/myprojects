package Deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock{
    final Lock lock1 = new ReentrantLock();
   final Lock lock2 = new ReentrantLock();

    public void deadlock() {
        lock1.lock();
        try {
            lock2.lock();
            try {

            } finally {
                lock2.unlock();
            }
        } finally {
            lock1.unlock();
        }
    }

    public static void main(String[] args) throws Exception {
        Deadlock deadlock1 = new Deadlock();
        Deadlock deadlock2 = new Deadlock();

        deadlock1.deadlock();
        deadlock2.deadlock();
    }
}
