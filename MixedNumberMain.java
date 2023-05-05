

public class MixedNumberMain {
    public static void main(String[] args) {
        MixedNumber m1 = new MixedNumber(); 
        MixedNumber m2 = new MixedNumber(0, 0, 1);
        MixedNumber m3 = new MixedNumber(0, 1, 4); 
        MixedNumber m4 = new MixedNumber(-1, 1, 4); 

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        System.out.println(m3.add(m4));
    }
}
