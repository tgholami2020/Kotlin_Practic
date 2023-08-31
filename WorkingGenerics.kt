

    class MutableStack<E>(vararg items: E){
        private val elements = items.toMutableList()
        fun push (element:E) = elements.add(element)
        fun peek (): E = elements.last()
        fun pop (): E= elements.removeAt(elements.size-1)
        fun isEmpty() = elements.isEmpty()
        fun size() = elements.size
        override fun toString() = "MutableStack(${elements.joinToString()})"
    }
    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

    fun main() {
        val stack = mutableStackOf(0.62, 3.14, 2.7)
        println(stack)
        stack.push(4.3)
        stack.peek()
        stack.pop()
        stack.isEmpty()
        stack.push(234.5)
        stack.size()
    }
