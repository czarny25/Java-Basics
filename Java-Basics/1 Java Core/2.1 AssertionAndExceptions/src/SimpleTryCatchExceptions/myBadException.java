package SimpleTryCatchExceptions;

// created by Marcin 
// this is my own exception created by myself
class myBadException extends Exception {
       
    public myBadException() {
        System.out.print("You cannot divide by zero\n");
    }

}

