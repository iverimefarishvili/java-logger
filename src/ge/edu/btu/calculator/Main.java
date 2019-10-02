package ge.edu.btu.calculator;

import ge.edu.btu.calculator.service.impl.CalculatorServicelmpl;
import org.apache.log4j.Logger;

import java.util.Scanner;


public class Main {




    public static void main(String[] args) {
        System.out.println("shemoitanet ricxvi ");
        Scanner myObj = new Scanner(System.in);
	    CalculatorServicelmpl c = new CalculatorServicelmpl();
        System.out.println(c.sum(4, 2));
        System.out.println(c.sum(4.0, 2.0));
        System.out.println(c.divide(4, 2));
        System.out.println(c.divide(4, 0));
        System.out.println(c.divide(4.0,2.0));


    }
}
