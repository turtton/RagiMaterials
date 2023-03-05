package hiiragi283.ragi_materials.packet

import hiiragi283.ragi_materials.tile.TileLaboTable
import net.minecraft.client.Minecraft
import net.minecraft.util.math.BlockPos
import net.minecraftforge.fml.common.network.simpleimpl.IMessage
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext

/*
  Thanks to defeatedcrow!
  Source: https://github.com/defeatedcrow/FluidTankTutorialMod/blob/master/src/main/java/defeatedcrow/tutorial/ibc/packet/MessageHandlerIBC.java
*/

class MessageHandlerLabo: IMessageHandler<MessageLabo, IMessage> {

    override fun onMessage(message: MessageLabo?, ctx: MessageContext?): IMessage? {
        //クライアント側のプレイヤーを取得
        val player = Minecraft.getMinecraft().player
        //messageがnullでない場合，座標を取得する
        if (message !== null) {
            val pos = BlockPos(message.x, message.y, message.z)
            val tile = player.world.getTileEntity(pos)
            if (tile !== null && tile is TileLaboTable) {
                tile.invLabo.clear() //インベントリを空にする
            }
        }
        return null
    }
}