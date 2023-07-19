package com.example.exam;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Exam extends Application {
    private TextField movieName = new TextField();
    private TextField seatsName = new TextField();

    private RadioButton time1;
    private RadioButton time2;
    private RadioButton time3;
    private RadioButton time4;
    private RadioButton time5;

    private RadioButton set1;
    private RadioButton set2;
    private RadioButton set3;

    private ComboBox expComboBox;

    private Label set1Text;
    private Label set2Text;
    private Label set3Text;

    private ToggleGroup tg2;

    @Override

    public void start(Stage stage) throws IOException {
        stage.setTitle("Movie Ticketing System");

        AnchorPane anchorPane = new AnchorPane();

        Label movieLabel = new Label("Movie");
        Label expLabel = new Label("Experience");
        Label sessionLabel = new Label("Session");
        Label seatLabel = new Label("Seats");
        Label fnbLabel = new Label("Food & Beverages");

        movieName.setPrefWidth(570);
        seatsName.setPrefWidth(570);
        expComboBox = new ComboBox<>();
        expComboBox.getItems().addAll("Beanie", "Classic", "Deluxe", "Family-Friendly", "Flexound",
                "IMAX", "Indulge", "Infinity", "Junior", "0nxy");

        time1 = new RadioButton("11:00 AM");
        time2 = new RadioButton("01:30 PM");
        time3 = new RadioButton("04:00 PM");
        time4 = new RadioButton("06:30 PM");
        time5 = new RadioButton("09:00 PM");

        ToggleGroup tg1 = new ToggleGroup();
        time1.setToggleGroup(tg1);
        time2.setToggleGroup(tg1);
        time3.setToggleGroup(tg1);
        time4.setToggleGroup(tg1);
        time5.setToggleGroup(tg1);

        GridPane gridPane1 = new GridPane();
        set1 = new RadioButton("RM" + 19.90);
        set2 = new RadioButton("RM" + 17.90);
        set3 = new RadioButton("RM" + 21.90);

        gridPane1.add(set1, 0, 0);
        gridPane1.add(set2, 14, 0);
        gridPane1.add(set3, 28, 0);
        gridPane1.setHgap(10);

        tg2 = new ToggleGroup();
        set1.setToggleGroup(tg2);
        set2.setToggleGroup(tg2);
        set3.setToggleGroup(tg2);

        Button submitButton = new Button("Submit");

        GridPane gridPane2 = new GridPane();
        Image image1 = new Image(Exam.class.getResource("popcorn1.png").toString());
        Image image2 = new Image(Exam.class.getResource("popcorn2.png").toString());
        Image image3 = new Image(Exam.class.getResource("popcorn3.png").toString());

        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(175);

        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(175);

        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(175);

        gridPane2.add(imageView1, 0, 0);
        gridPane2.add(imageView2, 1, 0);
        gridPane2.add(imageView3, 2, 0);
        gridPane2.setHgap(11);

        GridPane gridPane3 = new GridPane();
        set1Text = new Label("Royal Popcorn Combo – Member Special");
        set2Text = new Label("Royal Popcorn");
        set3Text = new Label("Royal Popcorn Combo");

        gridPane3.add(set1Text,0,0);
        gridPane3.add(set2Text,1,0);
        gridPane3.add(set3Text,13,0);
        gridPane3.setHgap(10);


        Alert a = new Alert(Alert.AlertType.NONE);


        Node[] nodesInHere = {movieLabel, expLabel, sessionLabel, seatLabel, fnbLabel, movieName,expComboBox,
                                time1,time2,time3,time4,time5,seatsName,gridPane1, gridPane2, gridPane3, submitButton};

        EventHandler<ActionEvent> event = new
                EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e)
                    {
                        // set alert type
                        a.setAlertType(Alert.AlertType.CONFIRMATION);

                        // set content text
                        a.setContentText("You have selected " + movieName.getText() + " with " + expComboBox.getValue() +
                                " at " + ((RadioButton) tg1.getSelectedToggle()).getText() + " for " + "2 Seats" + " and a " + "Royal Popcorn."
                        + "\n The Total is " + "RM257.91");

                        // show the dialog
                        a.setWidth(300);
                        a.setHeight(300);
                        a.show();
                    }
                };

        //anchor section
        AnchorPane.setTopAnchor(movieLabel, 30.0);
        AnchorPane.setLeftAnchor(movieLabel, 15.0);

        AnchorPane.setTopAnchor(movieName, 25.0);
        AnchorPane.setLeftAnchor(movieName, 125.0);

        AnchorPane.setTopAnchor(expLabel, 70.0);
        AnchorPane.setLeftAnchor(expLabel, 15.0);

        AnchorPane.setTopAnchor(expComboBox, 65.0);
        AnchorPane.setLeftAnchor(expComboBox, 125.0);

        AnchorPane.setTopAnchor(sessionLabel, 150.0);
        AnchorPane.setLeftAnchor(sessionLabel, 15.0);

        AnchorPane.setTopAnchor(time1, 110.0);
        AnchorPane.setLeftAnchor(time1, 125.0);

        AnchorPane.setTopAnchor(time2, 130.0);
        AnchorPane.setLeftAnchor(time2, 125.0);

        AnchorPane.setTopAnchor(time3, 150.0);
        AnchorPane.setLeftAnchor(time3, 125.0);

        AnchorPane.setTopAnchor(time4, 170.0);
        AnchorPane.setLeftAnchor(time4, 125.0);

        AnchorPane.setTopAnchor(time5, 190.0);
        AnchorPane.setLeftAnchor(time5, 125.0);

        AnchorPane.setBottomAnchor(seatLabel, 300.0);
        AnchorPane.setLeftAnchor(seatLabel, 15.0);

        AnchorPane.setBottomAnchor(seatsName, 295.0);
        AnchorPane.setLeftAnchor(seatsName, 125.0);

        AnchorPane.setBottomAnchor(fnbLabel, 210.0);
        AnchorPane.setLeftAnchor(fnbLabel, 15.0);

        AnchorPane.setBottomAnchor(gridPane1,60.0);
        AnchorPane.setLeftAnchor(gridPane1, 140.0);

        AnchorPane.setBottomAnchor(gridPane2,100.0);
        AnchorPane.setLeftAnchor(gridPane2,130.0);

        AnchorPane.setBottomAnchor(gridPane3,80.0);
        AnchorPane.setLeftAnchor(gridPane3,130.0);

        AnchorPane.setBottomAnchor(submitButton,15.0);
        AnchorPane.setRightAnchor(submitButton,15.0);


        anchorPane.getChildren().addAll(nodesInHere);

        Scene scene = new Scene(anchorPane, 780, 580);

        submitButton.setOnAction(event);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    private String PopcornNaming(String popName) {
        if(set1.isSelected()){
            popName = "Royal Popcorn Combo - Member Special";
        }
        if(set2.isSelected()){
            popName = "Royal Popcorn";
        }
        if(set3.isSelected()){
            popName = "Royal Popcorn Combo";
        }
        return popName;
    }

}