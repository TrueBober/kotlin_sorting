package ru.kiporskiy.kotlin.sotring

/**
 * Сортировка элементов массива
 */
interface Sorting {

    /**
     * Отсортировать массив сравниваемых элементов
     */
    fun <T : Comparable<T>> sort(elements: Array<T>)

}

