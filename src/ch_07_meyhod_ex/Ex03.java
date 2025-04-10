package ch_07_meyhod_ex;

public class Ex03 {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a + ", " + b + ", " + c + " 중에 제일 큰수는 " + getMax(a,b,c) + "입니다.");
        System.out.println(a + ", " + b + " 중에 제일 큰수는 " + getMax(a,b) + "입니다.");
    }
    static int getMax(int a, int b, int c){
        //10, 20, 30
        int max = a; // max : 10
        if (max < b) max = b; // max : 20
        if (max < c) max = c; // man : 20
        return max;
    }
    static int getMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
        // return a> b ? a : b;

    }
}
