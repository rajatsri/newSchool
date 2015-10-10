package com.logicbomb.newschool.pages;

import com.logicbomb.newschool.widgets.LoginWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Page;
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
        int pageWidth = Page.getCurrent().getBrowserWindowWidth();
        int pageHeight = Page.getCurrent().getBrowserWindowHeight();
        addStyleName("body");
        setWidth(pageWidth, Unit.PIXELS);
        setHeight(pageHeight, Unit.PIXELS);
        LoginWidget iLoginWidget = new LoginWidget();
        ComponentPosition iComponentPosition = new ComponentPosition();
        iComponentPosition.setLeft((float) pageWidth - 700, Unit.PIXELS);
        iComponentPosition.setTop((float) pageHeight - 400, Unit.PIXELS);

        addComponent(iLoginWidget);
        setPosition(iLoginWidget, iComponentPosition);
    }

}
