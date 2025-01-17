package hiiragi283.material

import hiiragi283.material.init.RMItems
import net.minecraft.item.Item
import net.minecraftforge.client.event.ColorHandlerEvent
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

object RMEventHandler {

    @SubscribeEvent
    fun registerItems(event: RegistryEvent.Register<Item>): Unit = RMItems.register(event.registry)

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    fun registerColor(event: ColorHandlerEvent.Item): Unit = RMItems.registerColorItem(event.itemColors)

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    fun registerModel(event: ModelRegistryEvent): Unit = RMItems.registerModel()

}