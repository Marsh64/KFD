package BinarySearchTree

class BinarySearchTree {
    companion object {
        class Node (var key: Int) {
            var left: Node? = null
            var right: Node? = null
        }
    }

    private var root: Node? = null
    private var size = 0

    constructor()
    constructor(arr: Iterable<Int>){
        for (node in arr) {
            this.add(node)
            size += 1
        }
    }

    public fun add(x: Int) {
        root = doInsert(root, x)
    }

    private fun doInsert(node: Node?, x: Int): Node {
        if (node == null)
            return Node(x)

        if (x < node.key)
            node.left = doInsert(node.left, x)
        else if (x > node.key)
            node.right = doInsert(node.right, x)

        return node
    }

    private fun heightOfBinaryTree(node: Node?): Int {
        if (node == null)
            return 0

        return 1 + Integer.max(heightOfBinaryTree(node.left), heightOfBinaryTree(node.right))
    }

    fun height() : Int{
        return heightOfBinaryTree(root)
    }
}