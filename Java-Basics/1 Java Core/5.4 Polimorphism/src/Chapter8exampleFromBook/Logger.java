package Chapter8exampleFromBook;
import java.io.*;
// created by Marcin 
public class Logger {
        
    private BufferedWriter out = null;
    
    public Logger() throws IOException {
        out = new BufferedWriter(new FileWriter("logfile.txt"));
    }
    public void appendToLog(Logable logable) throws IOException {
        out.write("Object history: " + logable.getInitInfo());
        out.newLine();
        out.write("Object log event: " + logable.getLogableEvent());
        out.newLine();
    }
    public void close()throws IOException {
        out.flush();
        out.close();
    }
    
}

