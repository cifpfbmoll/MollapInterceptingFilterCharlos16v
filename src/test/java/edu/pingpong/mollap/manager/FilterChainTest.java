package edu.pingpong.mollap.manager;

import edu.pingpong.mollap.filter.Autenticate;
import edu.pingpong.mollap.filter.Filter;
import edu.pingpong.mollap.filter.Register;
import edu.pingpong.mollap.target.Target;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilterChainTest {

    FilterChain filterChain = null;
    Target target = null;

    @Before
    public void setupFilterChain() {
        this.filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    @Test
    public void getTargetTest() {
        Assert.assertEquals(target, filterChain.getTarget());
    }

    @Test
    public void addTask() {
        Filter task = new Register();
        filterChain.addTask(task);
        Assert.assertTrue(filterChain.getTasks().contains(task));
    }

    @Test
    public void addTaskAt() {
        Filter task = new Register();
        Filter otherTask = new Autenticate();
        filterChain.addTask(task); // Added to the position 0 because its empty
        filterChain.addTaskAt(0, otherTask); // Substituting the position 0
        Assert.assertEquals(otherTask, filterChain.getTasks().get(0));
        Assert.assertEquals(task, filterChain.getTasks().get(1));
    }
}
