package com.UmidJavaUdemy;

public class Main {

    public static void main(String[] args) {
//	    Account myAccount = new Account("ウミドの銀行口座");
//	    myAccount.depositAmount(100);
//	    myAccount.withdrawAmount(500);
//	    myAccount.depositAmount(600);
//	    myAccount.withdrawAmount(-100);
//        myAccount.depositAmount(-100);
//        myAccount.depositAmount(700);
//        myAccount.calcBalance();
//
//        System.out.println(myAccount.getAccName() + "残高は " + myAccount.getBalance());
//        int pw = 674312;
//        Password password = new ExtendPass(pw);
//        password.storePassword();
//        password.getIn(1);
//        password.getIn(7979);
//        password.getIn(-888);
//        password.getIn(0);
//        password.getIn(674312);
        System.out.println("正面方法が起動しました");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("保有車両は " + SIBTest.owner);

    }
}
