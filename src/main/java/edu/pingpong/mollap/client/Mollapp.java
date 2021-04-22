package edu.pingpong.mollap.client;

import edu.pingpong.mollap.manager.FilterManager;

public class Mollapp implements Client {

    private FilterManager filterManager;

    public Mollapp() {
    }

    @Override
    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    @Override
    public void sendRequest(String request) {
        filterManager.executeTasks(request);
    }
}
