package _12_JavaCollectionFramework.BaiTap.DuyetPostorderTrongBST;

import _12_JavaCollectionFramework.ThucHanh.SetupBinaryTree.BST;

public class DuyetPostorder {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(7);
        tree.insert(9);
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(8);
        //traverse tree
        System.out.println("Postorder (sorted): ");
        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
