package org.phantomchain.client.api.two;

import org.phantomchain.client.api.AbstractAPI;
import org.phantomchain.client.http.Client;

public class Two extends AbstractAPI {

    public Blocks blocks;
    public Delegates delegates;
    public Node node;
    public Peers peers;
    public Transactions transactions;
    public Votes votes;
    public Wallets wallets;

    public Two(Client client) {
        super(client);
        this.blocks = new Blocks(client);
        this.delegates = new Delegates(client);
        this.node = new Node(client);
        this.peers = new Peers(client);
        this.transactions = new Transactions(client);
        this.votes = new Votes(client);
        this.wallets = new Wallets(client);
    }
}
