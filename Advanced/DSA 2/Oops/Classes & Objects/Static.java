public class Static {

    // static variable
    static int st = 1;
    int var = 2;

    // static function
    static void staticFn() {

        System.out.println("I am a static member function");

        // Can only access static fields/members
        // System.out.println(var);
        // fn();

        // Correct ->
        // staticFn();
        System.out.println(st);
    }

    // non-static function
    void fn() {

        System.out.println("I am a normal member function");

        // Can access both static/non-static methods/variables
        System.out.println(var);
        System.out.println(st);

        // fn();
        staticFn();
    }

    public static void main(String[] args) {

        Static s = new Static();

        // You can still call static function/variable but it gives a warning.

        // s.staticFn();
        // System.out.println(s.st);

        Static.staticFn();
        System.out.println(Static.st);

        s.fn();

        // Cannot call a non-static member function/variable
        // Static.fn();
        // System.out.println(Static.var);

    }
}
