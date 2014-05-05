package com.test;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class NewVaadinPortletApplication extends Application {

    /**
     * Default constructor. 
     */
    public NewVaadinPortletApplication() {
    }

    public void init() {
        Window window = new Window("Vaadin Portlet Application");
        setMainWindow(window);
        window.addComponent(new Label("Hello Vaadin user!"));
    }

}
