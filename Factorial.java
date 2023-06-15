/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial;

/**
 *
 * @author Admin
 */
import java.util.Stack;

public class Factorial {

    public static long factorial(int n) {
        Stack<Long> stack = new Stack<>();
        stack.push(1L);
        for (int i = 2; i <= n; i++) {
            stack.push(stack.pop() * i);
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        int n = 5;
        long factorial = factorial(n);
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}

