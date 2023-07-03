package Deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketBookingSystem {

    private static final int TOTAL_TICKETS = 100;
    private static final int MAX_THREADS = 10;

    private static int availableTickets = TOTAL_TICKETS;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

        for (int i = 0; i < MAX_THREADS; i++) {
            executor.execute(new TicketBookingTask());
        }

        executor.shutdown();
    }

    static class TicketBookingTask implements Runnable {

        @Override
        public void run() {
            synchronized (TicketBookingSystem.class) {
                if (availableTickets > 0) {
                    // Simulate ticket booking process
                    System.out.println("Thread " + Thread.currentThread().getId() +
                            " booking ticket " + (TOTAL_TICKETS - availableTickets + 1));

                    // Simulate some processing time
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Decrement the available tickets
                    availableTickets--;

                    System.out.println("Ticket booked. Remaining tickets: " + availableTickets);
                } else {
                    System.out.println("Thread " + Thread.currentThread().getId() +
                            " - No tickets available.");
                }
            }
        }
    }
}
