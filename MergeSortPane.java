/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingalgorithim;



import java.util.ArrayList;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author tahah
 */
public class MergeSortPane extends Pane {
    private TextField numberField1;
    private TextField numberField2;
    private TextField numberField3;
    private TextField numberField4;
    private TextField numberField5;
    private TextField numberField6;
    private TextField numberField7;
    private TextField numberField8;
    private TextField numberField9;
    private TextField numberField10;
    
    private Button randomButton;
    private Button sortButton;
    private Button resetButton;
    
    private int[] userArray = new int[10];
    private String printstring;
    
    private Random randGenerator = new Random();
    
    private String sortedArray = " ";
    private Label outputLabel;
    private Label stepsOutput;
    
    
    private int counter;
    
    public MergeSortPane(){
        Text text1 = new Text();
        text1.setFont(new Font(12));
        text1.setX(100);
        text1.setY(25);
        text1.setText("Insertion Sort Description:");
        
        Text text2 = new Text();
        text2.setFont(new Font(12));
        text2.setX(50);
        text2.setY(50);
        text2.setText("Selection sort is a sorting algorithim that selects the minimum value out of an array, fills it in a new array," + "\n" +  "and iterates through this process until the new array is filled");//change
        
        getChildren().addAll(text1,text2);
        
        
        HBox userFields = new HBox(0);
        userFields.setPrefWidth(800);
        userFields.setLayoutX(0);
        userFields.setLayoutY(75);
        
        numberField1 = new TextField();
        numberField1.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField1.getText();
            int myInt = Integer.parseInt(text); 
            userArray[0] = myInt; 
        });
    
        
        numberField2 = new TextField();
        numberField2.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField2.getText();
            int myInt = Integer.parseInt(text); 
            userArray[1] = myInt; 
        });
        
        
        numberField3 = new TextField();
        numberField3.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField3.getText();
            int myInt = Integer.parseInt(text); 
            userArray[2] = myInt; 
        });
        
        numberField4 = new TextField();
        numberField4.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField4.getText();
            int myInt = Integer.parseInt(text); 
            userArray[3] = myInt; 
        });
        
        numberField5 = new TextField();
        numberField5.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField5.getText();
            int myInt = Integer.parseInt(text); 
            userArray[4] = myInt; 
        });
        
        numberField6 = new TextField();
        numberField6.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField6.getText();
            int myInt = Integer.parseInt(text); 
            userArray[5] = myInt; 
        });
        
        numberField7 = new TextField();
        numberField7.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField7.getText();
            int myInt = Integer.parseInt(text); 
            userArray[6] = myInt; 
        });
        
        numberField8 = new TextField();
        numberField8.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField8.getText();
            int myInt = Integer.parseInt(text); 
            userArray[7] = myInt; 
        });
        
        numberField9 = new TextField();
        numberField9.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField9.getText();
            int myInt = Integer.parseInt(text); 
            userArray[8] = myInt; 
        });
        
        numberField10 = new TextField();
        numberField10.textProperty().addListener((observable, oldValue, newValue)-> {
            String text = numberField10.getText();
            int myInt = Integer.parseInt(text); 
            userArray[9] = myInt; 
        });
        
        userFields.getChildren().addAll(numberField1,numberField2,numberField3,numberField4,numberField5,numberField6,numberField7,numberField8,numberField9,numberField10);
        getChildren().add(userFields);
       
        
        randomButton = new Button("Generate Random Numbers");
        randomButton.setOnAction(this::randomButtonPress);
        sortButton = new Button("Start Merge Sort");
        sortButton.setOnAction(this::sortButtonPress);
        resetButton = new Button("Reset Numbers");
        resetButton.setOnAction(this::clearButtonPress);
        HBox userButtons = new HBox(0);
        userButtons.setLayoutX(250);
        userButtons.setLayoutY(110);
        userButtons.getChildren().addAll(randomButton,sortButton,resetButton);
        getChildren().add(userButtons);
        
        VBox outputBox = new VBox(0);
        outputLabel = new Label(" ");
        Font labelFont = Font.font(20);
        outputLabel.setFont(labelFont);
        stepsOutput = new Label(" ");
        stepsOutput.setFont(labelFont);
        
        
        outputBox.setLayoutX(220);
        outputBox.setLayoutY(250);
        outputBox.getChildren().addAll(outputLabel, stepsOutput);
        getChildren().add(outputBox);
    }
    
    public void randomButtonPress(ActionEvent event){
        ArrayList<Integer> numbers = new ArrayList<Integer>();   
        int counter = 0;
        while (numbers.size() < 10) {
            int random = randGenerator.nextInt(100);
            if (!numbers.contains(random)) {
                numbers.add(random);
                userArray[counter] = random;
                counter += 1;
            }
        }
        numberField1.setText("" + userArray[0]);
        numberField2.setText("" + userArray[1]);
        numberField3.setText("" + userArray[2]);
        numberField4.setText("" + userArray[3]);
        numberField5.setText("" + userArray[4]);
        numberField6.setText("" + userArray[5]);
        numberField7.setText("" + userArray[6]);
        numberField8.setText("" + userArray[7]);
        numberField9.setText("" + userArray[8]);
        numberField10.setText("" + userArray[9]);
               
    }
    
    public void clearButtonPress(ActionEvent event){
        numberField1.clear();
        numberField2.clear();
        numberField3.clear();
        numberField4.clear();
        numberField5.clear();
        numberField6.clear();
        numberField7.clear();
        numberField8.clear();
        numberField9.clear();
        numberField10.clear();
        
        outputLabel.setText("");
        stepsOutput.setText("");
    }
    
    public void sortButtonPress(ActionEvent event){
        counter = 0;
        
        sort(userArray, 0, userArray.length - 1);
        
        sortedArray = "The sorted array is ";
        for(int element: userArray){
            sortedArray += element + " ";
        }
        
        outputLabel.setText(sortedArray);
        stepsOutput.setText("The number of steps this took was " + counter);
        
    }
    
    public void merge(int arr[], int l, int m, int r)    {
      
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
 
   
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
   
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
                counter += 1;
            }
            else {
                arr[k] = R[j];
                j++;
                counter += 1;
            }
            k++;
        }
 
      
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    
    public void sort(int arr[], int l, int r)    {
        if (l < r) {
          
            int m =l+ (r-l)/2;
           
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            
            merge(arr, l, m, r);
        }
    }
    
    
}



    

