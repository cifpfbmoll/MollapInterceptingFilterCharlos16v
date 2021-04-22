package edu.pingpong.mollap.filter;

public class Autenticate implements Filter {


    public Autenticate() {
    }

    @Override
    public void execute(String message) {
        System.out.println(message + " autenticated succesfully!");
    }
}
