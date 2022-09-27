package com.mindata.blockchain.core.sqlparser;

import com.mindata.blockchain.block.InstructionBase;

public interface InstructionParser {
    boolean parse(InstructionBase instructionBase);
}
