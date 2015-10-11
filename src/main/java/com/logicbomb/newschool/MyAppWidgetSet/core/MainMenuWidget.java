/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.MyAppWidgetSet.core;

import com.vaadin.ui.Accordion;
import com.vaadin.ui.Button;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Rajat
 */
public class MainMenuWidget extends Accordion {
    // Create the accordion

    public MainMenuWidget() {
        setStyleName("backColorWhite");
        //Accordion accordion = new Accordion();

// Create the first tab, specify caption when adding
        // Wrap in a layout

        /*   tab1.addComponent(
         new Image(null, // No component caption
         new ThemeResource("img/planets/Mercury.jpg")));
         accordion.addTab(tab1,
         "Mercury",
         new ThemeResource("img/planets/Mercury_symbol.png"));*/
        //Button b1= new Button("First");
        //tab1.addComponent(b1);
        Layout tab1 = new VerticalLayout();
        addTab(tab1, "To Do");
        Layout tab2 = new VerticalLayout();
        addTab(tab2, "Timetable");
        Layout tab3 = new VerticalLayout();
        addTab(tab3, "Subjects");     
        Layout tab4 = new VerticalLayout();
        addTab(tab4, "Examinations");
        Layout tab5 = new VerticalLayout();
        addTab(tab5, "Attendance");
        Layout tab6 = new VerticalLayout();
        addTab(tab6, "Fees");
        Layout tab7 = new VerticalLayout();
        addTab(tab7, "Reports");
        Layout tab8 = new VerticalLayout();
        addTab(tab8, "Miscellaneous");
        Layout tab9 = new VerticalLayout();
        addTab(tab9, "About");
        

         // Wrap in a layout
        /*   tab1.addComponent(
         new Image(null, // No component caption
         new ThemeResource("img/planets/Mercury.jpg")));
         accordion.addTab(tab1,
         "Mercury",
         new ThemeResource("img/planets/Mercury_symbol.png"));*/
        for(int i=0;i<7;i++)
        {
        Button b2 = new Button("English");
        tab3.addComponent(b2);
        b2.setSizeFull();
        }
        Button b3 = new Button("Hindi");
        tab3.addComponent(b3);
        b3.setSizeFull();
        //addTab(tab2,"Teacher");

    }

}
