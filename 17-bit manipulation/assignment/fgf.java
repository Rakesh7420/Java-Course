// class fgf {
//    public static void main(String args[]) {
//        System.out.println(fun());
//    }
//    static int fun() {
//        static int x= 0;
//        return ++x;
 
//     }
// }

class fgf {
    protected int x, y;
}
 
class Main {
    public static void main(String args[]) {
       fgf t = new fgf();
        System.out.println(t.x + " " + t.y);
    }
}