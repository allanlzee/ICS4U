package linked;

public class Information {
    public static void main(String[] args) {
      SLList list = new SLList();
      SNode p = new SNode();
  
      p = new SNode("Jeff", 21, 99, "Canada", null); 
      list.insertNode(p);

      p = new SNode("Ellen", 69, -1, "Canada", null); 
      list.insertNode(p); 

      p = new SNode("Aidan", 12, 50, "Canada", null); 
      list.insertNode(p); 

      p = new SNode("Steven", 17, 0, "Canada", null); 
      list.insertNode(p); 

      p = list.findNode("Aidan"); 
      if (p != null) {
        System.out.println(p);
      } else {
        System.out.println("None");
      }

      System.out.println(list);
    }
  }