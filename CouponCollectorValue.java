import java.util.*;

public class CouponCollectorValue {
    public static void main(String[] args) {
        //Input test sizes 200 to 4000 by 200s
        for (int i = 200; i <= 4000; i += 200) {
            couponAlgorithm(i);
        }
    }

    //Takes input size and finds the smallest possible value for
    //coupon and stores it into distinctCoupons. This process will
    //go until distinctCoupons size is the same as input size. Even
    //If not all the possible small value were found for a coupon.
    public static void couponAlgorithm(int totalDistinctCoupons) {
        Map<Integer, Integer> distinctCoupons = new HashMap<>();
        Random rand = new Random();
        int total = 0;
        while(distinctCoupons.size() < totalDistinctCoupons) {
            int randCouponValue = rand.nextInt(totalDistinctCoupons) + 1;
            int randCoupon = rand.nextInt(totalDistinctCoupons) + 1;
            if(!distinctCoupons.containsKey(randCoupon)) {
                distinctCoupons.put(randCoupon, randCouponValue);
            } else {
                int newCouponV = randCouponValue;
                int previousCouponV = distinctCoupons.get(randCoupon);
                if(newCouponV < previousCouponV) {
                    distinctCoupons.put(randCoupon, newCouponV);
                }
            }
        }
        for(int values : distinctCoupons.values()) {
            total += values;
        }
        System.out.println("total was " + total + " out of " + totalDistinctCoupons + " average is " + ((double)total / totalDistinctCoupons));
    }
}
