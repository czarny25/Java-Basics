package SimpleAssignmentOperator;

// created by Marcin 
public class ImplicitConvertion {
        public static void main(String args[]){

            byte b = 23;
            short s = 23;
            int i = 234;
            long l = 234434;
            char c = 232;
            boolean bo = true;
            
            // implicit cast is possible only when bigger primitive is converted to smaller in size
            
            b = (byte)s; // in other way arround java requires explicit cast
            s = b;
            
            s = (short)i;
            i = s;
            
            i = (int)l;
            l = i;
            
            l = (long)c;
            c = (char)l;
            
//            c = (char)bo;              //
//            bo = (boolean)c;           // we are not allowed to cast anything 
//            String st = (boolean)bo;   // to boolean
            
            long r = 234234;
            byte t = 023;
            r = t;
            t = (byte)r;
            
            double w = 4234.90f;            
            int a =  442342344;
            
            w = a;
            a = (int)w; // An explicit conversion is where you use some syntax to 
                        // tell the program to do a conversion. For example casting
                           
            float f = 232423.334f;
            int e = 234232;
            
            i = e; // convertion is allowed if there is no precision lost
//            e = i; // precision lost convertoion not allowed
        
        
        }

}

