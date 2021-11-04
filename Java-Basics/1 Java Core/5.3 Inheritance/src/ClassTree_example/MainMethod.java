package ClassTree_example;

// created by Marcin 

import javax.swing.JOptionPane;

public class MainMethod {
        public static void main(String args[]){

            String result = "";
            
//           Employee e = new Employee();
//           Employee d = new Employee("Frank Morgan");
//           Employee c = new Employee("Norman Filet","Java Senior");
//           Employee b = new Employee("Hans Kloss","Spy","259684R");
//           
//           Employee s1 = new ContractedEmployee(23.45);
//           Employee s2 = new ContractedEmployee(23.45);
//           Employee s3 = new ContractedEmployee(23.45);
//           
//           Employee e1 = new FullTimeEmployee(567.45, 123.00);
//           Employee e2 = new FullTimeEmployee(623.45, 34);
//           Employee e3 = new FullTimeEmployee(923.45, 239);
           
           Employee p1 = new PartTimeEmployee(10.05, 39, "Hela", "Pomywaczka","14686484U");
           Employee p2 = new FullTimeEmployee(586.23, 123.12);
           
//           result = b.ToString()+ "\n" + d.ToString()+ "\n" + s2.ToString()+ "\n" + s3.ToString()+ "\n\n" + e1.ToString()
//                   + "\n\n" + p1.ToString();
           
           result = p1.ToString() + "\n" + p2.ToString(); 
           JOptionPane.showMessageDialog(null, result);
           
//           
//           e.findPaymentAmount();
//           e.setName("Frank");


        }

}

