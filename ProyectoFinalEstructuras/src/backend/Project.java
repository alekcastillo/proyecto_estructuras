package backend;

import java.util.Date;
import stack.Stack;

//clase principal proyect que funciona como un objeto interfaz entre los otros modelos
public class Project {
    private int id;
    private String title, description;
    public Sprint backlog;
    public Stack sprints;
    
    public Project(String title, String description) {
        this.title = title;
        this.description = description;
        this.backlog = new Sprint("Backlog", title + "'s backlog");
        this.sprints = new Stack();
    }
    
    // agrega un nuevo sprint al stack de sprints
    public Sprint addSprint(String title, String description, Date startDate, Date endDate) {
        Sprint sprint = new Sprint(title, description, startDate, endDate);
        sprints.push(sprint);
        return sprint;
    }
    
    // obtiene los titulos para el frontend
    public String[] getTableRow() {
        String[] output = {String.valueOf(id), title, String.valueOf(sprints.length()), String.valueOf(backlog.tasks.maxLength())};
        return output;
    }
    
    //Setters & Getters
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
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
}
