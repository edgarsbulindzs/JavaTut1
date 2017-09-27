/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Square {
    //malas garums
    double length;
    //kvadrata krāsa
    String color;
    
    Square(double length, String color){
        this.length = length;
        this.color = color;
    }
    //metodes ! laukuma aprēķins
    double getsquare(){
        return this.length * this.length;
    }
    String getcolor(){
        
        // rakstit this lai tiktu pie color vins piedāvā
        return this.color;
    }
    double getPerimeter(){
        return this.length *4;
    }
}
