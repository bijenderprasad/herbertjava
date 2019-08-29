package Patterns;


public class recrusion2to5 {

public static void main(String[] args) {
int n1 = 2;
int n2 = 7;
onePointToAnother(n1, n2);

}

public static void onePointToAnother(int x1, int x2) {

if (x1<x2) {
System.out.println(x1);
 onePointToAnother(++x1,x2);


}

if (x1>x2) {
System.out.println(x1);
 onePointToAnother(--x1,x2);

}
System.out.println(x2);


}

}