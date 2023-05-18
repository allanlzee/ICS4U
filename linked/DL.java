package linked;

public class DL {
    public static void main(String[] args) {
        DLList list = new DLList();
        DNode p = new DNode();
    
        p = new DNode("100", 21, 99, "Canada", null); 
        list.insertNode(p);

        p = new DNode("200", 69, -1, "Canada", null); 
        list.insertNode(p); 

        p = new DNode("300", 12, 50, "Canada", null); 
        list.insertNode(p); 

        p = new DNode("160", 17, 0, "Canada", null); 
        list.insertNode(p); 

        System.out.println(list);
    }
}
