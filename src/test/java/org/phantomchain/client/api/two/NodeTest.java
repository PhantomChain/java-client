package org.phantomchain.client.api.two;

import com.google.gson.internal.LinkedTreeMap;
import org.phantomchain.client.Connection;
import org.phantomchain.client.MockHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NodeTest {

    @Test
    void status() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().node.status();
        assertTrue((boolean) actual.get("success"));
    }

    @Test
    void syncing() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().node.syncing();
        assertTrue((boolean) actual.get("success"));
    }

    @Test
    void configuration() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().node.configuration();
        assertTrue((boolean) actual.get("success"));
    }

}
