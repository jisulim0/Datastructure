package queue.arrayCircleQueue;

public class ArrayCircleQueueExample {


  public static void main(String[] args) {

    Array queue = new Array(4);
    Node node;

    if (queue != null) {
      queue.enqueue(queue, 'A');
      queue.enqueue(queue, 'B');
      queue.enqueue(queue, 'C');
      queue.enqueue(queue, 'D');

      queue.display(queue);

      node = queue.dequeue(queue);
      if (node != null) {
        System.out.println("Dequeue Value - [ " + node.data + " ]");
        node = null;
      }
      queue.display(queue);

      node = queue.peek(queue);
      if (node != null) {
        System.out.println("Peek Value - [ " + node.data + " ]");
      }
      queue.display(queue);

      queue.enqueue(queue, 'E');
      queue.display(queue);

    }
  }
}