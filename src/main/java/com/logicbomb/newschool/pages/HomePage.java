/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.pages;

import com.logicbomb.newschool.widgets.UserDetailsWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class HomePage extends HorizontalLayout{

    HomePage() {
        
        
        final VerticalLayout frameA1 = new VerticalLayout();
        frameA1.addStyleName("backColorGrey");
        frameA1.setHeight("100%");
        this.addComponent(frameA1);
        
        final VerticalLayout frameA2 = new VerticalLayout();
        this.addComponent(frameA2);
        
        final VerticalLayout frameA3 = new VerticalLayout();
        this.addComponent(frameA3);
        
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
