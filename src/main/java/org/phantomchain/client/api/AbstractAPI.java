package org.phantomchain.client.api;

import org.phantomchain.client.http.Client;

public abstract class AbstractAPI {

    protected Client client;

    public AbstractAPI(Client client) {
        this.client = client;
    }
}
