package com.mindata.blockchain.socket.distruptor;

import com.lmax.disruptor.EventHandler;
import com.mindata.blockchain.ApplicationContextProvider;
import com.mindata.blockchain.socket.distruptor.base.BaseEvent;


public class DisruptorClientHandler implements EventHandler<BaseEvent> {

    @Override
    public void onEvent(BaseEvent baseEvent, long sequence, boolean endOfBatch) throws Exception {
        ApplicationContextProvider.getBean(DisruptorClientConsumer.class).receive(baseEvent);
    }
}
