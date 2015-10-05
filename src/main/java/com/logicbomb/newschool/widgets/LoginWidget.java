/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.widgets;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author 739335
 */
public class LoginWidget extends VerticalLayout {

    public LoginWidget() {
        //Setting Vertical Layout Margin
        setMargin(true);
        //Setting Vertical Layout Spacing between components
        setSpacing(true);

        //Creating Panel
        Panel iPanel = new Panel();
        iPanel.addStyleName("backColorWhite");
        iPanel.setSizeUndefined();

        //Adding Panel to Vertical Layout
        addComponent(iPanel);

        TextField iTextField = new TextField("Username");
        iTextField.setIcon(FontAwesome.USER);
             
        PasswordField iPasswordField = new PasswordField("Password");
        iPasswordField.setIcon(FontAwesome.KEY);
        
        Button iButton = new Button("Login");

        FormLayout iFormLayout = new FormLayout();
        iFormLayout.addComponent(iTextField);
        iFormLayout.addComponent(iPasswordField);
        iFormLayout.addComponent(iButton);
        iFormLayout.setMargin(true);

        iPanel.setContent(iFormLayout);

    }
}
