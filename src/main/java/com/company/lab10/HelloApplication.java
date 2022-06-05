package com.company.lab10;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static List_of_Circles listOfCircles = new List_of_Circles();
    public static List_of_Cilinders listOfCylinders  = new List_of_Cilinders();

    @Override
    public void start(Stage stage) throws IOException {

        TableView<Circle> circleTableView = new TableView<Circle>();

        TableColumn<Circle, String> circle_Colum_R = new TableColumn<Circle, String>("Radius");
        TableColumn<Circle, String> circle_Colum_S = new TableColumn<Circle, String>("Square");
        TableColumn<Circle, String> circle_Colum_L = new TableColumn<Circle, String>("Length");

        circle_Colum_R.setCellValueFactory(new PropertyValueFactory<>("r"));
        circle_Colum_S.setCellValueFactory(new PropertyValueFactory<>("S"));
        circle_Colum_L.setCellValueFactory(new PropertyValueFactory<>("L"));

        circle_Colum_R.setSortType(TableColumn.SortType.DESCENDING);

        ObservableList<Circle> circleList = getCircleList();
        circleTableView.setItems(circleList);

        circleTableView.getColumns().addAll( circle_Colum_R,circle_Colum_S,circle_Colum_L);

        Label circleLabel = new Label("CIRCLES : ");
        circleLabel.setFont(Font.font(15));
        Label maxSofCircles = new Label("Max Circle S: " + listOfCircles.getLargestS_Of_CirclesList());
        maxSofCircles.setPadding(new Insets(10));

        //--------------------------------------------------------------------------------------------------------------------------------------------------------------

        TableView<Cilinder> cilinderTableView = new TableView<Cilinder>();

        TableColumn<Cilinder, String> cilinder_Colum_R = new TableColumn<Cilinder, String>("Radius");
        TableColumn<Cilinder, String> cilinder_Colum_S = new TableColumn<Cilinder, String>("Square");
        TableColumn<Cilinder, String> cilinder_Colum_H = new TableColumn<Cilinder, String>("Height");
        TableColumn<Cilinder, String> cilinder_Colum_V = new TableColumn<Cilinder, String>("Volume");

        cilinder_Colum_R.setCellValueFactory(new PropertyValueFactory<>("r"));
        cilinder_Colum_S.setCellValueFactory(new PropertyValueFactory<>("S"));
        cilinder_Colum_H.setCellValueFactory(new PropertyValueFactory<>("h"));
        cilinder_Colum_V.setCellValueFactory(new PropertyValueFactory<>("V"));

        cilinder_Colum_R.setSortType(TableColumn.SortType.DESCENDING);

        ObservableList<Cilinder> cilinderList = getCilinderList();
        cilinderTableView.setItems(cilinderList);

        cilinderTableView.getColumns().addAll(cilinder_Colum_R,cilinder_Colum_S,cilinder_Colum_H,cilinder_Colum_V);

        Label cilinderLabel = new Label("CILINDERS : ");
        cilinderLabel.setFont(Font.font(15));
        Label averageVofCilinders= new Label("AvgV = " + listOfCylinders.getAvgV_of_CylindersList());
        averageVofCilinders.setPadding(new Insets(10));

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.getChildren().add(circleLabel);
        root.getChildren().add(circleTableView);
        root.getChildren().add(maxSofCircles);
        root.getChildren().add(cilinderLabel);
        root.getChildren().add(cilinderTableView);
        root.getChildren().add(averageVofCilinders);

        stage.setTitle("Circles & Cilinders");

        Scene scene = new Scene(root, 450, 500);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<Circle> getCircleList() {

        final int N = 5;

        ObservableList<Circle> circleList = FXCollections.observableArrayList();
        for (int i = 0; i < N; i++) {
            circleList.add(new Circle((int) (Math.random() * 49 + 1)));
            listOfCircles.add(new Circle((int) (Math.random() * 49 + 1)));
        }
        return circleList;
    }

    private ObservableList<Cilinder> getCilinderList() {

        final int M = 5;

        ObservableList<Cilinder> cilinderList = FXCollections.observableArrayList();
        for (int i = 0; i < M; i++) {
            cilinderList.add(new Cilinder((int) (Math.random() * 49 + 1), (int) (Math.random() * 49 + 1)));
            listOfCylinders.add(new Cilinder((int) (Math.random() * 49 + 1), (int) (Math.random() * 49 + 1)));
        }
        return cilinderList;
    }

    public static void main(String[] args) {
        launch();
    }
}