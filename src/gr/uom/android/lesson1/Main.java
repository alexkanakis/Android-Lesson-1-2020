package gr.uom.android.lesson1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nai geia sas");

        Account ac1 = new SavingsAccount("111222",1005,10000);
        Account ac2 = new SavingsAccount("111333", 1000,10000);
        Account ac3 = new SavingsAccount("111444", 1000,10000);
        Account ac4 = new SimpleAccount("111444",1000,0.12);

        System.out.println(ac1);
        System.out.println(ac2);
        System.out.println(ac3);
        System.out.println(ac4);

        ac1.withdraw(500);
        ac2.withdraw(100);
        ac3.withdraw(100);

        boolean what = ac3.equals(ac4);
        System.out.println("Are equal ?"+what);


        //an thelw na ftiaksw mazika antikeimena

        // Random randomGen = new Random();

        //int posa = 1000;

        //List<Account> accountList = new ArrayList<>();




        /*
        for (int i=0; i<posa; i++){
            String randomString = ""+ (1000000 + randomGen.nextInt(1000000));
            Account  account = new Account("GR_" + randomString);
            accountList.add(account);
        }

        accountList.forEach(System.out::Println);
                isodunamei
        for(Account ac: accountList){
        + ac.setBalance(randomGen.nextDouble()*1000);
        System.out.println(ac);
        }
         */

    }

}
