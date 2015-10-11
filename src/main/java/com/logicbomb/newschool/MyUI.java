package com.logicbomb.newschool;

import com.logicbomb.newschool.pages.masterpages.PrimaryMasterPage;
import com.logicbomb.newschool.pages.LoginPage;
import com.logicbomb.newschool.pages.TestPage;
import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 */
@Theme("mytheme")

@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout iVerticalLayout = new VerticalLayout();
        // iVerticalLayout.setMargin(true);

        setContent(iVerticalLayout);


       //TestPage iTestPage = new TestPage();
       // iVerticalLayout.addComponent(iTestPage);
       PrimaryMasterPage listPage = new PrimaryMasterPage();
         iVerticalLayout.addComponent(listPage);
     //   LoginPage iLoginPage = new LoginPage();
      //  iVerticalLayout.addComponent(iLoginPage);


    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
