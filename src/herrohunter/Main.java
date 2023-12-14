/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herrohunter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.Scene;
/**
 *
 * @author ASUS
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Monster & Hero Creator");
        ArrayList<Hero> heroes = new ArrayList<>();
        // Create a grid layout
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        // Create labels and text fields for hero creation
        Label heroNameLabel = new Label("Hero Name:");
        TextField heroNameField = new TextField();

        Label heroStrengthLabel = new Label("Hero Strength:");
        TextField heroStrengthField = new TextField();

        Label heroHealthLabel = new Label("Hero Health:");
        TextField heroHealthField = new TextField();

        Label heroTypeLabel = new Label("Hero Type:");
        ComboBox<String> heroTypeComboBox = new ComboBox<>(FXCollections.observableArrayList("Mage", "Faerie", "Warrior"));
        heroTypeComboBox.setValue("Mage"); // Default value

        // Create a button to add a hero
        Button addHeroButton = new Button("Add Hero");
        addHeroButton.setOnAction(event -> {
            try {
                String heroName = heroNameField.getText();
                int heroStrength = Integer.parseInt(heroStrengthField.getText());
                int heroHealth = Integer.parseInt(heroHealthField.getText());

                if ("Mage".equals(heroTypeComboBox.getValue())) {
                    Mage mage = new Mage(heroName, heroStrength, heroHealth, new ArrayList<>(), 30);
                     heroes.add(mage);
                } else if ("Faerie".equals(heroTypeComboBox.getValue())) {
                    Faerie faerie = new Faerie(heroName, heroStrength, heroHealth, new ArrayList<>(), 10);
                    heroes.add(faerie);
                } else if ("Warrior".equals(heroTypeComboBox.getValue())) {
                    Warrior warrior = new Warrior(heroName, heroStrength, heroHealth, new ArrayList<>(), true);
                    heroes.add(warrior);
                }

                // Clear text fields after adding a hero
                heroNameField.clear();
                heroStrengthField.clear();
                heroHealthField.clear();

            } catch (NumberFormatException e) {
                showAlert("Please enter valid numeric values for strength and health.");
            } catch (IllegalArgumentException e) {
                showAlert(e.getMessage());
            }
        });
            // Create a button to write heroes to a file
    Button saveToFileButton = new Button("Save to File");
    saveToFileButton.setOnAction(event -> {
        writeToFile("heroes.txt", heroes);
    });
        // Add components to the grid
        grid.add(heroNameLabel, 0, 0);
        grid.add(heroNameField, 1, 0);
        grid.add(heroStrengthLabel, 0, 1);
        grid.add(heroStrengthField, 1, 1);
        grid.add(heroHealthLabel, 0, 2);
        grid.add(heroHealthField, 1, 2);
        grid.add(heroTypeLabel, 0, 3);
        grid.add(heroTypeComboBox, 1, 3);
        grid.add(addHeroButton, 0, 4, 2, 1);

        // Create a scene and set it to the stage
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
private void writeToFile(String filename, ArrayList<Hero> heroes) {
    try {
        File file = new File(filename);

        // If the file doesn't exist, create a new file
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter writer = new FileWriter(file)) {
            for (Hero hero : heroes) {
                writer.write(hero.getClass().getSimpleName() + ": " + hero.name + " - Strength: " + hero.strength + "\n");
            }
        }

    } catch (IOException e) {
        showAlert("Error writing to file: " + e.getMessage());
    }
}
}