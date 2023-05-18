package linked;

public class SLList {
    private SNode head = null;
    private SNode tail = null;
  
    public SLList() {
      head = null;
      tail = null;
    }

    public SNode getHead() {
        return head; 
    }

    public SNode getTail() {
        return tail; 
    }

    public SNode findNode(String key) {
        SNode p = head; 

        for (; (p != null && !p.getName().equals(key)); p = p.getNext()); 

        return p; 
    }

    public void deleteNode(SNode p) {
        // Remaining node 
        if (head == tail && p == head) {
            head = null;
            tail = null; 
        } 
        else if (p == head) {
            head = head.getNext(); 
        } 
        else if (p == tail) {
            SNode q = head; 

            while (q.getNext() != tail) {
                q = q.getNext(); 
            }

            tail = q; 
            tail.setNext(null); 
        } else {
            SNode q = head; 

            while (q.getNext() != null && q.getNext() != p) {
                q = q.getNext(); 
            }

            q.setNext(p.getNext()); 
        }
    }
  
    public void insertNode(SNode p) {
      if (head == null) {
        head = p;
        tail = p;
      }
      else if (p.getName().compareTo(head.getName()) <= 0) {
        p.setNext(head);
        head = p;
      }
      else if (p.getName().compareTo(tail.getName()) >= 0) {
        tail.setNext(p);
        tail = p;
      }
      else {
        SNode q = head;
        SNode r = null;
        while (p.getName().compareTo(q.getName()) > 0) {
          r = q;
          q = q.getNext();
        }
        p.setNext(q);
        r.setNext(p);
      }
    }
  
    public String toString() {
      String s = "";
  
      for (SNode p = head; p != null; p = p.getNext()) {
        s = s + p.getName() + "\n";
      }
  
      return s;
    }
  }