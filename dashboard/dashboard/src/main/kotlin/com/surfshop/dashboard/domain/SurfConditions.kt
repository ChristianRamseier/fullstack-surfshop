package com.surfshop.dashboard.domain

import com.surfshop.common.Direction
import com.surfshop.common.Meters
import com.surfshop.common.Speed
import org.jmolecules.architecture.layered.DomainLayer

@DomainLayer
class SurfConditions(
        private val speed: Speed,
        private val direction: Direction,
        private val waterLevel: Meters
) {
    fun getConditionSummary(): String {
        if (waterLevel.meters > 1.5) {
            if (speed.beaufort < 3) {
                return "Not enough wind to surf."
            } else if (speed.beaufort < 4) {
                if (isSouth()) {
                    return "Light breeze from the south, good for beginners."
                } else if (isNorth()) {
                    return "Light breeze from the north, good for beginners."
                } else {
                    return "Light breeze, but wrong wind direction."
                }
            } else if (speed.beaufort < 8) {
                if (isSouth()) {
                    return "Perfect wind from the south, let's surf!"
                } else if (isNorth()) {
                    return "Perfect wind from the south, let's surf!"
                } else {
                    return "Good wind, but wrong direction."
                }
            } else {
                if (isSouth() || isNorth()) {
                    return "Experts only"
                } else {
                    return "Too much wind and wrong direction."
                }
            }
        } else {
            return "Water level in the lagoon is too low to surf."
        }
    }

    private fun isSouth(): Boolean {
        return direction == Direction.S || direction == Direction.SW || direction == Direction.SE
    }

    private fun isNorth(): Boolean {
        return direction == Direction.N || direction == Direction.NW || direction == Direction.NE
    }
}
