/**
 * @Author : Chen Shu
 * @Date : Created by cs on 2020/1/5.
 * @Description :
 */
public class Cryptography {

    public static void main(String[] args) {
//        System.out.println("The answer is: "+Euclidean(5,4)); // 最大公约数求值
//        System.out.println("The answer is: "+MultiplicativeInverse(75,28)); //求t = b^(-1) mod a
//        System.out.println("阶数为: "+Order(5,7)); //求阶数,即求使得a^m = 1 (mod n)的m的值
//        System.out.println(Ramainder(Math.pow(9726,3533),11413)); //模运算(double)
//        Factor(17);  // 分解质因数
//        System.out.println(Euler(8));  //求n的欧拉函数值
    }

    /**
     * 求阶数,即求使得a^m = 1 (mod n)的m的值
     * 本原元(素)：如果元素a模素数n的阶m=n-1,则称a是一个模n的本原元(素)
     * @param a
     * @param n
     * @return
     */
    public static int Order(int a, int n) {
        for(int i = 1; i <= n; i++) {
            if(Ramainder((int) Math.pow(a,i), n) == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 模运算(int)
     * @param dividend
     * @param dividor
     * @return
     */
    public static int Ramainder(int dividend, int dividor) {
        if(dividend < 0) {
            return Ramainder(dividend + dividor, dividor);
        } else if (dividend > dividor) {
            return Ramainder(dividend - dividor, dividor);
        } else return dividend - dividend / dividor * dividor;
    }

    /**
     * 模运算(double)
     * @param dividend
     * @param dividor
     * @return
     */
    public static double Ramainder(double dividend, double dividor) {
        if(dividend < 0) {
            return Ramainder(dividend + dividor, dividor);
        } else if (dividend > dividor) {
            return Ramainder(dividend - dividor, dividor);
        } else return dividend - dividend / dividor * dividor;
    }

    /**
     * 求最大公约数
     * @param a
     * @param b
     * @return
     */
    public static int Euclidean(int a, int b) {
        int r0 = a;
        int r1 = b;
        int q = r0 / r1;
        int rr = r0 - q * r1;
        while (rr != 0) {
            System.out.println(q);
            r0 = r1;
            r1 = rr;
            q = r0 / r1;
            rr = r0 - q * r1;
        }
        System.out.println(q);
        return r1;
    }

    /**
     * 求t = b^(-1) mod a
     * @param a
     * @param b
     * @return
     */
    public static int MultiplicativeInverse(int a, int b) {
        int a0 = a;
        int b0 = b;
        int t0 = 0;
        int t = 1;
        int q = a0 / b0;
        int r = a0 - q * b0;
        int tmp;
        while (r > 0) {
            tmp = Ramainder(t0 - q * t, a);
            t0 = t;
            t = tmp;
            a0 = b0;
            b0 = r;
            q = a0 / b0;
            r = a0 - q * b0;
        }
        if(b0 != 1) {
            return -1;
        } else {
            return t;
        }
    }

    /**
     * 平方-乘算法，用于快速实现模指数运算
     * @param x
     * @param c
     * @param n
     * @param l
     * @return
     */
//    public static int SquareMultiply(int x, int c, int n, int l) {
//        int z = 1;
//        for(int i = l-1; i >= 0; i--) {
//            z = Ramainder(z * z, n);
//            if(c == 1) {
//                z = Ramainder(z * x, n);
//            }
//        }
//        return z;
//    }

    /**
     * 分解质因数
     * @param num
     */
    public static void Factor(int num) {
        System.out.print("分解的结果为：");
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                System.out.print(i+"*");
                num /= i;
                i--;
            }
        }
        System.out.print(num);
    }

    /**
     * 求n的欧拉函数值
     * @param n
     * @return
     */
    public static int Euler(int n) {
        int res = n;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                res = res / i * (i - 1);
                while(n % i == 0) n /= i;
            }
        }
        if(n > 1) res = res / n * (n - 1);
        return res;
    }

}
