package com.loginbomb.newSchool.pages;

import com.logicbomb.newschool.widgets.LoginWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Image;
import java.io.File;
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
public class LoginPage extends AbsoluteLayout {

    public LoginPage() {
        setWidth("100%");
        setHeight("800px");
        // Find the application directory
        String basepath = VaadinService.getCurrent()
                .getBaseDirectory().getAbsolutePath();
        // Image as a file resource
        FileResource resource = new FileResource(new File(basepath
                + "/WEB-INF/Images/loginPage.jpg"));

        // Show the image in the application
        Image iImage = new Image("", resource);
        iImage.setWidth(100, Unit.PERCENTAGE);
        
        addComponent(iImage);

        LoginWidget iLoginWidget = new LoginWidget();

        ComponentPosition iComponentPosition = new ComponentPosition();
        iComponentPosition.setLeft((float) 50, Unit.PERCENTAGE);
        iComponentPosition.setBottom((float) 10, Unit.PERCENTAGE);

        addComponent(iLoginWidget);
        setPosition(iLoginWidget, iComponentPosition);
    }

}
