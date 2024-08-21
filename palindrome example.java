public class Main { 
    public static void main(String[] args) {
      System.out.println("Enter an integer:"); 
      java.util.Scanner input=new java.util.Scanner(System.in); 
      int number=input.nextInt(); 
      System.out.println(isPalindrome(number)); 
    }
    public static int reverse(int number) { 
      int reversedNumber = 0;
      while (number != 0) { 
          int remainder = number % 10;
          reversedNumber = reversedNumber * 10 + remainder;
          number=number/10;
      }
      return reversedNumber;
    }
    public static boolean isPalindrome(int number) {
      return number == reverse(number);
    }
  }
  