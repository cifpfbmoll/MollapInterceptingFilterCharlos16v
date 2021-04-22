package edu.pingpong.mollap.filter;

public class Register implements Filter {

    @Override
    public void execute(String message) {
        System.out.println(message + " registered succesfully!");
    }
}
