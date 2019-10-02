package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.Main;
import ge.edu.btu.calculator.service.CalculatorService;
import org.apache.log4j.Logger;

public class CalculatorServicelmpl implements CalculatorService{
    final static Logger logger= Logger.getLogger(Main.class);
    public static void main(String[] args) {

    }


        @Override
        public int sum(int x, int y) {
            int p = 0;

            p = x + y;
            logger.info(p);
            return p;
        }

        @Override
        public double sum(double x, double y) {
            double p = 0;

            p = x + y;
            logger.info(p);
            return p;
        }

        @Override
        public int divide(int x, int y) {
            int p = 0;

            try{
                p = x/y;
                return p;
            }
            catch (ArithmeticException ae) {
                logger.error("cant divide!!");
                return 0;
            }


        }

        @Override
        public double divide(double x, double y) {
            double p=0;
            p = x/y;

            logger.info(p);
            return p;



    };


}
