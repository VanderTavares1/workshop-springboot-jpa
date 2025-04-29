package com.vandertavares.vandin.enums;

public enum OrderStatusEnum {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatusEnum(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatusEnum valueOf(int code) throws IllegalAccessException {
        for (OrderStatusEnum value : OrderStatusEnum.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalAccessException("Invalid OrderStatusEnum code");
    }
}
