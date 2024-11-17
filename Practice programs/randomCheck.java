import java.util.*;
class randomCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sqrt= Math.sqrt(5);
        double p1 = (1+sqrt)/2;
        double ans = Math.round(Math.pow(p1, n)/sqrt);
        System.out.println(ans);
    }
}
// 1 1 2 3 5 8 13 21