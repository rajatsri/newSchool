/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.MyAppWidgetSet.core;

import com.logicbomb.newschool.pages.SliderMasterPage;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Rajat
 */
public class UserDetailsWidget extends SliderMasterPage
{
    public UserDetailsWidget()
    {
        HorizontalLayout h= new HorizontalLayout();
        addComponent(h);
        
        h.setSizeFull();
        //h.setSpacing(true);
        
        Button userPhoto = new Button();
        userPhoto.setIcon(FontAwesome.USER);
        userPhoto.setHeight("100px");
        userPhoto.setWidth("100px");
        h.addComponent(userPhoto);
        //h.setComponentAlignment(userPhoto, Alignment.TOP_LEFT);
        
        VerticalLayout v= new VerticalLayout();
        //v.setStyleName("backColorBlack");
        h.addComponent(v);
        v.setStyleName("v-layout-padding-left");
        //h.setComponentAlignment(userPhoto, Alignment.TOP_RIGHT);
        v.setHeight("106px");
        v.setWidth("100px");
        
       // v.setComponentAlignment(userStatus, Alignment.MIDDLE_CENTER);
        Button editProfile = new Button("Profile");
        editProfile.setStyleName("v-button-type3");
        editProfile.setIcon(FontAwesome.USER);
        editProfile.setWidth("100px");
        editProfile.setWidth("102px");
        v.addComponent(editProfile);
        //v.setComponentAlignment(editProfile, Alignment.TOP_LEFT);
        
        Button settings = new Button("Settings");
        settings.setStyleName("v-button-type3");
        settings.setIcon(FontAwesome.WRENCH);
        settings.setWidth("100px");
        settings.setWidth("102px");
        v.addComponent(settings);
        //v.setComponentAlignment(editProfile, Alignment.MIDDLE_RIGHT);
        
        Button logOut = new Button("Log Out");
        logOut.setStyleName("v-button-type3");
        logOut.setIcon(FontAwesome.KEY);
        logOut.setWidth("100px");
        logOut.setWidth("102px");
        v.addComponent(logOut);
        //v.setComponentAlignment(editProfile, Alignment.BOTTOM_RIGHT);

        
        //v.setComponentAlignment(userStatus, Alignment.MIDDLE_CENTER);
    }
}
