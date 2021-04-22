package edu.pingpong.mollap.manager;

import edu.pingpong.mollap.filter.Filter;
import edu.pingpong.mollap.target.Target;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private Target target = null;
    private final List<Filter> tasks = new ArrayList<>();

    FilterChain() {
    }

    public Target getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public List<Filter> getTasks() {
        return this.tasks;
    }

    public void addTask(Filter task) {
        getTasks().add(task);
    }

    public void addTaskAt(int position, Filter task) {
        getTasks().add(position, task);
    }

    public void execute(String message) {
        getTasks().forEach(task -> task.execute(message));
        if (!(target == null)) {
            getTarget().execute(message);
        }
    }
}
