package heap.maxHeap;

public class Main {

  public static void main(String[] args) {

    Heap heap = new Heap();
    heap.insertHeap(1);
    heap.insertHeap(2);
    heap.insertHeap(3);
    heap.insertHeap(9);
    heap.insertHeap(10);
    heap.insertHeap(12);


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
    System.out.println(heap.deleteHeap());
    heap.printHeap();
    System.out.println(heap.deleteHeap());
    heap.printHeap();
    System.out.println(heap.deleteHeap());
    heap.printHeap();
    System.out.println(heap.deleteHeap());
    heap.printHeap();
    System.out.println(heap.deleteHeap());
    heap.printHeap();

  }

}
