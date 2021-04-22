package edu.pingpong.mollap.target;

public class Vehicle implements Target {

    public Vehicle() {
    }

    @Override
    public void execute(String message) {
        System.out.println("Door opened for " + message + "!");
    }
}
