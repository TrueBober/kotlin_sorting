package ru.kiporskiy.kotlin.sotring

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class InsertSortingTest {
    lateinit var sorting: SortingTest

    @Before
    fun setUp() {
        sorting = SortingTest(InsertSorting())
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
