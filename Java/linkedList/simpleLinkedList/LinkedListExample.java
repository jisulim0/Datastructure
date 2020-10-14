package linkedList.simpleLinkedList;

public class LinkedListExample {

  public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list = list.createLinkedList();
    list.addLinkedListData(list, 0,10);
    list.addLinkedListData(list, 1,20);
    list.addLinkedListData(list, 1,30);
    list.print(list);
    System.out.println();

    list.removeLinkedListData(list, 0);
    list.print(list);
    System.out.println();

  }

}
