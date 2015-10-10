/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.widgets;

import com.vaadin.data.validator.EmailValidator;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
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
        setMargin(true);
        setSpacing(true);

        Panel iPanel = new Panel();
        iPanel.addStyleName("backColorWhite");
        iPanel.setSizeUndefined();

        addComponent(iPanel);

        TextField iTextField = new TextField("Username");
        iTextField.setWidth("300px");
        iTextField.setRequired(true);
        iTextField.setInputPrompt("Your username (eg. joe@email.com)");
        iTextField.setIcon(FontAwesome.USER);
        iTextField.addValidator(new EmailValidator("Username must be an email address"));
        iTextField.setInvalidAllowed(true);
        iTextField.focus();

        PasswordField iPasswordField = new PasswordField("Password");
        iPasswordField.setIcon(FontAwesome.KEY);
        iPasswordField.setWidth("300px");
        iPasswordField.setRequired(true);
        iPasswordField.setValue("");
        iPasswordField.setNullRepresentation("");

        Button iButton = new Button("Login");
        iButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                addComponent(new Label("Login Successfully"));
            }
        });

        FormLayout iFormLayout = new FormLayout();
        iFormLayout.setSpacing(true);
        iFormLayout.setMargin(true);
        iFormLayout.addComponent(iTextField);
        iFormLayout.addComponent(iPasswordField);
        iFormLayout.addComponent(iButton);
        iPanel.setContent(iFormLayout);

    }
}
