package linkedList.polynomialLinkedList;

public class LinkedList {

  int currentCount;
  LinkedListNode header;

  LinkedList(){

    this.header = new LinkedListNode();

  }


  public int addData(LinkedList list, int position, Data data){

    LinkedListNode pNewNode = new LinkedListNode(data);
    LinkedListNode pPreNode;

    pNewNode.data = data;

    pPreNode = list.header;
    for(int i = 0; i<position; i++){
      pPreNode = pPreNode.link;
    }

    pNewNode.link = pPreNode.link;
    pPreNode.link = pNewNode;
    list.currentCount++;

    return 1;

  }



  public int removeData(LinkedList list, int position){
    LinkedListNode pDelNode;
    LinkedListNode pPreNode;

    pPreNode = list.header;
    for(int i=0; i<position; i++){
      pPreNode = pPreNode.link;
    }

    pDelNode = pPreNode.link;
    pPreNode.link =pDelNode.link;

    pDelNode = null;
    list.currentCount--;

    return 0;
  }

}
