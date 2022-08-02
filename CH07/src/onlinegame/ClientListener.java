package onlinegame;

public interface ClientListener {
    void clientAdded(ClientEvent event);  //新增 Client 会调用这个方法
    void clientRemoved(ClientEvent event);  //移除 Client 会调用这个方法
}
