package org.phantomchain.client.api.one;

import com.google.gson.internal.LinkedTreeMap;
import org.phantomchain.client.Connection;
import org.phantomchain.client.MockHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoaderTest {

    @Test
    public void status() throws IOException {
        Connection<One> connection = MockHelper.connection();
        LinkedTreeMap<String, Object> actual = connection.api().loader.status();
        assertTrue((boolean) actual.get("success"));
    }

    @Test
    public void sync() throws IOException {
        Connection<One> connection = MockHelper.connection();
        LinkedTreeMap<String, Object> actual = connection.api().loader.sync();
        assertTrue((boolean) actual.get("success"));
    }

    @Test
    public void autoconfigure() throws IOException {
        Connection<One> connection = MockHelper.connection();
        LinkedTreeMap<String, Object> actual = connection.api().loader.autoconfigure();
        assertTrue((boolean) actual.get("success"));
    }

}
