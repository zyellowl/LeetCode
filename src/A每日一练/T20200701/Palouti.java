package A每日一练.T20200701;

public class Palouti {

    public static void main(String[] args) {
        System.out.println(c(10));
        System.out.println(dg(10));
    }

    public static int c(int n){
        if(n<3)return n;
        /**
         * 错误写法
         *  int a=1,b=1;
         */
        int a=1,b=2;
        while (n>2){
            int t=a+b;
            a=b;
            b=t;
            n--;
        }
        return b;
    }

    public static int dg(int n){
        if(n<3)return n;
        return dg(n-1)+dg(n-2);
    }
}
