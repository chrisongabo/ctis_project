/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingalgorithim;

import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author tahah
 */
public class InfoPane extends Pane {
    
    public InfoPane(){
        Text text1 = new Text();
        text1.setFont(new Font(12));
        text1.setX(200);
        text1.setY(200);
        text1.setText("Sorting Efficiency");
        
        Text text2 = new Text();
        text2.setFont(new Font(12));
        text2.setX(200);
        text2.setY(224);
        text2.setText("The two main criterias to judge which algorithm is better than the other have been:");
        
        Text text3 = new Text();
        text3.setFont(new Font(12));
        text3.setX(212);
        text3.setY(250);
        text3.setText("1- Time taken to sort the given data.");
        
        Text text4 = new Text();
        text4.setFont(new Font(12));
        text4.setX(212);
        text4.setY(270);
        text4.setText("2- Memory Space required to do so");
        
        getChildren().addAll(text1,text2,text3,text4);
    
    }
    
}
