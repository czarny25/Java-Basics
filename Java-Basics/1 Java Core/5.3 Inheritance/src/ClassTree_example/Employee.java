package ClassTree_example;
// created by Marcin 
public class Employee {
        
        private String name = "Johny Sample";
        private String jobTitle = "Unemployeed";
        private String PPSno = "234234U";
    
        
        public Employee(){                             
        }
        public Employee(String name){
            this.name = name;
            jobTitle = "Unemployeed";
            PPSno = "234234U";                       
        }
        public Employee(String name, String jobTitle){
            this.name = name;
            this.jobTitle = jobTitle;
            PPSno = "234234U";                       
        }
        public Employee(String name, String jobTitle, String PPSno){
            this.name = name;
            this.jobTitle = jobTitle;
            this.PPSno = PPSno;                       
        }
        
//        public void setName(String name){
//            this.name = name;
//        }
//        public String getName(){
//            return name;
//        }        
//        public void setJobTitle(String jobTitle){
//            this.jobTitle = jobTitle;
//        }
//        public String getJobTitle(){
//            return jobTitle;
//        }
//        public void setPPSno(String PPSno){
//            this.PPSno = PPSno;
//        }
//        public String getPPSno(){
//            return PPSno;
//        }
        
        public String ToString() {
            String state = String.format("My name is %s and I work as %s whit PPS No %s", name,jobTitle,PPSno);
            return state;
        
        }
}   

