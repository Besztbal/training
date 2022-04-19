package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        int a = 2;
        Integer b = 2;
        Integer c =a;
        Integer d = b;
        Integer e = new Integer(2);

        int f = new  Integer(2);

        int g = new Integer(a);

        int h =new Integer(c);

        int i = new Integer("2");

        Integer j = Integer.parseInt("2");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);


        boolean k = true;
        boolean l = true;
        boolean m = new Boolean(true);
        boolean n = new Boolean(false);
        boolean o = new Boolean("TrUe");
        boolean p = new Boolean("TrUe");
        boolean q = new Boolean("TreU");
        boolean r = new Boolean("TreU");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);



    }
}
