package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UseTrim {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;

    System.out.println("Enter 'stop' to quit.");
    System.out.println("Enter letter: ");
    do {
      str = br.readLine();
      str = str.trim();

      if (str.equals("I"))
        System.out.println("I");
      else if (str.equals("M"))
        System.out.println("M");
      else if (str.equals("C"))
        System.out.println("C.");
      else if (str.equals("W"))
        System.out.println("W");
    } while (!str.equals("stop"));
  }
}