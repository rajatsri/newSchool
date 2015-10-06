/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.widgets;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Rajat
 */
public class DayAtAGlanceWidget extends VerticalLayout {

    public DayAtAGlanceWidget() {

        //Creating Panel
        Panel iPanel = new Panel();
        iPanel.addStyleName("backColorWhite");
        iPanel.setWidth("1010px");
       // iPanel.setHeight("200px");

        
        
        //Adding Panel to Vertical Layout
        addComponent(iPanel);

        

        
        GridLayout iGridLayout = new GridLayout(9,1);
        iGridLayout.setWidth("1000px");
        //iGridLayout.setHeight("100px");
        

        for(int i=1;i<=8;i++)
        {
            
            HourAtAGlanceWidget iHourAtAGlanceWidget= new HourAtAGlanceWidget(i,8);
            iHourAtAGlanceWidget.setSizeFull();
            iGridLayout.addComponent(iHourAtAGlanceWidget);
            iGridLayout.setColumnExpandRatio(i, 1);
        }
        

        iPanel.setContent(iGridLayout);

    }
}
