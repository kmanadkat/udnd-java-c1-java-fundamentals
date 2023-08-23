package queueExercise;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
  public static void main(String[] args) {
    Queue<String> queuedCustomers = new LinkedList<String>();
    queuedCustomers.add("1234");
    queuedCustomers.add("2345");
    queuedCustomers.add("3456");
    queuedCustomers.add("4567");

    while(!queuedCustomers.isEmpty()) {
      System.out.println(queuedCustomers.poll());
    }
  }
}
