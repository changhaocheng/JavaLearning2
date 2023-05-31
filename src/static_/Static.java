package static_;

public class Static {
    public static void main(String[] args) {
//        A a = new A();
//        a.q();
//        System.out.println(a.i);
        A.q();
    }
}
class A{
    int i1 = 2;
    public static int i  =1;
    public static void q(){
//        this.i ++;
        System.out.println("静态方法被调用");
    }

}
