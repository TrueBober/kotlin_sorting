package ru.kiporskiy.kotlin.sotring

import org.junit.Before
import org.junit.Test

class BubbleSortingTest {

    lateinit var sorting: SortingTest

    @Before
    fun setUp() {
        sorting = SortingTest(BubbleSorting())
    }

    @Test
    internal fun sortingEmptyDoNothing() {
        sorting.sortingEmptyDoNothing()
    }

    @Test
    fun sortingArrayWithOneElementDoNothing() {
        sorting.sortingArrayWithOneElementDoNothing()
    }

    @Test
    fun sortingElements() {
        sorting.sortingElements()
    }
}
