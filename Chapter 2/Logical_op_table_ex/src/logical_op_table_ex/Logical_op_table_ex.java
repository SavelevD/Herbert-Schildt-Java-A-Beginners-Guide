/*
        Попытайтесь видоизменить программу так, чтобы вместо логических
    значений true и false отображались значения 1 и 0.
*/

package logical_op_table_ex;

public class Logical_op_table_ex {
    public static void main(String[] args) {
        boolean p, q;
        
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        
        p = true; q = true;
        if (p == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if (q == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p&q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p|q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p^q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((!p) == true) System.out.println(1 + "\t");
        else System.out.println(0 + "\t");
        
        p = true; q = false;
        if (p == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if (q == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p&q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p|q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p^q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((!p) == true) System.out.println(1 + "\t");
        else System.out.println(0 + "\t");
        
        p = false; q = true;
        if (p == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if (q == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p&q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p|q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p^q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((!p) == true) System.out.print(1 + "\t");
        else System.out.println(0 + "\t");
        System.out.println();
        
        p = false; q = false;
        if (p == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if (q == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p&q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p|q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((p^q) == true) System.out.print(1 + "\t");
        else System.out.print(0 + "\t");
        if ((!p) == true) System.out.print(1 + "\t");
        else System.out.println(0 + "\t");
        System.out.println();
    }
}
