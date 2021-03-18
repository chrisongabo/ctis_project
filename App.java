package com.mycompany.sortingalgorithim;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        InfoPane infoPane = new InfoPane();
        BubblePane bubblePane = new BubblePane();
        SelectionPane selectionPane = new SelectionPane();
        InsertionPane insertionPane = new InsertionPane();
        MergeSortPane mergesortPane = new MergeSortPane();
        QuickSortPane quicksortPane = new QuickSortPane();
        
        TabPane tabPane = new TabPane();
        
        Tab infoTab = new Tab();
        infoTab.setContent(infoPane);
        infoTab.setText("Sorting Intro");
        tabPane.getTabs().add(infoTab);
        
        Tab bubbleTab = new Tab();
        bubbleTab.setContent(bubblePane);
        bubbleTab.setText("Bubble Sort");
        tabPane.getTabs().add(bubbleTab);
        
        Tab selectionTab = new Tab();
        selectionTab.setContent(selectionPane);
        selectionTab.setText("Selection Sort");
        tabPane.getTabs().add(selectionTab);
        
        Tab insertionTab = new Tab();
        insertionTab.setContent(insertionPane);
        insertionTab.setText("Insertion Sort");
        tabPane.getTabs().add(insertionTab);
        
        Tab mergesortTab = new Tab();
        mergesortTab.setContent(mergesortPane);
        mergesortTab.setText("Merge Sort");
        tabPane.getTabs().add(mergesortTab);
        
        Tab quicksortTab = new Tab();
        quicksortTab.setContent(quicksortPane);
        quicksortTab.setText("Quick Sort");
        tabPane.getTabs().add(quicksortTab);
        
        
        Scene scene = new Scene(tabPane,800,600);
        
        stage.setTitle("SORTING ALGORITHIMS");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}