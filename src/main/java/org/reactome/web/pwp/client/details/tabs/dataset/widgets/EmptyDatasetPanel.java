package org.reactome.web.pwp.client.details.tabs.dataset.widgets;

import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public class EmptyDatasetPanel extends DatasetPanel<Object> {

    public EmptyDatasetPanel() {
        this.setEmpty();
    }

    @Override
    public void add(Object element) {
        //Nothing here
    }

    @Override
    public void setEmpty() {
        this.container.clear();
        this.container.add(new HTMLPanel("Object does not contains datasets associated"));
    }
}
