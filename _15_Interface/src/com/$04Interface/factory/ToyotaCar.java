package com.$04Interface.factory;
import com.$04Interface.order.*;

public class ToyotaCar extends ParentCar{
    
    @Override
    public void turnOn() {
        System.out.println(this.getClass() + " - 始動がスムーズによくかかる。");
        delay();
    }
    
    @Override
    public void turnOff() {
        System.out.println(this.getClass() + " - 起動が安定してオフになります。");
        delay();
    }
    
    @Override
    public void accel() {
        System.out.println(this.getClass() + " - Excelのパフォーマンスは安定しています。");
        delay();
    }
    
    @Override
    public void footBreak() {
        System.out.println(this.getClass() + " - ブレーキが安定して動作します。");
        delay();
    }
}
