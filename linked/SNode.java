package linked; 

public class SNode {
    private String name = "";
    private int age = -1;
    private double mark = 0.0;
    private String nationality = "";
    private SNode next = null;
  
    public SNode() {
      name = "";
      age = -1;
      mark = 0.0;
      nationality = "";
      next = null;
    }
  
    public SNode(String n, int a, double m, String s, SNode p) {
      name = n;
      age = a;
      mark = m;
      nationality = s;
      next = p;
    }
  
    public String getName() {
      return name;
    }
  
    public SNode getNext() {
      return next;
    }
  
    public void setNext(SNode p) {
      next = p;
    }
  
    public String toString() {
      return "Name: " + name + "\n" +
             "Age : " + age  + "\n" +
             "Mark: " + mark + "\n" +
             "Nationality: " + nationality;
    }
  }