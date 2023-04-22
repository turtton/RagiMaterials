package ragi_materials.core.capability.item

import net.minecraft.item.ItemStack
import net.minecraftforge.items.ItemStackHandler
import ragi_materials.core.capability.EnumIOType

open class RagiItemHandler(slots: Int) : ItemStackHandler(slots) {

    private var ioType = EnumIOType.INPUT

    //    Custom    //

    open fun getIOType() = ioType

    open fun setIOType(type: EnumIOType): RagiItemHandler = also { ioType = type }

    open fun isEmpty(): Boolean {
        var result = 0
        for (slot in 0 until slots) {
            val stack = getStackInSlot(slot)
            if (stack.isEmpty) result++
        }
        return result == slots
    }

    open fun clear() {
        clear(0 until slots)
    }

    open fun clear(range: IntRange) {
        for (slot in range) {
            setStackInSlot(slot, ItemStack.EMPTY)
        }
    }
}