# PutManaIn

[简体中文](https://github.com/ChiyukiRuon/put_mana_in/blob/main/README.md) | English

**PutManaIn** is an **Ars Nouveau** add-on that allows players to right-click on a **Source Jar** to inject their own mana into it.

> **Hand Crank for Mages!**

---  

## ⚙ Configuration

You can customize the mod's behavior by adjusting the following options in the configuration file:

| Config Key       | Type      | Default | Description                                                                                                                                |
|------------------|-----------|---------|--------------------------------------------------------------------------------------------------------------------------------------------|
| `transferRatio`  | `double`  | `1.0`   | Determines the ratio of mana transfer; can be adjusted as needed                                                                           |
| `maxPerTrans`    | `int`     | `0`     | Maximum mana injected per transfer; `0` means no maximum                                                                                   |
| `coolingTime`    | `int`     | `0`     | Cooldown time for mana injection, in ticks                                                                                                 |
| `onlyForOrigins` | `boolean` | `false` | Effective only if **Origins (Forge) mod** is installed; provides power `put_mana_in:transfer_mana` and can be enabled via Origins datapack |
| `needEmptyHand`  | `boolean` | `false` | Requires player to have an empty hand to transfer mana                                                                                     |
| `noCrouching`    | `boolean` | `true`  | Disables mana transfer when crouching                                                                                                      |

Origins Power Example
```json
{
    "type": "put_mana_in:transfer_mana",
    "name": "PutManaIn",
    "description": "Hand Crank for Mages!"
}
```

---

## 🪄 **Command**

Use `/pmi debug [enable|disable]` to enable or disable debug logging for the current game session

---

## ✨ **Thanks**

- [Forge](https://docs.minecraftforge.net/)
- [Ars Nouveau](https://github.com/baileyholl/Ars-Nouveau)
- [Origins (Forge)](https://github.com/EdwinMindcraft/origins-forge)

---  

## 📜 **LICENSE**

[MIT](https://github.com/ChiyukiRuon/put_mana_in/blob/main/LICENSE)  