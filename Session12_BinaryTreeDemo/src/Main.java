import ra.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(3);
        bt.insert(10);
        bt.insert(9);
        bt.insert(15);
        //Duyet cay nhi phan theo postOrder tinh tu node root
        bt.postOrder(bt.getRoot());
    }
}