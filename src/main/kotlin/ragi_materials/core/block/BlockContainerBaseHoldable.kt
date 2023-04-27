package ragi_materials.core.block

import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.entity.EntityLivingBase
import net.minecraft.item.ItemStack
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import ragi_materials.core.tile.TileBase
import ragi_materials.core.util.dropItem
import java.util.*

//NBTタグを保持するブロック用のクラス
abstract class BlockContainerBaseHoldable<T : TileBase>(ID: String, material: Material, tile: Class<T>, maxTips: Int) : BlockContainerBase<T>(ID, material, tile, maxTips) {

    //    General    //

    override fun quantityDropped(random: Random): Int = 0 //デフォルトのドロップはなし

    //    Event    //

    override fun removeTile(tile: T, world: World, pos: BlockPos, state: IBlockState) {
        val metadata = this.damageDropped(state)
        val stack = ItemStack(this, 1, metadata)
        stack.tagCompound = tile.updateTag //NBTタグを引き継ぐ
        dropItem(world, pos, stack, 0.0, 0.25, 0.0)
    }

    override fun onTilePlaced(tile: T, world: World, pos: BlockPos, state: IBlockState, placer: EntityLivingBase, stack: ItemStack) {
        if (stack.tagCompound !== null) {
            val tag = stack.tagCompound!!.also {
                it.setInteger("x", tile.pos.x)
                it.setInteger("y", tile.pos.y)
                it.setInteger("z", tile.pos.z)
            }
            tile.readFromNBT(tag) //NBTタグから読み込む
        }
    }
}