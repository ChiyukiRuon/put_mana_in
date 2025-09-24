# 手充魔力

> [!NOTE]  
> 这是 1.21.1 neoforge 版本的文档，1.20.1 forge 的文档请看[这里](https://github.com/ChiyukiRuon/put_mana_in/blob/main/README.md)

简体中文 | [English](https://github.com/ChiyukiRuon/put_mana_in/blob/1.21.1/README_EN.md)

**手充魔力** 是 **新生魔艺** 的附属模组，允许玩家右键 **魔源罐** 时，将自身的魔力注入其中。

> **我们魔法师也要有自己的手摇曲柄！**

---

## ⚙ **配置项**

你可以在配置文件中调整以下选项，以自定义模组的行为：

| 配置项                     | 类型        | 默认值     | 说明                 |
|-------------------------|-----------|---------|--------------------|
| `transferRatio`         | `double`  | `1.0`   | 设置魔力注入的比率，可根据需要调整  |
| `maxPerTrans`           | `int`     | `0`     | 单次注入魔力上限，`0` 表示无上限 |
| `coolingTime`           | `int`     | `0`     | 注入魔力冷却时间，单位为 tick  |
| `needEmptyHand`         | `boolean` | `true`  | 仅在空手时注入魔力          |
| `noCrouching`           | `boolean` | `true`  | 潜行时不注入魔力           |
| `cancelRightClickEvent` | `boolean` | `false` | 是否在充能成功后取消右键事件     |
| `chargeParticleCount`   | `int`     | `20`    | 充能时的粒子数量           |
| `chargeParticleRadius`  | `double`  | `0.5`   | 充能时的粒子播放半径         |

---

## 🪄 **指令**

输入`/pmi debug [enable|disable]` 可以在本次游戏开启/关闭调试日志的输出

---

## ✨ **鸣谢**

- [Forge](https://docs.minecraftforge.net/)
- [新生魔艺](https://github.com/baileyholl/Ars-Nouveau)

--- 

## 📜 **LICENSE**

[MIT](https://github.com/ChiyukiRuon/put_mana_in/blob/main/LICENSE)