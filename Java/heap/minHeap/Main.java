package heap.minHeap;

public class Main {

  public static void main(String[] args) {

    Heap heap = new Heap();
    heap.insertHeap(8);
    heap.insertHeap(5);
    heap.insertHeap(-5);
    heap.insertHeap(-4);
    heap.insertHeap(3);
    heap.insertHeap(7);



//    heap.insertHeap(90);
//    heap.insertHeap(85);
//    heap.insertHeap(80);
//    heap.insertHeap(75);
//    heap.insertHeap(70);
//    heap.insertHeap(65);
//    heap.insertHeap(60);
//    heap.insertHeap(55);
//    heap.insertHeap(50);
//    heap.insertHeap(45);
//    heap.insertHeap(40);
//    heap.insertHeap(35);
//    heap.insertHeap(30);

    heap.printHeap();

    System.out.println("de : " + heap.deleteMinHeap());
    heap.printHeap();

//    System.out.println("de : " + heap.deleteMaxHeap());
//    heap.printHeap();
//    System.out.println("de : " + heap.deleteMinHeap());
//    heap.printHeap();
  }

}
