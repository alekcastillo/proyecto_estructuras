/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import backend.User;


// Nodo encargado de almacenar la informacion del objeto en la cola
public class Node {
    private User object;
    private Node previous;
    
    public Node(User object) {
        this.object = object;
    }
    
    public void clearPointers() {
        previous = null;
    }
    
    public User getObject() {
        return object;
    }

    public void setObject(User object) {
        this.object = object;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
