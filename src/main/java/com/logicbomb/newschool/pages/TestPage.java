package com.logicbomb.newschool.pages;

import com.logicbomb.newschool.widgets.core.DayWidget;
import com.logicbomb.newschool.widgets.LoginWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.ui.AbsoluteLayout;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 739335
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
    }

}
