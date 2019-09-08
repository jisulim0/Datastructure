package queue.arrayCircleQueue;

public class Array {

  private final int MAX_COUNT;
  private int currentCount;
  private int front;
  private int rear;
  private Node[] data;

  public Array(final int maxCount) {
    front = -1;
    rear = -1;
    this.MAX_COUNT = maxCount;
    this.data = new Node[maxCount];
  }

  int enqueue(Array queue, char data) {
    int ret = 0;

    Node newNode = new Node(data);

    if (queue != null) {
      if (isFull(queue) == 0) {
        queue.rear = (queue.rear + 1) % queue.MAX_COUNT;
        queue.data[queue.rear] = newNode;
        queue.currentCount++;
      } else {
        System.out.println("오류, 큐가 가득 찼습니다.");
      }
    }

    return ret;

  }

  Node dequeue(Array queue) {

    Node ret = new Node();

    if (queue != null) {
      if (isEmpty(queue) == 0) {
        if (ret != null) {
          queue.front = (queue.front + 1) % queue.MAX_COUNT;
          ret.data = queue.data[queue.front].data;
          queue.currentCount--;
        } else {
          System.out.println("오류, 메모리 할당");
        }
      }
    }
    return ret;
  }

  Node peek(Array queue) {
    Node ret = new Node();
    if (queue != null) {
      if (isEmpty(queue) == 0) {
        ret = queue.data[queue.front + 1];
      }
    }

    return ret;

  }

  int isFull(Array queue) {
    int ret = 0;

    if (queue != null) {
      if (queue.currentCount == queue.MAX_COUNT) {
        ret = 1;
      }
    }
    return ret;
  }

  int isEmpty(Array queue) {
    int ret = 0;
    if (queue != null) {
      if (queue.currentCount == 0) {
        ret = 1;
      }
    }

    return ret;
  }

  void display(Array queue) {
    int position = 0;

    if (queue != null) {
      System.out.println("큐의 크기 : " + queue.MAX_COUNT + "현재 노드 개수 : " + queue.currentCount);

      for (int i = queue.front + 1; i <= queue.front + queue.currentCount; i++) {
        position = i % queue.MAX_COUNT;
        System.out.println("[ " + position + " ]-[ " + queue.data[position].data + " ]");
      }
    }
  }

}
