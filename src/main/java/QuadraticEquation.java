// ax^2+bx+c
//todo TASK 1
//solve for value of x in equation 5x+7=0 using Quadratic Equation.
/**
 *
 * ax^2+bx+c
 * x = b+- (b^2-4ac)/2a
 * a=0,b=5,c=7
 */
public class QuadraticEquation{
    double a,b,c,root,domin;
    public QuadraticEquation(double a, double b , double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double toFindPositiveX(){
        root=Math.sqrt((b*b)-4*a*c);
        domin=2*a;
        return -b + (root/domin);
    }
    double toFindNegativeX(){
        root=Math.sqrt((b*b)-4*a*c);
        domin=2*a;
        return -b - (root/domin);
    }
    public static void main(String[] args) {
        QuadraticEquation newEquation= new QuadraticEquation(0,5,7);//(a)x^2+5x+7=0
        System.out.println(newEquation.toFindPositiveX());
        System.out.println(newEquation.toFindNegativeX());
    }
}