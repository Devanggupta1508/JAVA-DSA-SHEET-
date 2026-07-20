import java.util.Scanner;

class BankAccount {

    public int accountNumber ;
    private int balance ;
   
    
           void setAccountNumber (int accountNumber){
              this.accountNumber = accountNumber ;

              System.out.println("Your Account is Ready  Your Account number is "+ accountNumber );
            
          }

          void getAccountNumber(){
            System.out.println(" Your Account number is "+ accountNumber );

          }
        

void balanceCheck(){
    System.out.println("Balance in your account " +this.balance);
     }


     void credit(int credit){
       
         this.balance += credit;
          System.out.println(credit + "  Amount is credit in your account to  "+ accountNumber + " and total balanced is"+ balance);
     }

      void debit(int debit){

         this.balance -= debit;
         System.out.println(debit + "  Amount is debit in your account  from account number "+ accountNumber + " and total balanced is "+ balance );
     }

}


class GETSETMETHOD {
    public static void main( String[] args){
   
         BankAccount Devang = new BankAccount();
           Devang.setAccountnumber(74047);
           Devang.credit(50000);

           Devang.balanceCheck();
             Devang.debit(25000);

             Devang.balanceCheck();
          

    }
}
           