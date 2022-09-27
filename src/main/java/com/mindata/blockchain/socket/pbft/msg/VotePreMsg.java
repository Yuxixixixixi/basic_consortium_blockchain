package com.mindata.blockchain.socket.pbft.msg;

import com.mindata.blockchain.block.Block;

public class VotePreMsg extends VoteMsg {
    private Block block;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}
