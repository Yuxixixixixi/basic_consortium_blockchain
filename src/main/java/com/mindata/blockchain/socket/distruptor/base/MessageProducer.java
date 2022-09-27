package com.mindata.blockchain.socket.distruptor.base;

public interface MessageProducer {
    void publish(BaseEvent baseEvent);
}
