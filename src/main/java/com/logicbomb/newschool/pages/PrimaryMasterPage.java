/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.pages;

import com.logicbomb.newschool.widgets.core.ContextWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class PrimaryMasterPage extends HorizontalLayout {

    public PrimaryMasterPage() {
        HorizontalLayout iHorizontalLayout = new HorizontalLayout();
        iHorizontalLayout.setWidth(String.valueOf(Page.getCurrent().getBrowserWindowWidth()));
        iHorizontalLayout.setHeight(String.valueOf(Page.getCurrent().getBrowserWindowHeight()));
        iHorizontalLayout.setStyleName("backColorBlack");

        String[] captions1 = {"Logo Here", "My Cool School", "Third"};

        //Layout A and its sub components
        Panel AP = new Panel();
        iHorizontalLayout.addComponent(AP);
        AP.setSizeFull();
        AP.setStyleName("backColorBlack");
        VerticalLayout A = new VerticalLayout();
        AP.setContent(A);
        //A.setSizeFull();
        A.setSpacing(true);
        iHorizontalLayout.setExpandRatio(AP, 1);
        A.setStyleName("backColorBlack");
        A.setMargin(new MarginInfo(true, true, true, true));

        Button logoImage = new Button();
        logoImage.setIcon(FontAwesome.PICTURE_O);
        logoImage.setHeight("100px");
        logoImage.setWidth("100px");
        A.addComponent(logoImage);
        A.setComponentAlignment(logoImage,Alignment.TOP_CENTER);
        
        Label schoolName = new Label("The School Of Future");
        schoolName.setStyleName("v-label-big");
        A.addComponent(schoolName);
        //A.setComponentAlignment(schoolName,Alignment.TOP_CENTER);
        
        Label schoolMinorName = new Label("Random Branch");
        schoolMinorName.setStyleName("v-label-small");
        A.addComponent(schoolMinorName);
        //A.setComponentAlignment(schoolName,Alignment.TOP_CENTER);

        //Layout B
        VerticalLayout B = new VerticalLayout();
        B.setSizeFull();
        iHorizontalLayout.addComponent(B);
        iHorizontalLayout.setExpandRatio(B, 6);

        //Layout B1 and its sub Components
        HorizontalLayout B1 = new HorizontalLayout();
        B1.setSizeFull();
        B.addComponent(B1);
        B.setExpandRatio(B1, 1);
        B1.setStyleName("backColorBlack");
        //B1.setMargin(new MarginInfo(false, true, false, true));

        TextField iTextField = new TextField();
        iTextField.setWidth("200px");
        iTextField.setInputPrompt("Search!");
        iTextField.focus();
        B1.addComponent(iTextField);
        B1.setComponentAlignment(iTextField, Alignment.MIDDLE_LEFT);
        
        Button userPhoto = new Button();
        userPhoto.setIcon(FontAwesome.USER);
        userPhoto.setHeight("55px");
        userPhoto.setWidth("55px");
        B1.addComponent(userPhoto);
        B1.setComponentAlignment(userPhoto, Alignment.MIDDLE_RIGHT);
        


        //Layout B2 and its Sub Components
        ContextWidget B2 = new ContextWidget();
        B2.setSizeFull();
        B.addComponent(B2);
        B.setExpandRatio(B2, 8);
        B2=ContextWidget.ContextWidgetTransformer(B2, new SliderMasterPage());
        VerticalLayout v= new VerticalLayout();
        B2.addComponent(v);
        
        Button b1111= new Button("Put all the inner components like this");
        v.addComponent(b1111);
        Button b1112= new Button("Put all the inner components like this");
        v.addComponent(b1112);
        
        /*
        Panel p = new Panel();
        VerticalLayout v= new VerticalLayout();
        v.addComponent(new TextField("Name"));
        v.addComponent(new TextField("Street address"));
        v.addComponent(new TextField("Postal code"));
        p.setContent(v);
        B2.addComponent(p);
        v.setWidth(String.valueOf(B2.getWidth()*10)+"px");
        //v.setSizeFull();// <- This will cause issues. Don't do this
        p.setSizeFull();
        */
        
        //ContextWidget iContextPanel= new ContextWidget(p);
        //B2.addComponent(iContextPanel);
       //setPosition(p, iComponentPositionPanel);

        
        addComponent(iHorizontalLayout);
    }
}
