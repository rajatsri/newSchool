/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.widgets;

import com.vaadin.ui.Button;
import java.util.Random;

/**
 *
 * @author Rajat
 */
public class HourAtAGlanceWidget extends Button {

    public HourAtAGlanceWidget(int aHourNumber, int aTotalHourNumber) {
        
        String[] classes = {"VI","VII","VIII","IX","X"};
        int index1 = new Random().nextInt(classes.length);
        String selectedClass = (classes[index1]);
        
        String[] sections = {"A","B","C","D","E"};
        int index2 = new Random().nextInt(classes.length);
        String selectedSection = (sections[index2]);
        
        String[] content = {"Gravitation","Lab","Electricity","Force","Motion"};
        int index3 = new Random().nextInt(classes.length);
        String selectedContent = (content[index3]);

        setCaption(selectedContent);

    }
}
