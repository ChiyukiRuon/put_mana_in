# PutManaIn

> [!NOTE]  
> This is 1.21.1 neoforge documentation. For 1.20.1 forge, please click [here](https://github.com/ChiyukiRuon/put_mana_in/blob/main/README_EN.md).

[简体中文](https://github.com/ChiyukiRuon/put_mana_in/blob/1.21.1/README.md) | English

**PutManaIn** is an **Ars Nouveau** add-on that allows players to right-click on a **Source Jar** to inject their own mana into it.

> **Hand Crank for Mages!**

---  

## ⚙ **Configuration**

You can customize the mod's behavior by adjusting the following options in the configuration file:

| Config Key              | Type      | Default | Description                                                           |
|-------------------------|-----------|---------|-----------------------------------------------------------------------|
| `transferRatio`         | `double`  | `1.0`   | Determines the ratio of mana transfer; can be adjusted as needed      |
| `maxPerTrans`           | `int`     | `0`     | Maximum mana injected per transfer; `0` means no maximum              |
| `coolingTime`           | `int`     | `0`     | Cooldown time for mana injection, in ticks                            |
| `needEmptyHand`         | `boolean` | `true`  | Requires player to have an empty hand to transfer mana                |
| `noCrouching`           | `boolean` | `true`  | Disables mana transfer when crouching                                 |
| `cancelRightClickEvent` | `boolean` | `false` | Whether to cancel the right-click event after injecting is successful |
| `chargeParticleCount`   | `int`     | `20`    | The number of particles to be displayed when charging                 |
| `chargeParticleRadius`  | `double`  | `0.5`   | The radius of the particles to be displayed when charging             |

---

## 🪄 **Command**

Use `/pmi debug [enable|disable]` to enable or disable debug logging for the current game session

---

## ✨ **Thanks**

- [Forge](https://docs.minecraftforge.net/)
- [Ars Nouveau](https://github.com/baileyholl/Ars-Nouveau)

---  

## 📜 **LICENSE**

[MIT](https://github.com/ChiyukiRuon/put_mana_in/blob/main/LICENSE)  