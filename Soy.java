/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pc.decorator;

/**
 *
 * @author omar
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() +  0.50;
    }
    
    
}
