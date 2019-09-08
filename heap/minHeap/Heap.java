package heap.minHeap;

public class Heap {

  private int currentCount;
  private int[] nodes;

  public Heap() {
    currentCount = 0;
    nodes = new int[50];
  }

  public void insertHeap(int value) {
    int i = ++currentCount;
    while ((i != 1) && (value < nodes[i/2])){
      nodes[i] = nodes[i/2];
      i/=2;
    }

    nodes[i] = value;
  }

  public int getCurrentCount() {
    return this.currentCount;
  }

  public int deleteMaxHeap() {
    int check = 0;  //최대값을 가지고 있는 인덱스 번호

    int max = 0;
    for(int i=1; i<=currentCount; i++){
      if(max < nodes[i]){
        max = nodes[i];
        check = i;
      }
    }

    int[] temporaryArray = new int[currentCount-check];

    nodes[check++] = 0;
    currentCount--;


    for(int i=0; i<temporaryArray.length; i++){
      temporaryArray[i] = nodes[check];
      nodes[check] = 0;
      currentCount--;
      check++;
    }


    for(int i=0; i<temporaryArray.length; i++){
      insertHeap(temporaryArray[i]);
    }

    return max;

  }

  public int deleteMinHeap() {
    int parent, child;
    int remove;
    int temp;

    remove = nodes[1];
    temp = nodes[currentCount--];
    parent = 1;
    child = 2;

    while (child <= currentCount) {
      if ((child < currentCount) && (nodes[child] > nodes[child+1]))
        child++;

      if (temp <= nodes[child])
        break;

      nodes[parent] = nodes[child];
      parent =  child;
      child *= 2;
    }

    nodes[parent] = temp;

    return remove;
  }

  public void printHeap() {
    System.out.print("Heap >>> ");

    for(int i = 1; i<= currentCount; i++) {
      System.out.println("["+i+"], " + nodes[i]);
    }
  }

}
