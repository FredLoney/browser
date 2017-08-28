package org.reactome.web.pwp.client.details.tabs.dataset.events;

import com.google.gwt.event.shared.GwtEvent;
import org.reactome.web.pwp.client.details.tabs.dataset.handlers.DatasetLoadedHandler;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public class DatasetLoadedEvent extends GwtEvent<DatasetLoadedHandler> {
    public static Type<DatasetLoadedHandler> TYPE = new Type<>();

    @Override
    public Type<DatasetLoadedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(DatasetLoadedHandler handler) {
        handler.onDatasetLoaded(this);
    }
}
