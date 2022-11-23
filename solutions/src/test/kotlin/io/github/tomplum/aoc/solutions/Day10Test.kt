package io.github.tomplum.aoc.solutions

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class Day10Test {
    private val solution = Day10()

    @Test
    fun partOne() {
        assertThat(solution.part1()).isEqualTo(392097)
    }

    @Test
    fun partTwo() {
        assertThat(solution.part2()).isEqualTo(4263222782L)
    }
}
