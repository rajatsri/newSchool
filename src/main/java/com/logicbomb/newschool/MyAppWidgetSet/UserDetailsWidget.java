/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.MyAppWidgetSet;

import com.logicbomb.newschool.*;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.FileResource;
import com.vaadin.server.Resource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import java.io.File;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class UserDetailsWidget extends VerticalLayout {

    public UserDetailsWidget() {

        setSpacing(true);
        Panel iPanel = new Panel();
        iPanel.setWidth("50px");
        iPanel.setHeight("50px");
        iPanel.setStyleName("backColorWhite");
        addComponent(iPanel);               
        String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

        // Image as a file resource
        FileResource resource = new FileResource(new File(basepath + "/VAADIN/themes/mytheme/img/loginPage.jpg"));

        // Show the image in the application
        Image image = new Image("", resource);
        image.setSizeFull();
        iPanel.setContent(image);

    }
}
