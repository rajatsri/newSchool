/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.pages;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * Extend this class and put any components in the extended class and use it.
 * @author Rajat
 */
public class SliderMasterPage extends VerticalLayout {

    
    public SliderMasterPage() {
        
        //Dont use this class, extend it instead.
        setMargin(new MarginInfo(true, true, false, true));
        
         //panelToPut.setContent(v);
        //addComponent(panelToPut);
         //v.setWidth(String.valueOf(getWidth()*10)+"px");
         //v.setSizeFull();// <- This will cause issues. Don't do this
         //panelToPut.setSizeFull();
        
    }
}
