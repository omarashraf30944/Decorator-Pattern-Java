/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pc.decorator;

/**
 *
 * @author omar
 */
public class Whip extends CondimentDecorator{
    
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.69;
    }
    
    
}
