package linkedList.simpleLinkedList;

public class LinkedList {

  private int currentCount;
  private Node header;

  LinkedList(){
    this.header = new Node();
  }

  LinkedList createLinkedList(){
    LinkedList ret = new LinkedList();

    return ret;
  }

  int getLinkedListData(LinkedList list, int position){

    Node pCurrentNode = list.header.pLink;
    for(int i = 0; i<position; i++){
      pCurrentNode = pCurrentNode.pLink;
    }

    return pCurrentNode.data;

  }

  int addLinkedListData(LinkedList list, int position, int data){

    Node newNode = new Node(data);
    Node preNode;

    preNode = list.header;
    for(int i = 0; i<position; i++){
      preNode = preNode.pLink;
    }

    newNode.pLink = preNode.pLink;
    preNode.pLink = newNode;
    list.currentCount++;

    return 0;

  }

  int removeLinkedListData(LinkedList pList, int position){

    Node delNode;
    Node preNode;

    preNode = pList.header;
    for(int i=0; i<position; i++){
      preNode = preNode.pLink;
    }

    delNode = preNode.pLink;
    preNode.pLink =delNode.pLink;

    delNode = null;
    pList.currentCount--;

    return 0;

  }

  void print(LinkedList pList){
    for(int i = 0; i<currentCount;i++){
      int value = getLinkedListData(pList, i);
      System.out.println("위치 : "+ i + ", 값 : " + value);
    }
  }

}
