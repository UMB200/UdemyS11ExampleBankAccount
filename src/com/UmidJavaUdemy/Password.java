package com.UmidJavaUdemy;

public class Password {
    private static final int key = 74857662;
    private final int encryptedPass;

    public Password(int password) {
        this.encryptedPass = decryptPass(password);
    }
    private int decryptPass(int password){
        return password ^ key;
    }
    public final void storePassword(){
        System.out.println("Saved password as " + this.encryptedPass);
    }
    public boolean getIn(int password){
        if(decryptPass(password) == this.encryptedPass){
            System.out.println("You got in");
            return true;
        }
        else {
            System.out.println("Password is wrong");
            return false;
        }
    }
}
