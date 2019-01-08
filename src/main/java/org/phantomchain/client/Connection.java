package org.phantomchain.client;

import org.phantomchain.client.api.AbstractAPI;
import org.phantomchain.client.api.one.One;
import org.phantomchain.client.api.two.Two;
import org.phantomchain.client.http.Client;

import java.util.Map;

public class Connection<T extends AbstractAPI> {

    private Client client;
    private int version;

    private T api;

    public Connection(Map<String, Object> config) {
        this.version = ((int) (config.get("API-Version")));
        this.client = new Client(config.get("host").toString(), Integer.toString(this.version));

        this.api = (T) ((this.version == 1) ? new One(this.client) : new Two(this.client));
    }

    public T api() {
        return this.api;
    }

}
