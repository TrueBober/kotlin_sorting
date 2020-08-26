package ru.kiporskiy.kotlin.sotring

/**
 * Сортировка вставками. Самый быстрый алгоритм из всех видов простых сортировок.
 * Суть алгоритма заключается в том что, на каждом шаге алгоритма мы берем один из элементов массива,
 * находим позицию для вставки и вставляем
 * Временная сложность алгоритма такая же, как и у других простых методов сортировки O(N^2), но работает
 * существенно быстрее, чем пузырьковая сортировка и в большинстве случаев быстрее сортировки выбором.
 */
class InsertSorting : Sorting {

    override fun <T : Comparable<T>> sort(elements: Array<T>) {
        //массив из одного элемента или без элементов считается отсортированным
        if (elements.size <= 1)
            return

        //проход по всем элементам с первой позиции
        for (i in 1 until elements.size) {
            //маркируем i-ый элемент
            val marked: T = elements[i]
            //отмечаем текущую позицию
            var k = i
            //выполняется обрытный проход до тех пор, пока не дойдем до нулевой позиции, либо пока элементы больше
            //маркированного
            while (k > 0 && elements[k - 1] > marked) {
                elements[k] = elements[k - 1]
                k--
            }
            //вставляем в текущую позицию "маркер"
            elements[k] = marked
        }
    }
}