package Final.J4V4.Printer24;

// 2.4 - PRINTER - CÓDIGO ORIGINAL

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    private Queue<String> queue;

    public PrinterQueue() {
        this.queue = new LinkedList<>();
    }

    public void addJob(String job) {
        queue.add(job);
    }

    public void printNext() {
        System.out.println("Printing: " + queue.poll());
    }

    public void viewQueue() {
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        PrinterQueue printerQueue = new PrinterQueue();
        printerQueue.addJob("Document1");
        printerQueue.addJob("Document2");
        printerQueue.viewQueue(); // Output: Queue: [Document1, Document2]
        printerQueue.printNext(); // Output: Printing: Document1
        printerQueue.viewQueue(); // Output: Queue: [Document2]
    }
}
