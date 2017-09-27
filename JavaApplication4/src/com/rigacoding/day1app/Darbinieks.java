/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Darbinieks {
    String Vards;
    String UzVards;
    int DzGads;
    String Epasts;
    String Tālrunis;
    Adrese DzīvesVieta;
    Nodaļa AktuālāNodaļa;
    Nodaļa IepriekšējāNodaļa ;
    
    
     Darbinieks(String Vards){
       this.Vards = "Edgars";
    }
    
    String getVards(){
       return Vards;
   }
    String getUzvārds(){
       return UzVards;
   }
    int getDzG(){
       return DzGads;
   }
    String Epasts(){
       return Epasts;
       
   }String getTalr(){
       return Tālrunis;
   }
   Adrese getDzīvesVieta(){
       return DzīvesVieta;
   }
    Nodaļa IepN(){
       return IepriekšējāNodaļa;
   }
     Nodaļa AktNod(){
       return AktuālāNodaļa;
   }
    
    
}
