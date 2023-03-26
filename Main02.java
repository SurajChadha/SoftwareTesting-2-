import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age=sc.nextInt();
    System.out.println("Enter Deposit Amount: ");
    int amount=sc.nextInt();
    if(age>=21&&amount>=100){
      System.out.println("Account type A ");
    }
    else if(age>=21&&amount<100)
      {
      System.out.println("Account Type C ");
      }
    else if(age<21&&amount>=100){
      System.out.println("Account type B ");
    }else{
    System.out.println("cannot open Account");
    }
  }
}