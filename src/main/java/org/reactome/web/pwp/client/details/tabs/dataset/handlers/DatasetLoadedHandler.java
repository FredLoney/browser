package org.reactome.web.pwp.client.details.tabs.dataset.handlers;

import com.google.gwt.event.shared.EventHandler;
import org.reactome.web.pwp.client.details.tabs.dataset.events.DatasetLoadedEvent;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface DatasetLoadedHandler extends EventHandler {

    void onDatasetLoaded(DatasetLoadedEvent datasetLoadedEvent);

}
