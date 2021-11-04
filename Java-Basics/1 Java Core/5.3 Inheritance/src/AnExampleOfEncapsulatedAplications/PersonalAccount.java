package AnExampleOfEncapsulatedAplications;
/** 
 * @created by Marcin 
 */ 
public class PersonalAccount {
       
    private String firstname;
    private String MiddleName = "";
    private String Surname;
    private String accountNumber;
    private String dataBirth;
    private String[]address;
    
    public void setFirstName(String name){
        this.firstname = name;
    }
    public String getFirstName(){
        return firstname;
    }

    public void setSurname(String name){
        this.firstname = name;
    }
    public String getSurname(){
        return firstname;
    }
    public void setMiddleName(String MiddleName){
        if(MiddleName.equals("")){
            MiddleName = MiddleName;}
        else
            this.MiddleName = MiddleName;
    }
    public String getMiddleName(){
        return MiddleName;
    }
    public void setAccountNumber(){
        GeneratePassword g = new GeneratePassword();
         
    }
    
    public void setDataBirth(String name){
        this.firstname = name;
    }
    public String getDataBirth(){
        return firstname;
    }
    

}

   