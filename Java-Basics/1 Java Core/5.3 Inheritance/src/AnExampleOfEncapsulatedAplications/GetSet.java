package AnExampleOfEncapsulatedAplications;

/** created by Marcin 
 *  this class explain the idea of encapsulation using getter and setter methods
 */ 


class CallGetSet{
    public static void main(String args[]){

        GetSet gs = new GetSet();
        
        gs.setName("Marcin");
        String result = gs.getName()+"\n";
        System.out.print(result);
        
    }

}


 class GetSet {    
    /** 
     * Declare variables that describe essentials data about account
     */ 
    private String name = "Roman"; // represent instant variable
    private double balance;
    private String accountNum;
    /**     
     * @param newName 
     */
    public void setName(String name){    // method takes parameter "Marcin" from method call    
        name = name;         //  in this example "Marcin" stays local and refers to it self
//        this.name = name;    //  in this example keyword "this" refers to instant variable "Roman" 
                             //  and set it to "Marcin" so method "getName" reurns "Marcin"            
    }
    /**     
     * @return name
     */
    public String getName(){
        return name;  // method return instance variable "Roman"
    }
    
}   
    


