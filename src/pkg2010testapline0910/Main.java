/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2010testapline0910;

/**
 *
 * @author kms080
 */
import javax.swing.JOptionPane;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        otherClass oc1 = new otherClass();
        oc1.work();
    }
}

class APLine {
    private int a,b,c;
    public APLine() {
        
    }
    public APLine(int myA, int myB, int myC) {
        a = myA;
        b = myB;
        c = myC;
    }
    double getSlope() {
      double slope = (((double)-a)/b);
      return slope;
    }
    boolean isOnLine(double x, double y) {
        boolean fact;
        if(((a*x)+(b*y)+c) == 0) {
            fact = true;
        }
        else {
            fact = false;
        }
        return fact;
    }
 }

class otherClass {
    JOptionPane hop = new JOptionPane();
    public otherClass() {
        
    }
    void work() {
      APLine line1 = new APLine(5, 4, -17); 
        double slope1 = line1.getSlope(); // slope1 is assigned -1.25 
        System.out.println(slope1);
        boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) = 0
        System.out.println(onLine1);
        APLine line2 = new APLine(-25, 40, 30); 
        double slope2 = line2.getSlope(); // slope2 is assigned 0.625 
        System.out.println(slope2);
        boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 ≠ 0
        System.out.println(onLine2);
    }
}