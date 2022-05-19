package com.zaremba.guiintro;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {
    public SimpleStringProperty name;
    public SimpleStringProperty status;
    public SimpleStringProperty occupation;


    public Person(String name, String status, String occupation) {
        this.name =new SimpleStringProperty(name);
        this.status = new SimpleStringProperty(status);
        this.occupation = new SimpleStringProperty(occupation);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public String getOccupation() {
        return occupation.get();
    }

    public SimpleStringProperty occupationProperty() {
        return occupation;
    }
}
