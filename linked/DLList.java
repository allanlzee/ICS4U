package linked;

public class DLList {
    private DNode head = null;
    private DNode tail = null;
  
    public DLList() {
      head = null;
      tail = null;
    }

    public DNode getHead() {
        return head; 
    }

    public DNode getTail() {
        return tail; 
    }

    public DNode findNode(String key) {
        DNode p = head; 

        for (; (p != null && !p.getName().equals(key)); p = p.getNext()); 

        return p; 
    }

    public void deleteNode(DNode p) {
        if (head == tail) {
          head = null; 
          tail = null; 
        } 
        else if (p == head) {
          head = p.getNext(); 
          head.setPrev(null);
        }
        else if (p == tail) {
          tail = p.getPrev(); 
          tail.setNext(null); 
        } 
        else {
          p.getNext().setPrev(p.getPrev()); 
          p.getPrev().setNext(p.getNext()); 
          p = null; 
        }
    }
  
    public void insertNode(DNode p) {
      if (head == null) {
        head = p;
        tail = p;
      }
      else {
        DNode q = head;
        
        for (; q != null && q.getName().compareTo(p.getName()) < 0; q = q.getNext());

        // Insert at head 
        if (q == head) {
            p.setNext(q); 
            q.setPrev(p); 
            head = p;
        }
        // Insert at tail 
        else if (q == null) {
            tail.setNext(p); 
            p.setPrev(tail); 
            tail = p; 
        }
        // Insert in middle 
        else {
            p.setNext(q); 
            p.setPrev(q.getPrev()); 
            q.setPrev(p);
            p.getPrev().setNext(p);
        }
      }
    }
  
    public String toString() {
      String s = "";
  
      for (DNode p = head; p != null; p = p.getNext()) {
        s = s + p.getName() + "\n";
      }


      for (DNode p = tail; p != null; p = p.getPrev()) {
        s = s + p.getName() + "\n";
      }
  
      return s;
    }
}
