import java.util.*;

public class CouponCollector {
    public static void main (String[] args) {
        //input sizes to 400 by 200s
        for (int i = 200; i <= 4000; i += 200) {
            couponAlgorithm(i);
        }
    }

    //Give input size n find how many tries it takes to find.
    //all the distinct coupons.
    public static void couponAlgorithm(int n) {
        Set<Integer> distinctCoupons = new HashSet<>();
        int couponsCollected = 0;
        int totalCoupons = n;
        Random rand = new Random();
        while(distinctCoupons.size() < totalCoupons) {
            int randCoupon = rand.nextInt(n) + 1;
            if(!distinctCoupons.contains(randCoupon)) {
                distinctCoupons.add(randCoupon);
            }
            couponsCollected++;
        }
        distinctCoupons.clear();
        System.out.println("Total possible distinct coupons " + n + " total tries " + couponsCollected + " average tries " + ((double)couponsCollected / n));
    }
}