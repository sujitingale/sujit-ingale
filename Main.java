import java.util.Scanner;


 class Objects{
  
   Scanner s=new Scanner(System.in);
       int ch;
       int balance=50000;
       public void cashwithdraw()
       {
         
         System.out.println("Enter your withdraw cash .");
         int ammount=s.nextInt();
         if(ammount>balance)
         {
           System.out.println("error!!!!! your ammount  is not withdraw becuse your current balance "+balance);
         }
         else
         {
           balance-=ammount;
           
           System.out.println(ammount+"ammount withdraw successfully  .");
         }
         
       }
       
       public void cashdeposite()
       {
         System.out.println("Enter your Diposite cash .");
         int depo=s.nextInt();
         balance+=depo;
         
          System.out.println("you are deposited ."+depo);
         
       }
       public void checkbalance()
       {
         System.out.println("your current balance is:Rs."+balance);
        
         
       }
  
};
class Main {
    public static void main(String[] args) {
     

       Objects obj=new Objects();
       
            int ch;
      do
      {
        System.out.println("** SBI ATM   **");
        System.out.println(" 1 CASH WITHDRAW \n 2 CASH DEPOSITE \n 3 BALANCE ENQUIRY \n 4 EXIT \n ");
        System.out.println("Enter you choice :");
        Scanner sc=new Scanner(System.in);
         ch=sc.nextInt();
       
        switch(ch)
        {
          case 1:
            obj.cashwithdraw();
            break;
             case 2:
            obj.cashdeposite();
            break;
             case 3:
            obj.checkbalance();
            break;
             case 4:
            System.exit(0);
            break;
           default:
    System.out.println("invalid choice");
        }
       
      }while(ch!=4);
      
   
  }
}
