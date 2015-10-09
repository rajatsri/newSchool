/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.widgets.core;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;
import java.util.Random;

/**
 *
 * @author Rajat
 */
public class HourWidget extends AbsoluteLayout {

    public HourWidget(int aHourNumber, int aTotalHourNumber) {
        setWidth("500px");
        setHeight("500px");
        //setStyleName("backColorGrey");

        String[] classes = {"VI", "VII", "VIII", "IX", "X"};
        int index1 = new Random().nextInt(classes.length);
        String selectedClass = (classes[index1]);

        String[] sections = {"A", "B", "C", "D", "E"};
        int index2 = new Random().nextInt(classes.length);
        String selectedSection = (sections[index2]);

        String[] content = {"Gravitation", "Lab", "Electricity", "Force", "Motion"};
        int index3 = new Random().nextInt(classes.length);
        String selectedContent = (content[index3]);

        //Button b= new Button("2");
        //addComponent(b);
        //c.setSizeFull();
        Button iMinorText = new Button(selectedContent);
        double redOrGreen = Math.random();
        if (Math.random() > 0.5) {
            iMinorText.setStyleName("v-button-type1-red");
        } else {
            iMinorText.setStyleName("v-button-type1-green");
        }
        iMinorText.setHeight("40px");
        iMinorText.setWidth("125px");
        //c.setCaptionAsHtml(true);  kkk
        
        addComponent(iMinorText);//,"top:10px;left:10px");

        Label iMajorText = new Label(selectedClass + " - " + selectedSection);
        iMajorText.setStyleName("v-label-type1");
        iMajorText.setHeight("15px");
        iMajorText.setWidth("50px");
        addComponent(iMajorText, "top:2px;left:1px");

        double numberOfMemos = Math.floor(Math.random() * 5);
        //Diplay if any memo present
        NativeButton memoButton;
        if (numberOfMemos > 0) {
            memoButton = new NativeButton();//String.valueOf(numberOfMemos).replace(".0", ""));
            memoButton.setStyleName("v-button-type2");
            //memoButton.setHeight("15px");
            //memoButton.setWidth("30px");
            memoButton.setIcon(FontAwesome.PENCIL);
            addComponent(memoButton, "top:2px;left:85px");
        }

        double numberOfNotifications = Math.floor(Math.random() * 5);
        NativeButton notificationButton;
        if (numberOfNotifications > 0) {
            notificationButton = new NativeButton();//String.valueOf(numberOfNotifications).replace(".0", ""));
            notificationButton.setStyleName("v-button-type2");
            //notificationButton.setHeight("15px");
            //notificationButton.setWidth("30px");
            notificationButton.setIcon(FontAwesome.BELL);
            addComponent(notificationButton, "top:2px;left:100px");
        }

    }
}
