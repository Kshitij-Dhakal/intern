/**
 * ax^2+bx+c
 * x = b+- (b^2-4ac)/2a
 */
public class QuadraticEquation {
    double a; //coef of x^2
    double b; //coef of x
    double c; //constant

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //return type    function_name (values)
    double solveForX() {
        return b + Math.sqrt((b * b) - 4 * a * c) / 2 * a;
    }

    public static void main(String[] args) {
        QuadraticEquation eqn = new QuadraticEquation(2, 4, 0);
        System.out.println(eqn.solveForX());
        // ax^2+bx+c

        //ax+b


    }
}