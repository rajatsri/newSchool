/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.MyAppWidgetSet.core;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Rajat
 */
public class DayWidget extends VerticalLayout {

    public DayWidget() {

        //Creating Panel
        Panel iPanel = new Panel();
        iPanel.addStyleName("backColorWhite");
        iPanel.setWidth("876px");
        iPanel.setHeight("41px");

        ProgressBar iDayProgressBar= new ProgressBar();
        iDayProgressBar.setCaption("Period 3, 10th October");
        iDayProgressBar.setWidth("875px");
        iDayProgressBar.setValue(0.3f);
        addComponent(iDayProgressBar);
        
        //Adding Panel to Vertical Layout
        addComponent(iPanel);
        VerticalLayout iVerticalLayout= new VerticalLayout();
        

        
        GridLayout iGridLayout = new GridLayout(9,1);
        iGridLayout.setWidth("1000px");
        iGridLayout.setHeight("40px");
        

        for(int i=1;i<=8;i++)
        {
            
            HourWidget iHourAtAGlanceWidget= new HourWidget(i,8);
            iHourAtAGlanceWidget.setSizeFull();
            iGridLayout.addComponent(iHourAtAGlanceWidget);
            iGridLayout.setColumnExpandRatio(i, 1);
        }
        

        iVerticalLayout.addComponent(iGridLayout);
        iPanel.setContent(iVerticalLayout);
        
    }
}
