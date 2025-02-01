# PutManaIn

[简体中文](https://github.com/ChiyukiRuon/put_mana_in/blob/main/README.md) | English

**PutManaIn** is an **Ars Nouveau** add-on that allows players to right-click on a **Source Jar** to inject their own mana into it.

> **Hand Crank for Mages!**

---  

## ⚙ Configuration

You can customize the mod's behavior by adjusting the following options in the configuration file:

#### `transferRatio` - **Mana Transfer Ratio**
- **Type**: `double`
- **Default**: `1.0`
- Determines the ratio of mana transfer; can be adjusted as needed

#### `maxPerTrans` - **Maximum Mana Per Injection**
- **Type**: `int`
- **Default**: `0`
- Determines the maximum amount of mana that can be injected at once. `0` means no maximum

#### `coolingTime` - **The cooling time of transferring mana**
- **Type**: `int`
- **Default**: `0`
- Sets the cooldown time for mana injection, by tick

#### `onlyForOrigins` - **Restricted to Origins**
- **Type**: `boolean`
- **Default**: `false`
- Only takes effect when the **Origins (Forge) mod** is installed
- Provides the power: `put_mana_in:transfer_mana`
- Can be triggered via **Origins datapack** to allow specific origins to use this power

**Example**:
```json
{
    "type": "put_mana_in:transfer_mana",
    "name": "PutManaIn",
    "description": "Hand Crank for Mages!"
}
```  

#### `needEmptyHand` - **Requires Empty Hand While Transfer Mana**
- **Type**: `boolean`
- **Default**: `false`

#### `noCrouching` - **Disable Transfer Mana While Crouching**
- **Type**: `boolean`
- **Default**: `false`

---  

## ✨ **Thanks**

- [Forge](https://docs.minecraftforge.net/)
- [Ars Nouveau](https://github.com/baileyholl/Ars-Nouveau)
- [Origins (Forge)](https://github.com/EdwinMindcraft/origins-forge)

---  

## 📜 **LICENSE**

[MIT](https://github.com/ChiyukiRuon/put_mana_in/blob/main/LICENSE)  