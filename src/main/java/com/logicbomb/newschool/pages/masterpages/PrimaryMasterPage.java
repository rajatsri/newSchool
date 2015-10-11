/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.pages.masterpages;

import com.logicbomb.newschool.MyAppWidgetSet.core.UserDetailsWidget;
import com.google.gwt.user.client.ui.ToggleButton;
import com.logicbomb.newschool.MyAppWidgetSet.core.ContextWidget;
import com.logicbomb.newschool.MyAppWidgetSet.core.ContextWidgetTop;
import com.logicbomb.newschool.MyAppWidgetSet.core.MainMenuWidget;
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
import org.vaadin.sliderpanel.SliderPanelStyles;
import org.vaadin.sliderpanel.client.SliderMode;

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class PrimaryMasterPage extends HorizontalLayout {

    public PrimaryMasterPage() {
        
        //ContextWidget c= new ContextWidget();
       
        
        HorizontalLayout iHorizontalLayout = new HorizontalLayout();
        //addComponent(iHorizontalLayout,"top:0px;left:0px");
        iHorizontalLayout.setWidth(String.valueOf(Page.getCurrent().getBrowserWindowWidth()));
        iHorizontalLayout.setHeight(String.valueOf(Page.getCurrent().getBrowserWindowHeight()));
        iHorizontalLayout.setStyleName("backColorBlack");

        //String[] captions1 = {"Logo Here", "My Cool School", "Third"};

        //Layout A and its sub components
        Panel AP = new Panel();
        iHorizontalLayout.addComponent(AP);
        AP.setSizeFull();
        AP.setStyleName("backColorBlack");
        VerticalLayout A1 = new VerticalLayout();
        AP.setContent(A1);
        //A.setSizeFull();
        A1.setSpacing(true);
        iHorizontalLayout.setExpandRatio(AP, 1);
        
        
        
        
        A1.setStyleName("backColorBlack");
        A1.setMargin(new MarginInfo(true, true, true, true));

        Button logoImage = new Button();
        logoImage.setIcon(FontAwesome.PICTURE_O);
        logoImage.setWidth("80px");
        logoImage.setHeight(logoImage.getWidth(),Unit.PIXELS);
        //logoImage.setWidth("100px");
        A1.addComponent(logoImage);
        A1.setComponentAlignment(logoImage,Alignment.TOP_CENTER);
        
        Label schoolName = new Label("The School Of Future");
        schoolName.setStyleName("v-label-big");
        A1.addComponent(schoolName);
        //A.setComponentAlignment(schoolName,Alignment.TOP_CENTER);
        
        Label schoolMinorName = new Label("Random Branch");
        schoolMinorName.setStyleName("v-label-small");
        A1.addComponent(schoolMinorName);
        
        VerticalLayout A2 = new VerticalLayout();
        A1.addComponent(A2);
        MainMenuWidget iMainMenuWidget= new MainMenuWidget();
        A2.addComponent(iMainMenuWidget);
        
        //A.setComponentAlignment(schoolName,Alignment.TOP_CENTER);

        //Layout B
        ContextWidgetTop c= new ContextWidgetTop();
        c=ContextWidgetTop.ContextWidgetTransformer(c, new UserDetailsWidget(),SliderMode.TOP,SliderPanelStyles.COLOR_RED);
        VerticalLayout B = new VerticalLayout();
        B.setSizeFull();
        //B.setSpacing(true);
        iHorizontalLayout.addComponent(c);
        c.addComponent(B);
        iHorizontalLayout.setExpandRatio(c, 7);

        //Layout B1 and its sub Components
        HorizontalLayout B1= new HorizontalLayout();
        B.addComponent(B1);
        //B.setExpandRatio(B1, 1);
        //B1.setHeight("70px");
        B1.setSizeFull();
        //B1=ContextWidget.ContextWidgetTransformer(B1, new SliderMasterPage(),SliderMode.RIGHT,SliderPanelStyles.COLOR_RED);
                
        HorizontalLayout B11 = new HorizontalLayout();
        B1.addComponent(B11);
        B1.setStyleName("backColorBlack");
        B11.setSizeFull();
        B1.setHeight("45px");
        //B1.setStyleName("backColorWhite");
        //B1.setMargin(new MarginInfo(false, true, false, true));

        TextField iTextField = new TextField();
        iTextField.setWidth("200px");
        iTextField.setInputPrompt("Search!");
        iTextField.setStyleName("v-text-type-search");
        iTextField.focus();
        B11.addComponent(iTextField);
        B11.setComponentAlignment(iTextField, Alignment.MIDDLE_LEFT);
        
        
        


        //Layout B2 and its Sub Components
        ContextWidget B2 = new ContextWidget();
        B2.setSizeFull();
        B.addComponent(B2);
        B.setExpandRatio(B2, 10);
        B2=ContextWidget.ContextWidgetTransformer(B2, new SliderMasterPage(),SliderMode.RIGHT,SliderPanelStyles.COLOR_BLUE);
        //B2=ContextWidget.ContextWidgetTransformer(B2, new SliderMasterPage(),SliderMode.TOP,SliderPanelStyles.COLOR_RED);
        VerticalLayout v= new VerticalLayout();
        B2.addComponent(v);
        
        Button b1111= new Button("Put all the inner components like this Put all the inner components like this Put all the inner components like this Put all the inner components like this");
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
