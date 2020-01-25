package com.UmidJavaUdemy;

public class ExtendPass extends Password {
    private int decryptedPw;

    public ExtendPass(int password) {
        super(password);
        this.decryptedPw = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password "+ this.decryptedPw);;
//    }
}
