package com.chiyukiruon.put_mana_in.apoli.configuration;

import com.mojang.serialization.Codec;
import io.github.edwinmindcraft.apoli.api.IDynamicFeatureConfiguration;

public record TransferManaConfiguration() implements IDynamicFeatureConfiguration {

    public static final Codec<TransferManaConfiguration> CODEC = Codec.unit(new TransferManaConfiguration());
}
