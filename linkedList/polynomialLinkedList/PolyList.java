package linkedList.polynomialLinkedList;

public class PolyList extends LinkedList {

  PolyList() {
  }


  public int PolyNodeLast(PolyList list, double coef, int degree) {

    Term term = new Term();
    term.coef = coef;
    term.degree = degree;


    int position, ret = 0;
    if (list != null) {
      position = list.currentCount;
      ret = addData(list, position, term);
    }

    return ret;

  }

  public void displayPolyList(PolyList list) {

    LinkedListNode node;
    node = list.header.link;
    if (list.currentCount == 0) {
      System.out.println("자료가 없습니다.");
    } else {
      for (int i = 0; i < list.currentCount; i++) {
        if (i>0 && ((Term)node.data).coef > 0) {
          System.out.print(" + ");
        }
        else{
          System.out.print(" ");
        }
        System.out.print(((Term)node.data).coef + "^" + ((Term)node.data).degree);
        node = node.link;
      }
      System.out.println("\n=====================");
    }

  }

  public PolyList polyAdd(PolyList listA, PolyList listB) {

    PolyList ret = new PolyList();
    LinkedListNode nodeA;
    LinkedListNode nodeB;
    double coefSum = 0;

    if (listA != null && listB != null) {
      ret = new PolyList();
      if (ret == null) {
        System.out.println("메모리 할당 오류, PolyAdd");
        return null;
      }

      nodeA = listA.header.link;
      nodeB = listB.header.link;
      while (nodeA != null && nodeB != null) {
        Term termA = (Term)nodeA.data;
        Term termB = (Term)nodeB.data;

        int degreeA = termA.degree;
        int degreeB = termB.degree;
        if (degreeA > degreeB) {
          coefSum = termA.coef;
          PolyNodeLast(ret, coefSum, degreeA);
          nodeA = nodeA.link;
        } else if (degreeA == degreeB) {
          coefSum = termA.coef + termB.coef;
          PolyNodeLast(ret, coefSum, degreeA);
          nodeA = nodeA.link;
          nodeB = nodeB.link;
        } else {
          coefSum = termB.coef;
          PolyNodeLast(ret, coefSum, degreeB);
          nodeB = nodeB.link;
        }
      }

      while (nodeA != null) {
        Term termA = (Term)nodeA.data;

        coefSum = termA.coef;
        PolyNodeLast(ret, coefSum, termA.degree);
        nodeA = nodeA.link;
      }

      while (nodeB != null) {
        Term termB = (Term)nodeB.data;

        coefSum = termB.coef;
        PolyNodeLast(ret, coefSum, termB.degree);
        nodeB = nodeB.link;
      }

    } else {
      System.out.println("오류, Null 다항식이 전달되었습니다. polyAdd()");
    }

    return ret;

  }

  public PolyList polySub(PolyList listA, PolyList listB){
    PolyList ret = new PolyList();
    LinkedListNode nodeA;
    LinkedListNode nodeB;
    double coefSub = 0;

    if (listA != null && listB != null) {
      ret = new PolyList();
      if (ret == null) {
        System.out.println("메모리 할당 오류, PolyAdd");
        return null;
      }

      nodeA = listA.header.link;
      nodeB = listB.header.link;

      while (nodeA != null && nodeB != null) {
        Term termA = (Term)nodeA.data;
        Term termB = (Term)nodeB.data;

        int degreeA = termA.degree;
        int degreeB = termB.degree;
        if (degreeA > degreeB) {
          coefSub = termA.coef;
          PolyNodeLast(ret, coefSub, degreeA);
          nodeA = nodeA.link;
        } else if (degreeA == degreeB) {
          coefSub = termA.coef - termB.coef;
          PolyNodeLast(ret, coefSub, degreeA);
          nodeA = nodeA.link;
          nodeB = nodeB.link;
        } else {
          coefSub = -termB.coef;
          PolyNodeLast(ret, coefSub, degreeB);
          nodeB = nodeB.link;
        }
      }

      while (nodeA != null) {
        Term termA = (Term)nodeA.data;

        coefSub = termA.coef;
        PolyNodeLast(ret, coefSub, termA.degree);
        nodeA = nodeA.link;
      }

      while (nodeB != null) {
        Term termB = (Term)nodeB.data;

        coefSub = -termB.coef;
        PolyNodeLast(ret, coefSub, termB.degree);
        nodeB = nodeB.link;
      }

    } else {
      System.out.println("오류, Null 다항식이 전달되었습니다. polyAdd()");
    }

    return ret;

  }

}
