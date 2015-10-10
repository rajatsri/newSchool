/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbomb.newschool.widgets.core;

import com.vaadin.ui.AbsoluteLayout.ComponentPosition;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.sliderpanel.SliderPanel;
import org.vaadin.sliderpanel.SliderPanelBuilder;
import org.vaadin.sliderpanel.SliderPanelStyles;
import org.vaadin.sliderpanel.client.SliderMode;
import org.vaadin.sliderpanel.client.SliderTabPosition;

/**
 *
 * @author Rajat
 */
public class SliderWidgetFactory extends VerticalLayout {

    public static SliderPanel getSliderWidget(VerticalLayout contentsOfSlider) {

        SliderPanel sliderPanel = new SliderPanelBuilder(contentsOfSlider)
                .caption("White Slider")
                .mode(SliderMode.RIGHT)
                .tabPosition(SliderTabPosition.MIDDLE)
                .style(SliderPanelStyles.COLOR_WHITE)
                .build();
        return sliderPanel;

        /*
         ComponentPosition iComponentPositionPanel = new ComponentPosition();
         iComponentPositionPanel.setLeft((float) 98, Unit.PERCENTAGE);
         iComponentPositionPanel.setTop((float) 10, Unit.PERCENTAGE);
         addComponent(sliderPanel);
         setPosition(sliderPanel, iComponentPositionPanel);*/
    }
}
