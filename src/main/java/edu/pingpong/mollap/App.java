package edu.pingpong.mollap;

import edu.pingpong.mollap.client.Mollapp;
import edu.pingpong.mollap.filter.Autenticate;
import edu.pingpong.mollap.filter.Autorize;
import edu.pingpong.mollap.filter.Register;
import edu.pingpong.mollap.manager.FilterManager;
import edu.pingpong.mollap.target.Vehicle;

public class App {

    public static void main(String[] args) {

        /**
         * System FilterManager configuration
         * with the specified target.
         */
        FilterManager filterManager = new FilterManager(new Vehicle());

        /**
         * We add to the system the tasks that
         * we want the system to execute when we
         * receive the client's request.
         */
        filterManager.setTask(new Autenticate());
        filterManager.setTask(new Autorize());
        filterManager.setTaskAt(0, new Register());

        /**
         * Configuration of the client app to
         * execute the scheduled tasks and
         * send the message to the system.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setFilterManager(filterManager);
        mollapp.sendRequest("Francesc");
    }
}

