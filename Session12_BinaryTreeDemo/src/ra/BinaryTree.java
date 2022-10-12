package ra;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insertNode(Node current, int value){
        if (current==null){
            //Binary Tree chua chua bat ky node nao
            current = new Node(value);
            return current;
        }else{
            //Binary Tree da chua node
            if (value<current.getValue()){
                //value nam o node ben trai
                current.setLeft(insertNode(current.getLeft(),value));
            } else if (value>current.getValue()) {
                //value nam o node ben phai
                current.setRight(insertNode(current.getRight(),value));
            }else{
                return current;
            }
        }
        return current;
    }

    public void insert(int value){
        this.root = insertNode(this.root,value);
    }

    public void postOrder(Node node){
        if (node!=null){
            //Duyet cac node ben cay trai de quy
            postOrder(node.getLeft());
            //Duyet cac node ben cay phai de quy
            postOrder(node.getRight());
            System.out.println(node.getValue()+"");
        }
    }
}
