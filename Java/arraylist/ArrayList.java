package arraylist;

public class ArrayList {

  private int maxCount;
  private int currentCount;
  private Node[] nodes;

  ArrayList(int maxCount){
    this.maxCount = maxCount;
    this.nodes = new Node[maxCount];
  }

  public void addListData(final int position, final int data){
    Node node = new Node(data);
    for(int i = currentCount-1; i>=position; i--){
      nodes[i+1] = nodes[i];
    }
    nodes[position] = node;
    currentCount++;
  }

  public void removeListData(final int position){
    for(int i = position; i<currentCount-1;i++){
      nodes[i] = nodes[i+1];
    }
    currentCount--;
  }

  public int getListData(final int position){
    return nodes[position].data;
  }

  void deleteList(){
    for(int i=0; i<currentCount; i++){
      nodes[i] = null;
    }
    currentCount = 0;
  }

  public void print(){
    for(int i = 0; i<currentCount;i++){
      int value = getListData(i);
      System.out.println("위치 : "+ i + ", 값 : " + value);
    }
  }

}
