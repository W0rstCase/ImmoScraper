package org.oszimt.fa83.emailhandler;

public class EmailSupplier {

    private String email;
    private static final EmailSupplier INSTANCE = new EmailSupplier();

    private EmailSupplier(){
        //hide constructor
    }

    public static EmailSupplier getInstance(){
        return INSTANCE;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}