# 手充魔力

简体中文 | [English](https://github.com/ChiyukiRuon/put_mana_in/blob/main/README_EN.md)

**手充魔力** 是 **新生魔艺** 的附属模组，允许玩家右键 **魔源罐** 时，将自身的魔力注入其中。

> **我们魔法师也要有自己的手摇曲柄！**

---

## ⚙ 配置项

你可以在配置文件中调整以下选项，以自定义模组的行为：

#### `transferRatio` - **魔力转换比率**
- **类型**：`double`
- **默认值**：`1.0`
- 设置魔力注入的比率，可根据需要调整

#### `maxPerTrans` - **单次注入魔力上限**
- **类型**：`int`
- **默认值**：`0`
- 设置魔力注入的魔力上限。`0` 为无上限

#### `coolingTime` - **注入魔力冷却时间**
- **类型**：`int`
- **默认值**：`0`
- 设置魔力注入的冷却时间，单位为 tick

#### `onlyForOrigins` - **仅对起源生效**
- **类型**：`boolean`
- **默认值**：`false`
- 仅在 **安装了起源（Origins）模组** 后生效
- 提供能力：`put_mana_in:transfer_mana`
- 可通过起源的数据包调用，使特定起源拥有该能力

**示例**：
```json
{
    "type": "put_mana_in:transfer_mana",
    "name": "手充魔力",
    "description": "我们魔法师也要有自己的手摇曲柄！"
}
```

#### `needEmptyHand` - **仅在空手时注入魔力**
- **类型**：`boolean`
- **默认值**：`false`

#### `noCrouching` - **潜行时不注入魔力**
- **类型**：`boolean`
- **默认值**：`false`

---

## ✨ **鸣谢**

- [Forge](https://docs.minecraftforge.net/)
- [新生魔艺](https://github.com/baileyholl/Ars-Nouveau)
- [起源(Forge)](https://github.com/EdwinMindcraft/origins-forge)

--- 

## 📜 **LICENSE**

[MIT](https://github.com/ChiyukiRuon/put_mana_in/blob/main/LICENSE)