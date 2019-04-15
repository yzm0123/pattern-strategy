package com.gupaoedu.vip.pattern.strategy.promotion;

public class PromotionActive extends EmptyStrategy {

    private PromotionStrategy promotionStrategy;

    public PromotionActive(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excute(){
        this.promotionStrategy.doPromotion();
    }
}
