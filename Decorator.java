/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.pc.decorator;

/**
 *
 * @author omar
 */
public class Decorator {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
        
        Beverage beverage1 = new HouseBlend();
        
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);
        
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());
        
        

    }
}
