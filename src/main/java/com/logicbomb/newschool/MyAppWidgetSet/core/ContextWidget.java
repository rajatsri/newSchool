package com.logicbomb.newschool.MyAppWidgetSet.core;

import com.logicbomb.newschool.pages.SliderMasterPage;
import com.logicbomb.newschool.MyAppWidgetSet.core.DayWidget;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.sliderpanel.SliderPanel;
import org.vaadin.sliderpanel.SliderPanelBuilder;
import org.vaadin.sliderpanel.SliderPanelStyles;
import org.vaadin.sliderpanel.client.SliderMode;
import org.vaadin.sliderpanel.client.SliderTabPosition;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajat
 */
@Theme("mytheme")
@Widgetset("com.logicbomb.newschool.MyAppWidgetset")
public class ContextWidget extends AbsoluteLayout {

    public static ContextWidget ContextWidgetTransformer(ContextWidget aAbsoluteLayout,SliderMasterPage aSliderPanelContents,SliderMode position, String sliderStyle) {
        aAbsoluteLayout.addStyleName("backColorWhite");
        //aAbsoluteLayout.setSizeFull();
        SliderPanel p = getSliderWidget(aSliderPanelContents,position,sliderStyle);
        AbsoluteLayout.ComponentPosition iComponentPositionPanel = aAbsoluteLayout.new ComponentPosition();
        iComponentPositionPanel.setLeft((float) 97, Unit.PERCENTAGE);
        iComponentPositionPanel.setTop((float) 0, Unit.PERCENTAGE);
        aAbsoluteLayout.addComponent(p);
        aAbsoluteLayout.setPosition(p, iComponentPositionPanel);
        return aAbsoluteLayout;
    }
    
    
    private static SliderPanel getSliderWidget(VerticalLayout contentsOfSlider,SliderMode position , String sliderStyle) {

        SliderPanel sliderPanel = new SliderPanelBuilder(contentsOfSlider)
                .caption("Rajat Srivastava")
                .mode(position)
                .tabPosition(SliderTabPosition.END)
                .style(sliderStyle)
                .build();
        //sliderPanel.setHeightUndefined();
        return sliderPanel;
    }

}
