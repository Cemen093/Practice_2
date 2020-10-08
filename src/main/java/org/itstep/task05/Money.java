package org.itstep.task05;

import org.itstep.task04.Fraction;

public class Money {
    private long hryvnia;
    private byte kopecks;
    private final byte MAX_KOPECKS = 100;

    // - час жизни что бы понять какие аргументы должны принимать методы

    public Money() {
    }

    public Money(long hryvnia) {
        this.hryvnia = hryvnia;
        this.kopecks = 0;
    }

    public Money(long hryvnia, byte kopecks) {
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    public void displayingValueOnScreen(){
        System.out.println(hryvnia + "," + kopecks);
    }
    public Money addition(Money b){
        return new Money(hryvnia + b.hryvnia + (kopecks + b.kopecks) / MAX_KOPECKS,
                (byte) ((kopecks + b.kopecks) % MAX_KOPECKS));
    }

    public Money subtraction(Money b){
        if (kopecks - b.kopecks < 0){
            return new Money(hryvnia - b.hryvnia - 1,
                    (byte)( MAX_KOPECKS - b.kopecks + kopecks));
        }
        else {
        return new Money(hryvnia - b.hryvnia,
                (byte)(kopecks - b.kopecks));
        }
    }

    public Money multiplication(int b){
        if (kopecks * b >= MAX_KOPECKS){
            return new Money(hryvnia * b + 1,
                    (byte)((kopecks * b) % MAX_KOPECKS));
        }
        else{
            return new Money(hryvnia * b,
                    (byte)(kopecks * b));
        }
    }

    public Money division(double  b){
        return new Money((long)(hryvnia / b), (byte)(kopecks / b));
    }

    public Money multiply(double b){
        if (kopecks * b > 99) {
            return new Money((long)(hryvnia * b + 1), (byte)(kopecks * b % MAX_KOPECKS));
        }
        else{
            return new Money((long)(hryvnia * b), (byte)(kopecks * b));
        }
    }

    public boolean equals(Money b){
        if (hryvnia == b.hryvnia && kopecks == b.kopecks){return true;}
        else{return false;}
    }

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }
}
