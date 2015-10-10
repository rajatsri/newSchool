package com.logicbomb.newschool.pages;

import com.logicbomb.newschool.MyAppWidgetSet.core.DayWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.ui.AbsoluteLayout;


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
        iComponentPosition.setLeft((float) 10, Unit.PERCENTAGE);
        iComponentPosition.setBottom((float) 10, Unit.PERCENTAGE);

        addComponent(iDayAtAGlanceWidget);
        setPosition(iDayAtAGlanceWidget, iComponentPosition);
        
        /*
        VerticalLayout iVerticalLayout= new VerticalLayout();
        iVerticalLayout.setHeight("100px");
        iVerticalLayout.setWidth("200px");
         SliderPanel p=SliderWidgetFactory.getSliderWidget(iDayAtAGlanceWidget);
        ComponentPosition iComponentPositionPanel = new ComponentPosition();
        iComponentPositionPanel.setLeft((float) 98, Unit.PERCENTAGE);
        iComponentPositionPanel.setTop((float) 0, Unit.PERCENTAGE);
        addComponent(p);
       setPosition(p, iComponentPositionPanel);*/
        
    }
    
}
