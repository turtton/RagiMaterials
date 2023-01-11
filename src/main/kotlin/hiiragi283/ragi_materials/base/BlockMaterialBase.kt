package hiiragi283.ragi_materials.base

import hiiragi283.ragi_materials.Reference
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.block.properties.PropertyInteger
import net.minecraft.block.state.BlockStateContainer
import net.minecraft.block.state.IBlockState
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import java.util.*

/*
  Thanks to defeatedcrow!
  Source: https://github.com/defeatedcrow/HeatAndClimateLib/blob/1.12.2_v3/main/java/defeatedcrow/hac/core/base/BlockDC.java
          https://github.com/defeatedcrow/HeatAndClimateLib/blob/1.12.2_v3/main/java/defeatedcrow/hac/core/base/DCSimpleBlock.java
*/

open class BlockMaterialBase(Material: Material?, MOD: String, ID: String?) : Block(Material!!) {

    //private変数の宣言
    companion object {
        private val propertyMaterial = PropertyInteger.create("material", 0, Reference.numMaterial)
    }

    //コンストラクタの初期化
    init {
        this.setCreativeTab(CreativeTabs.DECORATIONS) //表示するクリエイティブタブの設定
        defaultState = blockState.baseState.withProperty(propertyMaterial, 0) //デフォルトのBlockstateをpropertyの0番に設定
        setRegistryName(MOD, ID) //IDの設定
        unlocalizedName = ID.toString() //翻訳キーをIDから取得
    }

    //Blockstateの登録をするメソッド
    override fun createBlockState(): BlockStateContainer {
        //propertyMaterialを使用すると、Blockstateは"type=0"から"type=15"までが登録される
        return BlockStateContainer(this, propertyMaterial)
    }

    //Blockstateからメタデータを得るメソッド
    override fun getMetaFromState(state: IBlockState): Int {
        //propertyMaterialをもとにBlockstateからメタデータを返す
        val i = state.getValue(propertyMaterial)
        //メタデータがReference.numMaterialよりも大きい場合、最大値を返す
        return i.coerceAtMost(Reference.numMaterial)
    }

    //メタデータからBlockstateを得るメソッド
    override fun getStateFromMeta(meta: Int): IBlockState {
        //metaをmaxMete+1で割った剰余を求める
        //これReference.numMaterial % Reference.numMaterial = 0になるからわざと+1してます
        val i = meta % (Reference.numMaterial + 1)
        //propertyMaterialをもとに指定したメタデータからBlockstateを返す
        return defaultState.withProperty(propertyMaterial, i)
    }

    //Blockstateをもとにドロップするアイテムのメタデータを指定するメソッド
    override fun damageDropped(state: IBlockState): Int {
        //propertyMaterialをもとにBlockstateからメタデータを返す
        val i = state.getValue(propertyMaterial)
        //メタデータがReference.numMaterialよりも大きい場合、最大値を返す
        return i.coerceAtMost(Reference.numMaterial)
    }

    //ドロップするアイテムを得るメソッド
    override fun getItemDropped(state: IBlockState, rand: Random, fortune: Int): Item {
        //Blockstateからブロックを取得し、更にそこからアイテムを取得して返す
        return Item.getItemFromBlock(state.block)
    }

    //ドロップする確率を得るメソッド
    override fun quantityDropped(random: Random): Int {
        //常にドロップさせるので1を返す
        return 1
    }
}