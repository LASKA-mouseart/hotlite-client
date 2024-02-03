/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api

import java.awt.Polygon

/**
 * Represents a player entity in the game.
 */
interface Player : Actor {
    /**
     * Get the ID of the player
     *
     * @return
     */
    val id: Int
    override fun getCombatLevel(): Int

    /**
     * Gets the composition of this player.
     *
     * @return the composition
     */
    val playerComposition: PlayerComposition?

    /**
     * Gets the polygons that make up the players model.
     *
     * @return the model polygons
     */
    val polygons: Array<Polygon?>?

    /**
     * Gets the current team cape team number the player is on.
     *
     * @return team number, or 0 if not on any team
     */
    val team: Int

    /**
     * Checks whether this player is a member of the same friends chat
     * the local player.
     *
     * @return true if the player is a friends chat member, false otherwise
     */
    val isFriendsChatMember: Boolean

    /**
     * Checks whether this player is a friend of the local player.
     *
     * @return true if the player is a friend, false otherwise
     */
    val isFriend: Boolean

    /**
     * Checks whether the player is a member of the same clan as the local player.
     *
     * @return
     */
    val isClanMember: Boolean

    /**
     * Gets the displayed overhead icon of the player.
     *
     * @return the overhead icon
     */
    val overheadIcon: HeadIcon?

    /**
     * Gets the displayed skull icon of the player.
     * Only works on the local player.
     *
     * @return the skull icon
     */
    val skullIcon: SkullIcon?

    companion object
}
