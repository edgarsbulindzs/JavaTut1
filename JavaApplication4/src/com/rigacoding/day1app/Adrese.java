/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Adrese {
    String Valsts = "Latvia";
    String Pilseta = "Tukums";
    String Iela = "Rīgas iela";
    String Mājasnr = "67";
    String Dzīvokļanr = null;
   String AtrasanasV;
    
    String getSquare(){
     
     return this.Valsts +" "+ this.Pilseta+" "+ this.Iela+" " + this.Mājasnr+ " " + this.Dzīvokļanr; 

    }
    String getAtVieta(){
      return this.AtrasanasV = "Latvia, Rīga , Jumavas iela 67";
    }
}
