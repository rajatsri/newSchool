/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.pages;

import com.logicbomb.newschool.widgets.MenuWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class MasterPage extends HorizontalLayout {

    public MasterPage() {
        int pageWidth = Page.getCurrent().getBrowserWindowWidth();
        int pageHeight = Page.getCurrent().getBrowserWindowHeight();

        VerticalLayout frame1 = new VerticalLayout();

        frame1.addStyleName("backColorBlack");
        frame1.setWidth((float) (0.15 * pageWidth), Unit.PIXELS);
        frame1.setHeight(pageHeight, Unit.PIXELS);
        addComponent(frame1);

        VerticalLayout frame1V1 = new VerticalLayout();
        VerticalLayout frame1V2 = new VerticalLayout();

        frame1V1.setWidth(String.valueOf(frame1.getWidth()));
        frame1V1.setHeight((float) ((0.15 * (frame1.getHeight()))), Unit.PIXELS);
        frame1V1.setStyleName("backColorGrey");
        frame1.addComponent(frame1V1);

        frame1V2.setWidth(String.valueOf(frame1.getWidth()));
        frame1V2.setHeight((float) ((0.85 * (frame1.getHeight()))), Unit.PIXELS);
        frame1V2.setStyleName("backColorGrey2");
        frame1.addComponent(frame1V2);

        MenuWidget iMenuWidget = new MenuWidget(String.valueOf(frame1V2.getWidth()));
        //frame1V2.setMargin(true);
        //frame1V2.addComponent(iMenuWidget);

        final VerticalLayout frame2 = new VerticalLayout();
        frame2.setSizeUndefined();
        frame2.addStyleName("backColorWhite");
        frame2.setWidth((float) (0.85 * pageWidth), Unit.PIXELS);
        frame2.setHeight(pageHeight, Unit.PIXELS);
        addComponent(frame2);

        HorizontalLayout frame1H1 = new HorizontalLayout();
        frame1H1.setStyleName("backColorBlack");
        frame1H1.setWidth(String.valueOf(frame2.getWidth()));
        frame1H1.setHeight("75px");

        frame1H1.setMargin(new MarginInfo(false, true, false, false));

        frame2.addComponent(frame1H1);
        frame2.setComponentAlignment(frame1H1, Alignment.TOP_CENTER);

        Button iButton = new Button();
        iButton.setWidth("50px");
        iButton.setHeight("50px");
        frame1H1.addComponent(iButton);
        frame1H1.setComponentAlignment(iButton, Alignment.MIDDLE_RIGHT);
    }
}
