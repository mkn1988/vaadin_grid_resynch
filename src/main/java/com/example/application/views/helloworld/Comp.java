package com.example.application.views.helloworld;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;

import java.util.Arrays;

@Route("comp")
public class Comp extends Div {

    public Comp(){
        final Button resynch = new Button("Resynchronize", event -> UI.getCurrent().getInternals().incrementServerId());
        final Button nav = new Button("To Text", event -> UI.getCurrent().navigate(Text.class));

        Grid<String> simple = new Grid<>();
        simple.setDataProvider(new ListDataProvider<>(Arrays.asList("a", "b")));
        simple.addComponentColumn(item -> new Span(item))
                .setKey("myColumn")
                .setHeader("Value");

        add(resynch, nav, simple);
    }
}
