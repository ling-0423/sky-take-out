package com.sky.constant;

public class OrderStatus {
    public static final int TO_BE_PAID = 0;       // 待付款
    public static final int PAID = 1;             // 已支付/待制作
    public static final int MAKING = 2;           // 制作中
    public static final int WAITING_PICKUP = 3;   // 待取餐
    public static final int COMPLETED = 4;        // 已完成
    public static final int CANCELLED = 5;        // 已取消
}