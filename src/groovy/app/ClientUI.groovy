package app

import com.vaadin.grails.ui.DefaultUI
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.VerticalLayout

class ClientUI extends DefaultUI {

    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout()
        layout.setMargin(true)

        Label label = new Label("Client")
        layout.addComponent(label)

        setContent(layout)
    }
}