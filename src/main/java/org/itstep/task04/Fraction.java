package org.itstep.task04;


public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction addition(Fraction fraction){
        //а тут можно получить ссылку на класс в котором находишься? //Test.class или как? ничего не понял
        Fraction tmp;
        if (denominator != fraction.getDenominator()){
            tmp = new Fraction(numerator * fraction.getDenominator() + fraction.getNumerator() * denominator,
                    denominator * fraction.getDenominator());
        }
        else {
            tmp = new Fraction(numerator + fraction.getNumerator(), denominator);
        }
        tmp.fractionReduction();
        return tmp;
    }

    public Fraction subtraction(Fraction fraction){
        return addition(new Fraction(-fraction.getNumerator(), fraction.getDenominator()));
    }

    public Fraction multiplication(Fraction fraction){
        Fraction tmp = new Fraction(numerator * fraction.getNumerator(),
                denominator * fraction.getDenominator());
        tmp.fractionReduction();
        return tmp;
    }

    public Fraction division(Fraction fraction){
        return multiplication(new Fraction(fraction.getDenominator(),
                fraction.getNumerator()));
    }

    private void fractionReduction(){
        int a = this.getNumerator();
        int b = this.getDenominator();
        while (b !=0) {
            int tmp2 = a%b;
            a = b;
            b = tmp2;
        }
        this.setNumerator(this.getNumerator() / a);
        this.setDenominator(this.getDenominator() / a);
    }
}
