package ru.kiporskiy.kotlin.sotring

/**
 * Сортировка выбором.
 *
 * Суть сортировки: самый "маленький" элемент должен перемещаться влево, на первом проходе среди всех элементов ищется
 * самый маленький, он меняется позицией с элементом на нулевой позиции, дальше этот элемент в сравнениях не
 * участвует, т.к. он уже отсортирован. На следующем проходе сравнения начинаются с элемента на первой позиции,
 * после нахождения самого маленького его позиция меняется с элементом на первой позиции и т.д.
 * По сравнению с пузырьковой сортировкой количество перестановок уменьшается до O(N), количество сравнений такое
 * же O(N^2).
 */
class SelectionSorting : Sorting {

    override fun <T : Comparable<T>> sort(elements: Array<T>) {
        //массив пустой или содержит всего один элемент - сортировать нечего
        if (elements.size <= 1)
            return

        for (i in elements.indices) {
            //сначала самым маленьким считается первый элемент
            var minElement = elements[i]
            //хранение позиции самого маленького элемента
            var minPosition = i

            for (j in i + 1 until elements.size) {
                //среди остальных элементов найти самый маленький
                if (minElement > elements[j]) {
                    minElement = elements[j]
                    minPosition = j
                }
            }

            //если есть элемент меньше, чем в начальной позиции, то поменять их местами
            if (minPosition != i) {
                val tmp = elements[i]
                elements[i] = minElement
                elements[minPosition] = tmp
            }
        }
    }
}
