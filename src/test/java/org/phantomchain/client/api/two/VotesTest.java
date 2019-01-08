package org.phantomchain.client.api.two;

import com.google.gson.internal.LinkedTreeMap;
import org.phantomchain.client.Connection;
import org.phantomchain.client.MockHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VotesTest {

    @Test
    void all() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().votes.all();
        assertTrue((boolean) actual.get("success"));
    }

    @Test
    void show() throws IOException {
        Connection<Two> connection = MockHelper.connection(2);
        LinkedTreeMap<String, Object> actual = connection.api().votes.show("dummy");
        assertTrue((boolean) actual.get("success"));
    }

}
