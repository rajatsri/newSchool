package com.logicbomb.newschool.pages;

import com.logicbomb.newschool.widgets.core.DayWidget;
import com.logicbomb.newschool.widgets.core.SliderWidgetFactory;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.sliderpanel.SliderPanel;
import org.vaadin.sliderpanel.SliderPanelBuilder;
import org.vaadin.sliderpanel.SliderPanelStyles;
import org.vaadin.sliderpanel.client.SliderMode;
import org.vaadin.sliderpanel.client.SliderTabPosition;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class TestPage extends AbsoluteLayout {

    public TestPage() {
        addStyleName("body");
        setWidth("100%");
        setHeight("800px");
        
        DayWidget iDayAtAGlanceWidget = new DayWidget();

        ComponentPosition iComponentPosition = new ComponentPosition();
        iComponentPosition.setLeft((float) 20, Unit.PERCENTAGE);
        iComponentPosition.setTop((float) 10, Unit.PERCENTAGE);

        addComponent(iDayAtAGlanceWidget);
        setPosition(iDayAtAGlanceWidget, iComponentPosition);
        
        
        VerticalLayout iVerticalLayout= new VerticalLayout();
        iVerticalLayout.setHeight("100px");
        iVerticalLayout.setWidth("200px");
         SliderPanel p=SliderWidgetFactory.getSliderWidget(iDayAtAGlanceWidget);
        ComponentPosition iComponentPositionPanel = new ComponentPosition();
        iComponentPositionPanel.setLeft((float) 98, Unit.PERCENTAGE);
        iComponentPositionPanel.setTop((float) 0, Unit.PERCENTAGE);
        addComponent(p);
       setPosition(p, iComponentPositionPanel);
        
    }
    
}
