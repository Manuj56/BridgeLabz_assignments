import java.util.*;

class A {
    String a;
    int b;
    A(String a,int b){
        this.a=a;this.b=b;
    }
}
class B extends A{
    String c;
    String d;
    B(String a,int b,String c,String d){
        super(a,b);this.c=c;this.d=d;
    }
    void e(){
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}

class F {
    String a;
    String b;
    F(String a,String b){
        this.a=a;this.b=b;
    }
}
class G extends F{
    int c;
    G(String a,String b,int c){
        super(a,b);this.c=c;
    }
    void d(){
        System.out.println(a+" "+b+" "+c);
    }
}

class H {
    String a;
    String b;
    H(String a,String b){
        this.a=a;this.b=b;
    }
}
class I extends H{
    String c;
    I(String a,String b,String c){
        super(a,b);this.c=c;
    }
}
class J extends I{
    String d;
    J(String a,String b,String c,String d){
        super(a,b,c);this.d=d;
    }
    String e(){
        return "ok";
    }
}

class K {
    String a;
    int b;
    K(String a,int b){
        this.a=a;this.b=b;
    }
}
class L extends K{
    String c;
    boolean d;
    L(String a,int b,String c,boolean d){
        super(a,b);this.c=c;this.d=d;
    }
}
class M extends L{
    int e;
    int f;
    M(String a,int b,String c,boolean d,int e,int f){
        super(a,b,c,d);this.e=e;this.f=f;
    }
}

class N {
    String a;
    int b;
    N(String a,int b){
        this.a=a;this.b=b;
    }
}
class O extends N{
    double c;
    O(String a,int b,double c){
        super(a,b);this.c=c;
    }
    void d(){
        System.out.println("x");
    }
}
class P extends N{
    int c;
    P(String a,int b,int c){
        super(a,b);this.c=c;
    }
    void d(){
        System.out.println("y");
    }
}
class Q extends N{
    int c;
    Q(String a,int b,int c){
        super(a,b);this.c=c;
    }
    void d(){
        System.out.println("z");
    }
}

class R {
    String a;
    int b;
    R(String a,int b){
        this.a=a;this.b=b;
    }
}
class S extends R{
    String c;
    S(String a,int b,String c){
        super(a,b);this.c=c;
    }
    void d(){
        System.out.println("p");
    }
}
class T extends R{
    int c;
    T(String a,int b,int c){
        super(a,b);this.c=c;
    }
    void d(){
        System.out.println("q");
    }
}
class U extends R{
    String c;
    U(String a,int b,String c){
        super(a,b);this.c=c;
    }
    void d(){
        System.out.println("r");
    }
}

public class Sep_17{
    public static void main(String[] args){
        B x=new B("x",2000,"y","z");
        x.e();
        G y=new G("a1","on",22);
        y.d();
        J z=new J("o1","d1","t1","2025-09");
        System.out.println(z.e());
        M m=new M("c1",30,"plat",true,5000,10);
        O o=new O("s1",100,3.5);
        o.d();
        P p=new P("s2",200,5);
        p.d();
        Q q=new Q("s3",300,8);
        q.d();
        S s=new S("ravi",20,"maths");
        s.d();
        T t=new T("amit",15,10);
        t.d();
        U u=new U("shyam",35,"staff");
        u.d();
    }
}