import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    StringBuffer sb1 = new StringBuffer(s1.replace(" ", ""));
    StringBuffer sb2 = new StringBuffer(s2.replace(" ", ""));
    for (int i = 0; i < sb1.length(); i++) {
      int c = 0;
      for (int j = i + 1; j < sb1.length(); j++) {
        if (sb1.charAt(i) == sb1.charAt(j)) {
          sb1.deleteCharAt(j);
          c++;
        }
      }
      if (c >= 1) {
        sb1.deleteCharAt(i);
      }
    }
    for (int i = 0; i < sb2.length(); i++) {
      int c = 0;
      for (int j = i + 1; j < sb2.length(); j++) {
        if (sb2.charAt(i) == sb2.charAt(j)) {
          sb2.deleteCharAt(j);
          c++;
        }
      }
      if (c >= 1) {
        sb2.deleteCharAt(i);
      }
    }
    int count = 0;
    for (int i = 0; i < sb1.length(); i++) {
      for (int j = 0; j < sb2.length(); j++) {
        if (sb1.charAt(i) == sb2.charAt(j)) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
