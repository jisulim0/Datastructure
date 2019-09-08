package linkedList.polynomialLinkedList;

import java.util.Scanner;

public class PolynomialLinkedListExample {

  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    PolynomialLinkedListExample polynomial = new PolynomialLinkedListExample();

    PolyList listA = new PolyList();
    PolyList listB = new PolyList();
    PolyList listC = new PolyList();


    System.out.println("pListA를 입력해주세요.");
    polynomial.exitInput(listA);

    System.out.println("pListB를 입력해주세요.");
    polynomial.exitInput(listB);

    listC = listC.polyAdd(listA, listB);
    System.out.print("합 : ");
    if(listC != null){
      listC.displayPolyList(listC);
    }

    listC = listC.polySub(listA, listB);
    System.out.print("차 : ");
    if(listC != null){
      listC.displayPolyList(listC);
    }

  }

  public void exitInput(PolyList pList) {

    while (true) {
      int coef = scanner.nextInt();
      if (coef == 0) {
        break;
      }
      int degree = scanner.nextInt();

      pList.PolyNodeLast(pList, coef, degree);
    }
    pList.displayPolyList(pList);

  }

}
