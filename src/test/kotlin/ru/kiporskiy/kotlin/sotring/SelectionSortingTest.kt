package ru.kiporskiy.kotlin.sotring

import org.junit.Before
import org.junit.Test

class SelectionSortingTest {
    lateinit var sorting: SortingTest

    @Before
    fun setUp() {
        sorting = SortingTest(SelectionSorting())
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
