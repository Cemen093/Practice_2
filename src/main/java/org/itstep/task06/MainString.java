package org.itstep.task06;

public class MainString {
    private char[] chars;
    private int len;

    public MainString() {
        chars = new char[0];
        len = 0;
    }

    public MainString(String s) {
        chars = s.toCharArray();
        len = s.length();
    }

    public MainString(char a, int _len) {
        chars = new char[_len];
        for (int i = 0; i < _len; i++) {
            chars[i] = a;
        }
        this.len = _len;
    }

    public int length() {
        return len;
    }

    public void clean() {
        chars = new char[0];
        len = 0;
    }

    public MainString concat(MainString b){

        return new MainString(this.toString() + b.toString());
    }

    public int indexOf(int a){
        //Ну вот с каких это пор мы символ записываем в инт?
        //верните мне мои 20 минут жизни
        for (int i = 0; i < len + 1; i++) {
            if (chars[i] == a){
                return i;
            }
        }
        return 0;//Ех
    }

    public String toString(){
        //тут самому считать или return chars.toString();
        String s = "";
        for (int i = 0; i < len; i++) {
            s = s + chars[i];
        }
        return s;
    }
}
