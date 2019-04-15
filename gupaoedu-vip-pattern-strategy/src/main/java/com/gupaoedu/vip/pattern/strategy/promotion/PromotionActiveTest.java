package com.gupaoedu.vip.pattern.strategy.promotion;

import java.util.PropertyPermission;

public class PromotionActiveTest {

//    public static void main(String[] args) {
//        PromotionActive active618 = new PromotionActive(new CouponStrategy());
//        active618.excute();
//
//        PromotionActive active11 = new PromotionActive(new GroupBuyStrategy());
//        active11.excute();
//    }

//    public static void main(String[] args) {
//        PromotionStrategy strategy = null;
//        String strategyKey = "";
//
//        if("COUPON".equals(strategyKey)){
//            strategy = new CouponStrategy();
//        }else if ("CUSHBACK".equals(strategyKey)){
//            strategy = new CushBackStrategy();
//        }else if ("GROUPBUY".equals(strategyKey)){
//            strategy = new GroupBuyStrategy();
//        }else {
//            strategy = new EmptyStrategy();
//        }
//        new PromotionActive(strategy).excute();
//    }


    public static void main(String[] args) {
        String promotionStrategyKey = "CUSHBACK";
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionStrategyKey);
        new PromotionActive(promotionStrategy).excute();

    }
}
