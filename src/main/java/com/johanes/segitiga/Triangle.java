/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.segitiga;

/**
 *
 * @author acer
 */
public class Triangle extends GeometricObject{
    private double side1,side2,side3;
    
    //No Arg Constructor
    Triangle(){
        side1 = side2 = side3 = 1.0;
    }
    //Arg Constructor
    Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //Accesor itu getter
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }
    //mutator
    public void setSide1(double side1){
        this.side1 = side1;
    }
     public void setSide2(double side2){
        this.side2 = side2;
    }
    
      public void setSide3(double side3){
        this.side3 = side3;
    }
    
     public double getArea(){
         double s = (0.5) * this.side1*this.side2*this.side3;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

     }
     public double getPerimeter(){
         return (this.side1 + this.side2 + this.side3);
     }
     
     @Override
     public String toString(){
         return "Triangle: Side 1 " + this.side1 + " Side 2: " + this.side2 + " Side 3: " + this.side3;
          
     }
     
    
    
}
