package com.example.unittesting.exercise3

import com.example.unittesting.example3.Interval
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class IntervalsAdjacencyDetectorTest {

    private lateinit var SUT: IntervalsAdjacencyDetector

    @Before
    @Throws(Exception::class)
    fun setup() {
        SUT = IntervalsAdjacencyDetector()
    }

    // interval1 is before interval2
    @Test
    @Throws(Exception::class)
    fun isIntervalsAdjacency_interval1BeforeInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(8, 12)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    // interval1 adjacency interval2 on start
    @Test
    @Throws(Exception::class)
    fun isIntervalsAdjacency_interval1OverlapsInterval2OnStart_trueReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(5, 12)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    // interval1 is contained within interval2
    @Test
    @Throws(Exception::class)
    fun isIntervalsAdjacency_interval1ContainedWithinInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-4, 12)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    // interval1 contains interval2
    @Test
    @Throws(Exception::class)
    fun isIntervalsAdjacency_interval1ContainsInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(0, 3)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    // interval1 overlaps interval2 on end
    @Test
    @Throws(Exception::class)
    fun isIntervalsAdjacency_interval1OverlapsInterval2OnEnd_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-4, 4)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    // interval1 is after interval2
    @Throws(Exception::class)
    @Test
    fun isIntervalsAdjacency_interval1AfterInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-10, -3)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    @Throws(Exception::class)
    fun isIntervalsAdjacency_interval1BeforeAdjacentInterval2_trueReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(5, 8)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    @Test
    @Throws(Exception::class)
    fun isIntervalsAdjacency_interval1AfterAdjacentInterval2_trueReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-3, -1)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    @Test
    @Throws(Exception::class)
    fun isIntervalsAdjacency_interval1SameInterval2_falseReturned() {
        val interval1 = Interval(-1, 5)
        val interval2 = Interval(-1, 5)
        val result = SUT.isAdjacent(interval1, interval2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }
}