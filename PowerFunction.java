/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PowerFunction;

/**
 *
 * @author Admin
 */
import java.util.Stack;

public class PowerFunction {

    public static double power(double x, double n) {
        Stack<Double> stack = new Stack<>();
        stack.push(x);
        stack.push(n);

        while (n > 0) {
            if (n % 2 == 1) {
                x *= stack.pop();
            }
            n /= 2;
            if (n > 0) {
                x *= x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        double x = 2;
        double n = 3;
        double result = power(x, n);
        System.out.println("The result is " + result);
    }
}

