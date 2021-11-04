package jarDirectoryCheck;

import java.io.*;
import java.util.*;
import java.util.jar.*;

public class JarDir {
  public static void main (String args[]) throws IOException {

	  String directionFile = "C:\\Users\\M\\Desktop\\helloFormJar.jar";
	  
    JarFile jarFile = new JarFile(directionFile);
    
    
    Enumeration e = jarFile.entries();
    while (e.hasMoreElements()) {
      process(e.nextElement());
    }
  }

  private static void process(Object obj) {
    JarEntry entry = (JarEntry)obj;
    String name = entry.getName();
    long size = entry.getSize();
    long compressedSize = entry.getCompressedSize();
    System.out.println(
        name + "\t" + size + "\t" + compressedSize);
  }
}
        
      