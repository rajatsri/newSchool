package com.loginbomb.newSchool.pages;

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
public class LoginPage extends AbsoluteLayout {

    public LoginPage() {
        addStyleName("body");
        setWidth("100%");
        setHeight("800px");
        LoginWidget iLoginWidget = new LoginWidget();

        ComponentPosition iComponentPosition = new ComponentPosition();
        iComponentPosition.setLeft((float) 50, Unit.PERCENTAGE);
        iComponentPosition.setBottom((float) 10, Unit.PERCENTAGE);

        addComponent(iLoginWidget);
        setPosition(iLoginWidget, iComponentPosition);
    }

}
