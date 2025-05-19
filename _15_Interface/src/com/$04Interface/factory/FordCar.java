package com.$04Interface.factory;

// 다른 패키지에 있는 선언을 접근할 때
import com.$04Interface.order.*;

public class FordCar extends ParentCar {

    @Override
    public void turnOn() {
        System.out.println(this.getClass() + " - The engine starts well.");
        delay();
    }
    
    @Override
    public void turnOff() {
        System.out.println(this.getClass() + " - The start-off works well~");
        delay();
    }
    
    @Override
    public void accel() {
        System.out.println(this.getClass() + " - The accelerator accelerates well~");
        delay();
    }
    
    @Override
    public void footBreak() {
        System.out.println(this.getClass() + " - Have a good break stop well~");
        delay();
    }

}
