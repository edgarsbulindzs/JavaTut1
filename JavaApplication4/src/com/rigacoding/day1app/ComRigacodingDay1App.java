/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class ComRigacodingDay1App {

    /**
     * @param args the command line arguments
    
    public static void main(String[] args) {
        // TODO code application logic here
        Square square1 = new Square(12, "red");
        Square square2 = new Square(10, "yellow");
        
        
        System.out.println("kvadrāts ir " + square1.getcolor()+ "un tā laukums" +square1.getsquare());
        
        
       
    }*/
    
    //2) Mani sauc {Darbinieks:Vards}, un es pārgāju 
    //   uz {Aktuala nodala:Nosaukums} 
     //  no {Iepriekseja nodala:Nosaukums}, kurā bija {Max. darbinieki}
     //  un atradās {Atrasanas vieta}.
    public static void main(String[] args) {
      
        Darbinieks Db1 = new Darbinieks("Vards");
        Adrese ad = new Adrese();
        Nodaļa J = new Nodaļa();
        Nodaļa V = new Nodaļa();
        Nodaļa MxDb = new Nodaļa();
        Adrese AtrV = new Adrese();
        System.out.println("Mani sauc"+" "+Db1.Vards+" "+"es dzīvoju"+" "+ad.getSquare()+" " );
        
        
        
        
        System.out.println("Mani sauc"+" "+Db1.Vards+" "+"un es pārgāju uz"+" "+J.getsnodJ()+""
                + " "+"no"+" "+" "+V.getsnodV()+" "
                + ""+"kurā bija Maksimalais darbinieku skaits"+""
                        + " "+MxDb.MxDb()+" "+"un atradās"+" "+AtrV.getAtVieta() );
    }
}
