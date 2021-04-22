package edu.pingpong.mollap.manager;

import edu.pingpong.mollap.filter.Filter;
import edu.pingpong.mollap.target.Target;

public class FilterManager {

    private FilterChain filterChain = null;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        this.filterChain.setTarget(target);
    }

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setTask(Filter task) {
        getFilterChain().addTask(task);
    }

    public void setTaskAt(int position, Filter task) {
        getFilterChain().addTaskAt(position, task);
    }

    public void executeTasks(String message) {
        getFilterChain().execute(message);
    }
}
