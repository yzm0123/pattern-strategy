package com.gupaoedu.vip.pattern.strategy.promotion;

public class CouponStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("CouponStrategy: 优惠券活动");
    }
}
