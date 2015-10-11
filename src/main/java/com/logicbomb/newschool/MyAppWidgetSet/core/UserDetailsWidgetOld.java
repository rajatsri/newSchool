/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.MyAppWidgetSet.core;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Image;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import java.io.File;

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class UserDetailsWidgetOld extends VerticalLayout {

    public UserDetailsWidgetOld() {

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
