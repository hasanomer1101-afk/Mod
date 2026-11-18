package com.mamictaft;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

/** Çakmak (flint and steel) ile sağ tıklanınca büyük patlama yapar. */
public class AtomBombBlock extends Block {
    public AtomBombBlock(Properties props) { super(props); }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos,
                                          Player player, InteractionHand hand, BlockHitResult hit) {
        if (!stack.is(Items.FLINT_AND_STEEL)) return InteractionResult.PASS;
        if (!level.isClientSide()) {
            level.removeBlock(pos, false);
            level.explode(null, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 25.0f, Level.ExplosionInteraction.TNT);
        }
        return InteractionResult.SUCCESS;
    }
}
