package _4_Enumeration;

/**
 * @author Marcin
 */
enum ENUMtypes {    
    SALLON,ESTATE,CONVETIBLE;        
}
enum EnumColors {    
    RED,BLUE,BLACK,YELLOW,WHITE;    
}
enum EnumMark {    
    VW,BMW,AUDI,OPEL;    
}

public class Customer {

            ENUMtypes type = null;;
            
            public String typeChoice(String customer){
                
                String choice = null ;
                
            switch(type){
                case SALLON:
                    System.out.println("Your type is " + type.toString().toLowerCase());
                case ESTATE:
                    System.out.println("Your type is " + type.toString().toLowerCase());
                case CONVETIBLE:
                    System.out.println("Your type is " + type.toString().toLowerCase());
                    
            }
            return choice;
            }
        
}
