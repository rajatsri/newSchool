package com.logicbomb.newschool.MyAppWidgetSet.core;

import com.logicbomb.newschool.pages.masterpages.SliderMasterPage;
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
public class ContextWidgetTop extends AbsoluteLayout {

    public static ContextWidgetTop ContextWidgetTransformer(ContextWidgetTop aAbsoluteLayout,SliderMasterPage aSliderPanelContents,SliderMode position, String sliderStyle) {
        aAbsoluteLayout.addStyleName("backColorWhite");
        //aAbsoluteLayout.setSizeFull();
        SliderPanel p = getSliderWidget(aSliderPanelContents,position,sliderStyle);
        AbsoluteLayout.ComponentPosition iComponentPositionPanel = aAbsoluteLayout.new ComponentPosition();
        iComponentPositionPanel.setRight((float) 4, Unit.PIXELS);
        //iComponentPositionPanel.setWidth("200px");
        iComponentPositionPanel.setTop((float) 0, Unit.PIXELS);
        aAbsoluteLayout.addComponent(p);
        aAbsoluteLayout.setPosition(p, iComponentPositionPanel);
        return aAbsoluteLayout;
    }
    
    
    private static SliderPanel getSliderWidget(VerticalLayout contentsOfSlider,SliderMode position , String sliderStyle) {

        SliderPanel sliderPanel = new SliderPanelBuilder(contentsOfSlider)
                .caption("  Rajat Srivastava, Student")
                .mode(position)
                .tabPosition(SliderTabPosition.MIDDLE)
                .style(sliderStyle)
                .build();
        //sliderPanel.setHeightUndefined();
        sliderPanel.setWidth((float) 260, Unit.PIXELS);
        sliderPanel.setAnimationDuration(200);
        return sliderPanel;
    }

}
