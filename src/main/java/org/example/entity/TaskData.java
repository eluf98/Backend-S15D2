package org.example.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks ;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getUnion(Set<Task> tasks1, Set<Task> tasks2) {
        tasks1.addAll(tasks2);
        return tasks1;
    }

    public Set<Task> getIntersection(Set<Task> task1, Set<Task> task2){
        task1.retainAll(task2);
        return task1;
    }

    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2){
        task1.removeAll(task2);
        return task1;
    }

    public Set<Task> getTasks(String name){
        return name.equals("ann")?
                bobsTasks:name.equals("bob") ?
                annsTasks:name.equals("carol") ?
                carolsTasks: unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }


}
