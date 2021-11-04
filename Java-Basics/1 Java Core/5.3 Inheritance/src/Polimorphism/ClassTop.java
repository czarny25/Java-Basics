package Polimorphism;

// created by Marcin 
public class ClassTop {
        
    String name;
    int age;
    String sex;
    
    public ClassTop(){
        name = "ziuta";
        age = 45;
        sex = "baba";
    }

    public ClassTop(String name,int age,String sex){
        
        char whitespace = ' ';
        int counter = 0;
            for(int i = 0;i < name.length();i++){
                if(name.charAt(i) == whitespace)
                   System.out.println();
                else
                   this.name = name;                  
            }  
        this.age = age;
        this.sex = sex;
    }
    
    public void present(){
        System.out.print("I am a " + sex + " named " + name + " and I am " + age + " old.");
    }
}

