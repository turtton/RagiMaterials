package hiiragi283.ragi_materials.init

import hiiragi283.ragi_materials.items.ItemBlockMaterialMetal
import hiiragi283.ragi_materials.items.ItemBookDebug
import hiiragi283.ragi_materials.items.ItemMaterialDust
import hiiragi283.ragi_materials.items.ItemMaterialMetal
import net.minecraftforge.fml.common.registry.ForgeRegistries

object RagiInitItem {

    //Itemの定義
    val ItemBlockBlock = ItemBlockMaterialMetal(RagiInitBlock.BlockMetal)
    val ItemBookDebug = ItemBookDebug()
    val ItemDust = ItemMaterialDust()
    val ItemIngot = ItemMaterialMetal("ingot")
    val ItemNugget = ItemMaterialMetal("nugget")
    val ItemPlate = ItemMaterialMetal("plate")

    //Itemを登録するメソッド
    fun registerItems() {
        ForgeRegistries.ITEMS.register(ItemBlockBlock)
        ForgeRegistries.ITEMS.register(ItemBookDebug)
        ForgeRegistries.ITEMS.register(ItemDust)
        ForgeRegistries.ITEMS.register(ItemIngot)
        ForgeRegistries.ITEMS.register(ItemNugget)
        ForgeRegistries.ITEMS.register(ItemPlate)
    }

}