package edu.hw2.task1;

public sealed interface Expr {
    double evaluate();

    record Constant(double x) implements Expr {
        @Override
        public double evaluate() {
            return x;
        }
    }

    record Negate(Expr num) implements Expr {

        @Override
        public double evaluate() {
            return (-1) * num.evaluate();
        }
    }

    record Exponent(Expr num, int e) implements Expr {
        @Override
        public double evaluate() {
            return Math.pow(num.evaluate(), e);
        }
    }

    record Addition(Expr num, Expr num2) implements Expr {
        @Override
        public double evaluate() {
            return num.evaluate() + num2.evaluate();
        }
    }

    record Multiplication(Expr num, Expr num2) implements Expr {
        @Override
        public double evaluate() {
            return num.evaluate() * num2.evaluate();
        }
    }
}
