package com.chiyukiruon.put_mana_in.apoli.register;

import com.chiyukiruon.put_mana_in.PutManaIn;
import com.chiyukiruon.put_mana_in.apoli.power.TransferManaPower;
import io.github.edwinmindcraft.apoli.api.power.factory.PowerFactory;
import io.github.edwinmindcraft.apoli.api.registry.ApoliRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PutManaInPower {
    public static final DeferredRegister<PowerFactory<?>> POWERS = DeferredRegister.create(ApoliRegistries.POWER_FACTORY_KEY, PutManaIn.MODID);

    public static final RegistryObject<PowerFactory<?>> TRANSFER_MANA = POWERS.register("transfer_mana", TransferManaPower::new);
}
