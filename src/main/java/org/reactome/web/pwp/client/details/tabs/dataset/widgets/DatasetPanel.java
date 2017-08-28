package org.reactome.web.pwp.client.details.tabs.dataset.widgets;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ProvidesResize;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import org.reactome.web.pwp.client.details.common.widgets.disclosure.DisclosurePanelFactory;
import org.reactome.web.pwp.client.details.tabs.dataset.events.DatasetLoadedEvent;
import org.reactome.web.pwp.client.details.tabs.dataset.handlers.DatasetLoadedHandler;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public abstract class DatasetPanel<T> extends Composite implements ProvidesResize, HasHandlers {
    protected VerticalPanel container;

    protected Integer datasetsRequired = 0;
    protected Integer datasetsLoaded = 0;

    public DatasetPanel() {
        this.container = new VerticalPanel();
        this.container.setWidth("99%");
        this.container.add(DisclosurePanelFactory.getLoadingMessage());

        this.initWidget(new ScrollPanel(this.container));
        this.setStyleName("elv-Details-OverviewPanel");
    }

    public abstract void add(T element);

    public HandlerRegistration addDatasetLoadedHandler(DatasetLoadedHandler handler){
        return addHandler(handler, DatasetLoadedEvent.TYPE);
    }

    public final Integer getNumberOfRequiredDataset() {
        return datasetsRequired;
    }

    public final Integer getNumberOfLoadedDataset() {
        return datasetsLoaded;
    }

    public abstract void setEmpty();
}