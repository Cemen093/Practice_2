package org.itstep.task07;


public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public boolean equals(Complex b){
        //a+bi=c+di означает, что a=c и b=d (два комплексных числа равны между собой тогда и только тогда,
        // когда равны их вещественные и мнимые части).
        if (real == b.real && imaginary == b.imaginary){ return true;}
        else {return false;}
        //Warning:(20, 9) 'if' statement can be simplified как?
    }

    public Complex plus(Complex b){
        //(a+bi)+t(c+di)=(a+c)+(b+d)i
        return new Complex(real + b.real, imaginary + b.imaginary);
    }

    public Complex minus(Complex b){
        //(a+bi)-(c+di)=(a-c)+(b-d)i
        return new Complex(real - b.real, imaginary - b.imaginary);
    }
    
    public Complex times(Complex b){
        //(a+bi)*(c+di)=(ac-bd)+(ad + bc)i
        return new Complex(real * b.real - imaginary * b.imaginary,
                real * b.imaginary + imaginary * b.real);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString(){
        if (imaginary == 0){return new String(String.valueOf(real));}
        else{
            if (real == 0){return new String(imaginary + "i");}
            else{
                if (imaginary > 0){return new String( real + " + " + imaginary + "i"); }
                else{return new String( real + " - " + Math.abs(imaginary) + "i");}
            }
        }
    }
}
