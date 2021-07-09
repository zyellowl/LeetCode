package A每日一练.T20200709;

public class Palouti {

    public static void main(String[] args) {
        System.out.println(c1(10));
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

    public static int c1(int n){
        if(n<3&&n>0) return n;
        int a=1,b=2;
        for (int i=3;i<=n;i++){
            int t=a+b;
            a=b;b=t;
        }
        return b;
    }
}
