package com.zaremba.guiintro;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Table implements Initializable {


    public TableView mainTable;
    public TableColumn colName;
    public TableColumn colStatus;
    public TableColumn colOccupation;
    public ObservableList<Person> people;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        people = FXCollections.observableArrayList();
        initCol();
        try {
            loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadData() {
        for(int i = 0 ; i < 10;i++){
            String name = "Name " + i;
            String status = "status " + i;
            String occ = "occupation " + i;

            people.add(new Person(name, status, occ));
        }
        mainTable.getItems().setAll(people);
    }

    private void initCol() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colOccupation.setCellValueFactory(new PropertyValueFactory<>("occupation"));
    }
}
