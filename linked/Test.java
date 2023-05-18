package linked;

public class Test {
    public static void main(String[] args) {
        SLList list = new SLList(); 
        SNode p = new SNode(); 

        for (int i = 4000; i <= 4499; i++) {
            if (i % 2 == 1) {
                String id = "" + i;
                p = new SNode(id, 0, 0, "Canada", null);
                list.insertNode(p);
            }
        }

        for (int i = 4000; i <= 4499; i++) {
            if (i % 2 == 0) {
                String id = "" + i;
                p = new SNode(id, 0, 0, "Canada", null);
                list.insertNode(p);
            }
        }

        for (SNode node = list.getHead(); node.getNext() != null; node = node.getNext()) {
            char c = node.getName().charAt(3);

            if (c == '5' || c == '0') {
                list.deleteNode(node);
            }
        }


        for (int i = 4000; i <= 4499; i++) {
            if (i % 5 == 0 && !(i % 10 == 0)) {
                String id = "" + i; 
                p = new SNode(id, 0, 0, "Canada", null); 
                list.insertNode(p); 
            }
        }

        for (SNode node = list.findNode("4021"); Integer.parseInt(node.getName()) <= 4489; node = node.getNext()) {
            list.deleteNode(node);
        } 

        System.out.println(list);
    }
}
