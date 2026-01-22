public class method_overloading {
    public static void main(String[] args){
        System.out.println(add(5, 10));
        System.out.println(add(5,10,15));
        System.out.println(add(5.5,10.6,4.0));
    }
    static int add(int a, int b){
        return (a+b);
    }
    static int add(int a, int b, int c){
        return (a+b+c);
    }
    static double add(double a, double b, double c){
        return (a+b+c);
    }
}
