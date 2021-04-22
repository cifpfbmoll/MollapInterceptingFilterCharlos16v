package edu.pingpong.mollap.filter;

public class Autorize implements Filter {

    public Autorize() {
    }

    @Override
    public void execute(String message) {
        System.out.println(message + " autorized succesfully!");
    }
}
