package hiiragi283.ragi_materials.client.gui

import hiiragi283.ragi_materials.base.TileLockableBase
import hiiragi283.ragi_materials.client.container.ContainerLaboTable
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.ResourceLocation

class GuiLaboTable(player: EntityPlayer, tile: TileLockableBase) : GuiBase<TileLockableBase>(ContainerLaboTable(player, tile)) {

    init {
        ySize = 133
    }

    override val background = ResourceLocation("minecraft:textures/gui/container/hopper.png")

}