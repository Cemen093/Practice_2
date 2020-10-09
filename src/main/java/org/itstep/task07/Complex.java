package org.itstep.task07;

public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public boolean equals(Complex b){
    return true;
    }

    public Complex plus(Complex b){
        if (chec(this.imaginary, b.imaginary)){
            return new Complex(this.real + b.real + 1,
                    (this.imaginary + b.imaginary) % (int)Math.pow(10, Math.max(lenNamber(this.imaginary), lenNamber(b.imaginary))));
        }
        else {
            return new Complex(this.real + b.real, this.imaginary + b.imaginary);
        }
    }

    private boolean chec(int a, int b){
        int lenA = lenNamber(a);
        int lenB = lenNamber(b);
        if (lenA == 0 || lenB == 0){return false;}
        int checs = (int)(a / Math.pow(10,  lenA - 1) + b / Math.pow(10, lenB - 1));
        if (checs < 9){
        return false;
        }
        else {
            if (checs > 9){
                return true;
            }
            else{
                //гадство
                return chec((int)(a % Math.pow(10, lenA - 1)), (int)(b % Math.pow(10, lenB - 1)));
            }
        }

    }

    private int lenNamber(int a){
        int LenA = 0;
        while (a != 0){
            LenA++;
            a /= 10;
        }
        return LenA;
    }

    public Complex minus(Complex b){
        return b;
    }

    public Complex times(Complex b){
        return b;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
}
