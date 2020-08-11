package io.github.vixo341.simpletodoapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name = "description")
    private String description;

    @Column(name = "done")
    private boolean done;


    public Task() {
    }

    public int getId() {
        return Id;
    }

     void setId(final int id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

     void setDescription(final String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

     void setDone(final boolean done) {
        this.done = done;
    }



}
