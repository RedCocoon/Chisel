package com.cricketcraft.chisel.api.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public interface ISubmapManager {

	/**
	 * Gets the icon for item rendering, based on side and item metadata.
	 * 
	 * @param side
	 *            Side of the ItemBlock.
	 * @param meta
	 *            Metadata of the ItemBlock.
	 * @return The IIcon for rendering.
	 */
	IIcon getIcon(int side, int meta);

	/**
	 * Gets the icon for world rendering, based on world position and side.
	 */
	IIcon getIcon(IBlockAccess world, int x, int y, int z, int side);

	/**
	 * Hook for registering any custom icons you might need in this class. Will be called during the normal block method.
	 * 
	 * @param modName
	 *            The mod ID this submap was registered to.
	 * @param block
	 *            The block being registered for.
	 * @param register
	 *            The IIconRegister instance.
	 */
	void registerIcons(String modName, Block block, IIconRegister register);
}