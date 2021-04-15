package com.example.application.views.helloworld;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;

import java.util.Arrays;

@Route("text")
public class Text extends Div {

    public Text(){
        final Button resynch = new Button("Resynchronize", event -> UI.getCurrent().getInternals().incrementServerId());
        final Button nav = new Button("To Comp", event -> UI.getCurrent().navigate(Comp.class));

        Grid<String> simple = new Grid<>();
        simple.setDataProvider(new ListDataProvider<>(Arrays.asList("a", "b")));
        simple.addColumn(String::toString)
                .setKey("myColumn")
                .setHeader("Value");

        add(resynch, nav, simple);
    }

}
