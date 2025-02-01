package com.chiyukiruon.put_mana_in.apoli.power;

import com.chiyukiruon.put_mana_in.apoli.configuration.TransferManaConfiguration;
import io.github.edwinmindcraft.apoli.api.power.factory.PowerFactory;

public class TransferManaPower extends PowerFactory<TransferManaConfiguration> {

    public TransferManaPower() {
        super(TransferManaConfiguration.CODEC, false);
    }
}
