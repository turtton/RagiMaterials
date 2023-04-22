package ragi_materials.core.material

import net.minecraft.item.ItemStack
import ragi_materials.core.util.RagiColor

interface IMaterialItem {

    fun getColor(stack: ItemStack, tintIndex: Int) = if (tintIndex == 0) getMaterial(stack).color else RagiColor.WHITE

    fun getMaterial(stack: ItemStack) = RagiMaterial.EMPTY

    fun setMaterial(stack: ItemStack, material: RagiMaterial) = stack

}