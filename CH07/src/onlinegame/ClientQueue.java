package onlinegame;

import java.util.ArrayList;

public class ClientQueue {
    private ArrayList<Client> clients = new ArrayList<>();  //收集联机的 Client
    private ArrayList<Client> listeners = new ArrayList<>();  //收集对 ClientQueue 有兴趣的 ClientListener

    public void addClientListener(ClientListener listener) {//注冊ClientListener
        listeners.add(listener);
}

    public void add(Client client) {
        clients.add(client);  //新增 Client
        ClientEvent event = new ClientEvent(client);  //通知信息包装为 ClientEvent
        for(int i = 0; i < listeners.size(); i++) {  //逐一取出
            ClientListener listener = (ClientListener) listeners.get(i);
            listener.clientAdded(event);
        }
    }

    public void remove(Client client) {
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        for(int i = 0; i < listeners.size(); i++) {
            ClientListener listener = (ClientListener) listeners.get(i);
            listener.clientRemoved(event);
        }
    }
}
