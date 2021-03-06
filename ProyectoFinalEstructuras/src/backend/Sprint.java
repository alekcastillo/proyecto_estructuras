package backend;

import java.text.SimpleDateFormat;
import java.util.Date;
import tree.Tree;

// model para los sprints para los proyectos
public class Sprint {
    private int id;
    private String title, description;
    private Date startDate, endDate;
    private boolean isBacklog;
    //arbol de tareas
    public Tree tasks;
    
    public Sprint(String title, String description) {
        this.title = title;
        this.description = description;
        this.tasks = new Tree();
        this.isBacklog = true;
    }
    
    public Sprint(String title, String description, Date startDate, Date endDate) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = new Tree();
        this.isBacklog = false;
    }
    
    // cambia el formato del objeto date a un string 
    public static String dateToString(Date date) {
        return new SimpleDateFormat("dd-mm-yyyy").format(date);  
    }
    
    // crea una tarea nueva y la agrega al arbol de tareas por cada sprint
    public Task addTask(int status, int priority, String title, String description, User assignee) {
        Task task = new Task(status, priority, title, description, assignee);
        tasks.add(task);
        return task;
    }
    
    //obtiene los titulos para ponerlos en el frontend
    public String[] getTableRow() {
        String[] output = {String.valueOf(id), title, dateToString(startDate), dateToString(endDate)}; //String.valueOf(backlog.tasks.length())};
        return output;
    }
    
    //Setters & Getters
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public boolean isBacklog() {
        return isBacklog;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
