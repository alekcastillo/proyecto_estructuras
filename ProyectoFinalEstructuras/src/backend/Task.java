/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

//model para las tareas con sus respectivos metodos
public class Task {
    private int id, priority, status;
    private String title, description;
    private User assignee;
    private boolean deleted;
    private static final String[] statuses = {"Defined", "In-Progress", "Completed", "Accepted", "Cancelled"};
    
    public Task(int status, int priority, String title, String description, User assignee) {
        this.status = status;
        this.priority = priority;
        this.title = title;
        this.description = description;
        this.assignee = assignee;
    }
    
    //obtener los status de las tareas 
    public static String[] getStatuses() {
        return statuses;
    }
    //obtiene los titulos para colocarlos en el model de la tabla
   
    public String[] getTableRow() {
        String[] output = {String.valueOf(id), title, String.valueOf(priority), statuses[status], assignee.getName()}; //String.valueOf(backlog.tasks.length())};
        return output;
    }
    //mueve una tarea del backlog a un sprint
    public void moveToSprint(Sprint sprint) {
        sprint.addTask(status, priority, title, description, assignee);
        this.deleted = true;
    }
    
    //Setters & Getters
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
}
