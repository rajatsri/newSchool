/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.widgets;

import com.vaadin.ui.Button;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author 739335
 */
public class MenuWidget extends VerticalLayout {

    public MenuWidget(String Width) {

        Panel iPanel = new Panel();
        iPanel.setWidth(Width);
        iPanel.setStyleName("backColorWhite");

        addComponent(iPanel);

        VerticalLayout iVerticalLayout = new VerticalLayout();
        for (int i = 1; i <= 8; i++) {
            Button iButton = new Button();
            iButton.setWidth(Width);
            iButton.setHeight("50px");
            iVerticalLayout.addComponent(iButton);
        }
        iPanel.setContent(iVerticalLayout);

    }
}
