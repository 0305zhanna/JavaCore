package lesson180117;

import java.util.*;

public class SimpleBinaryTree<E extends Comparable<E>> {
    Node<E> root;

    public void add(E value){
        root = createOrAdd(root,value);
    }


    public boolean remove(E value){
        return false;
    }
    private static <X extends Comparable<X>> Node<X> createOrAdd(Node<X> node, X value) {
        if(node == null){
            node = new Node<>(value);
        }else {
            node.add(value);
        }
        return node;
    }

    static class Node<T extends Comparable>{
        T value;
        Node<T> left = null;

        Node<T> right = null;

        public Node(T value){
            this.value = value;
        }
        void add(T value){
            if(this.value.compareTo(value) > 0){
                left = createOrAdd(left,value);
            }else {
                right = createOrAdd(right,value);
            }
        }
    }

    public Iterable<E> bFIterator(){
        return new Iterable<E>() {
            @Override
            public Iterator<E> iterator() {
                return new BFIterator();
            }
        };
    }
    public Iterable<E> dFIterator(){
        return new Iterable<E>() {
            @Override
            public Iterator<E> iterator() {
                return null;//new DFIterator();
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,3,8,5,2,1,10);
        SimpleBinaryTree<Integer> tree = new SimpleBinaryTree();

        for (Integer el : list) {
            tree.add(el);
        }

        for (Integer el : tree.bFIterator()) {
            System.out.println(el);
        }

    }

    private class BFIterator implements Iterator<E> {
        Queue<Node<E>> queue = new LinkedList<>();
        public BFIterator(){
            queue.offer(root);
        }

        @Override
        public boolean hasNext() {
            return  !queue.isEmpty();
        }

        @Override
        public E next() {
            Node<E> cur = queue.poll();
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
            return cur.value;
        }
    }
//    private class DFIterator implements Iterator<E> {
//        Node<E> cur = root;
//
////        public DFIterator(){
////            queue.offer(root);
////        }
//
//        @Override
//        public boolean hasNext() {
////            return  !queue.isEmpty();
//        }
//
//        @Override
//        public E next() {
//
//        }
//    }
}
