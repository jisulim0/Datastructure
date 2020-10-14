package bTree;

public class BTree {

  Node rootNode;

  public Node makeNewNodeBT(char data) {

    Node ret = new Node();

    if (ret != null) {
      ret.data = data;
      ret.LLink = null;
      ret.RLink = null;
    }

    return ret;

  }

  public BTree makeBTree(char rootNodeData) {
    BTree ret = new BTree();
    if (ret != null) {
      ret.rootNode = makeNewNodeBT(rootNodeData);
      if (ret.rootNode == null) {
        ret = null;
        System.out.println("오류, 메모리 할당");
      }
    } else {
      System.out.println("오류, 메모리 할당");
    }

    return ret;
  }

  public BTree createBTree() {
    BTree ret;
    Node nodeA;
    Node nodeB;
    Node nodeC;

    ret = makeBTree('A');
    if (ret != null) {
      nodeA = getRootNode(ret);
      nodeB = addLLink(nodeA, 'B');
      nodeC = addRLink(nodeA, 'C');
      if (nodeB != null) {
        addLLink(nodeB, 'D');
        addRLink(nodeB, 'E');
      }
      if (nodeC != null) {
        addLLink(nodeC, 'F');
        addRLink(nodeC, 'G');
      }
    }
    return ret;
  }

  public Node addLLink(Node root, char data) {

    Node ret = new Node();
    if (root != null) {
      if (root.LLink == null) {
        root.LLink = makeNewNodeBT(data);
        ret = root.LLink;
      } else {
        System.out.println("노드가 이미 존재합니다.");
      }
    }

    return ret;

  }

  public Node addRLink(Node root, char data) {

    Node ret = new Node();
    if (root != null) {
      if (root.RLink == null) {
        root.RLink = makeNewNodeBT(data);
        ret = root.RLink;
      } else {
        System.out.println("노드가 이미 존재합니다.");
      }
    }

    return ret;

  }

  public Node getRootNode(BTree bTree) {

    Node ret = null;

    if (bTree != null) {
      ret = bTree.rootNode;
    }

    return ret;

  }

  public void VLR(BTree tree) {
    if (tree != null) {
      VLRNode(tree.rootNode);
      System.out.println();
    }
  }

  public void VLRNode(Node node) {
    if (node != null) {
      System.out.print(node.data);
      VLRNode(node.LLink);
      VLRNode(node.RLink);
    }
  }

  public void LVR(BTree tree) {
    if (tree != null) {
      LVRNode(tree.rootNode);
      System.out.println();
    }
  }

  public void LVRNode(Node node) {
    if (node != null) {
      LVRNode(node.LLink);
      System.out.print(node.data);
      LVRNode(node.RLink);
    }
  }

  public void LRV(BTree tree) {
    if (tree != null) {
      LRVNode(tree.rootNode);
      System.out.println();
    }
  }

  public void LRVNode(Node node) {
    if (node != null) {
      LRVNode(node.LLink);
      LRVNode(node.RLink);
      System.out.print(node.data);
    }
  }

}
