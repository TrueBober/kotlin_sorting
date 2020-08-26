package ru.kiporskiy.kotlin.sotring

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertTrue
import java.util.*
import kotlin.random.Random

class SortingTest(private val sorting: Sorting) {

    internal fun sortingEmptyDoNothing() {
        val array: Array<String> = arrayOf()
        val arrayCopy = array.copyOf()

        sorting.sort(array)

        assertArrayEquals(array, arrayCopy)
    }

    fun sortingArrayWithOneElementDoNothing() {
        val array = arrayOf("test")
        val arrayCopy = array.copyOf()

        sorting.sort(array)

        assertArrayEquals(array, arrayCopy)
    }

    fun sortingElements() {
        val array1 = arrayOf(1, 2, 5, 3, 9, 0, 4, 6, 8, 7)
        val array1Copy = array1.copyOf()
        val array2 = arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
        val array2Copy = array2.copyOf()
        val array3 = Array(10_000) { Random.nextInt(-100, 100) }
        val array3Copy = array3.copyOf()

        sorting.sort(array1)
        sorting.sort(array2)
        sorting.sort(array3)

        checkSorted(array1Copy, array1)
        checkSorted(array2Copy, array2)
        checkSorted(array3Copy, array3)
    }

    private fun checkSorted(src: Array<Int>, array1: Array<Int>) {
        var prev: Int = Int.MIN_VALUE
        for (i in array1) {
            assertTrue(i >= prev)
            prev = i
        }

        val copy = LinkedList(array1.asList())
        for (element in src) {
            assertTrue(copy.remove(element))
        }
    }
}
