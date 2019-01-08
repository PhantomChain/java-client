package org.phantomchain.client.api.two;

import com.google.gson.internal.LinkedTreeMap;
import org.phantomchain.client.Connection;
import org.phantomchain.client.MockHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DelegatesTest {

    @Test
    void all() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().delegates.all();
        assertTrue((boolean) actual.get("success"));
    }

    @Test
    void show() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().delegates.show("dummy");
        assertTrue((boolean) actual.get("success"));
    }

    @Test
    void blocks() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().delegates.blocks("dummy");
        assertTrue((boolean) actual.get("success"));
    }

    @Test
    void voters() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().delegates.voters("dummy");
        assertTrue((boolean) actual.get("success"));
    }

}
