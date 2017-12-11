package com.example.vaadinDemo;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

public class Test {

	@WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = MyVaadinUI.class, widgetset = "com.example.vaadinDemo.AppWidgetSet")
    public static class Servlet extends VaadinServlet {

    }
}
