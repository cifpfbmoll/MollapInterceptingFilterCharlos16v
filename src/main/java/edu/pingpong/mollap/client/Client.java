package edu.pingpong.mollap.client;

import edu.pingpong.mollap.manager.FilterManager;

public interface Client {

    void setFilterManager(FilterManager filterManager);

    void sendRequest(String message);
}
