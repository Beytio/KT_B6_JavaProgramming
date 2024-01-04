package day09_OperatorsCont;

public class C04_UnaryOperators {
    public static void main(String[] args) {

        int id=1;
        id=id+1;

        int a=10;
        a++;  //  post increment
        System.out.println("a = " + a);

        a--;  // post decrement
        System.out.println("a = " + a);

        System.out.println("-------------");


        ++a;    // pre increment

        System.out.println("a = " + a);

        --a;  // pre decrement
        System.out.println("a = " + a);


        System.out.println("------------");

        int b=99;
        System.out.println(b++); //99
        System.out.println("b = " + b); //100
        System.out.println(b--);// 100  b=99
        System.out.println("b = " + b);// 99


        System.out.println("-----------");

        int x=299;
        System.out.println(++x);//300
        System.out.println(--x);

        System.out.println("-----------------");

        int z=33;
        System.out.println(++z);//çıktı :34   z=34
        System.out.println(z++);//çıktı: 34   z=35
        System.out.println(z--);//çıktı: 35   z=34
        System.out.println("z = " + z);//34
        System.out.println("--z = " + --z);//33
        System.out.println(z++);//33
        System.out.println("z = " + z);//34
        System.out.println(z--);//34
        System.out.println("z = " + z);//33
        System.out.println(z++);//33
        System.out.println("z = " + z);//34
        System.out.println(z--);//34
        System.out.println("z = " + z);//33
        System.out.println(++z);//34
        System.out.println(--z);//33
        System.out.println(z++);//33
        System.out.println(--z);//33

    }
}
