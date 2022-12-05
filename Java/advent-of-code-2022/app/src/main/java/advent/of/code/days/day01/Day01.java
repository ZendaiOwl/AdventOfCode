package advent.of.code.days.day01;

import java.util.Scanner;

public class Day01 {

  private final static String TXTFile = "input.txt";

  public static void readInputText() {
    Scanner sc;
    try {
      sc = new Scanner(TXTFile);
    } catch (Exception e) {
      System.out.println(e);
      return;
    }
    sc.close();
  }

  public static void main(String[] args) {
    
  }
}
