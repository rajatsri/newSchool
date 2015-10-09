/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.pages;

import com.logicbomb.newschool.widgets.UserDetailsWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.AbstractErrorMessage.ContentMode;
import com.vaadin.server.Page;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class HomePage extends HorizontalLayout{

   public HomePage() {
               
        final VerticalLayout frameA1 = new VerticalLayout();
        int pageWidth = Page.getCurrent().getBrowserWindowWidth();
        int pageHeight = Page.getCurrent().getBrowserWindowHeight();
        frameA1.setSpacing(true);
        frameA1.addStyleName("backColorGrey");
        frameA1.setWidth(((20*pageWidth)/100), Unit.PIXELS);
        frameA1.setHeight(pageHeight, Unit.PIXELS);
        this.addComponent(frameA1);
        
        final VerticalLayout frameA2 = new VerticalLayout();
        frameA2.addStyleName("backColorWhite");
        frameA2.setWidth(((60*pageWidth)/100), Unit.PIXELS);
        frameA2.setHeight(pageHeight, Unit.PIXELS);
        this.addComponent(frameA2);
        
        final VerticalLayout frameA3 = new VerticalLayout();
        frameA3.addStyleName("backColorGrey2");
        frameA3.setWidth(((20*pageWidth)/100), Unit.PIXELS);
        frameA3.setHeight(pageHeight, Unit.PIXELS);
        this.addComponent(frameA3);
        
        Accordion iAccordion = new Accordion();
        iAccordion.setHeight(100.0f, Unit.PERCENTAGE);
 
        for (int i = 1; i < 8; i++) {
            final VerticalLayout layout = new VerticalLayout(new Label());
            layout.setMargin(true);
            iAccordion.addTab(layout, "Tab " + i);
        };
        
        frameA2.addComponent(iAccordion);
        
        //Adding widgets to the frames
        UserDetailsWidget u= new UserDetailsWidget();
        frameA1.addComponent(u);
        Button button = new Button("Click Me");
        button.setWidth("100px");
        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                //frameA2.addComponent(new Label("Thank you for clicking"));
                UserDetailsWidget u1= new UserDetailsWidget();
            frameA2.addComponent(u1);
            }
        });
        frameA3.addComponent(button);
        
    }
}
