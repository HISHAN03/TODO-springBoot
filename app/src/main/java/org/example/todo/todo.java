package org.example.todo;

public class todo {

    private long id;
    private String name;
    private boolean completed;


    public todo(){}

    public todo(Long id,String name,boolean completed){
        this.id=id;
        this.name = name;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return name;
    }

    public void setDescription(String description) {
        this.name = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }





}
