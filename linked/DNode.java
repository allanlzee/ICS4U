package linked; 

public class DNode {
    private String name = "";
    private int age = -1;
    private double mark = 0.0;
    private String nationality = "";
    private DNode next = null;
    private DNode prev = null; 
  
    public DNode() {
        name = "";
        age = -1;
        mark = 0.0;
        nationality = "";
        next = null;
        prev = null; 
    }
  
    public DNode(String n, int a, double m, String s, DNode p) {
        name = n;
        age = a;
        mark = m;
        nationality = s;
        next = p;
        prev = null; 
    }
  
    public String getName() {
        return name;
    }
  
    public DNode getNext() {
        return next;
    }
  
    public void setNext(DNode p) {
        next = p;
    }

    public DNode getPrev() {
        return prev; 
    }

    public void setPrev(DNode p) {
        prev = p; 
    } 
  
    public String toString() {
        return "Name: " + name + "\n" +
                "Age : " + age  + "\n" +
                "Mark: " + mark + "\n" +
                "Nationality: " + nationality;
    }
  }