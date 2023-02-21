package Tree;
import java.util.*;
public class BTree {
    static int idx=-1;
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BTree tr = new BTree();
        Node root = tr.buildTree(nodes);
        //System.out.println(root.data);
        //System.out.println(height(root));
        //levelOrder(root);
        //printPath(root,new Stack<>());
        //dfs(root);
        System.out.println(retMax(root));
    }

    public Node buildTree(int [] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
         Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
    static int retMax(Node root){
       return max(root);
    }

    static int max(Node curr){
        int left ;
        int right;

        if(curr == null){
            return Integer.MIN_VALUE;
        }
        int max = curr.data;
        left = max(curr.left);
        right = max(curr.right);
        if(left>max){
            max = left;
        }
        if (right>max){
            max = right;
        }
        return max;
    }
    static void dfs(Node root){
        ArrayDeque<Node> st = new ArrayDeque<>();
        Node temp;
        if(root!= null){
            st.push(root);
        }
        while(!st.isEmpty()){
            temp = st.pop();
            System.out.println(temp.data);
            if(temp.left!= null){
                st.push(temp.left);
            }
            if(temp.right!= null){
                st.push(temp.right);
            }
        }
    }
    static void printPath(Node root,Stack<Integer>s ){
        if(root==null){
            return;
        }
        s.push(root.data);
        if(root.left==null&&root.right==null){
            System.out.println(s);
            s.pop();
            return;
        }
        printPath(root.left,s);
        printPath(root.right,s);
        s.pop();

    }
    static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!= null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }


            }
        }
    }
    static public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static public void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static public void postOrder(Node root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static int countOfNodes(Node root){
        if(root==null){
            return 0 ;
        }
        int left = countOfNodes(root.left);
        int right = countOfNodes(root.right);

        return left+right+1;
    }
    static int sumOfNodes(Node root){
        if(root==null){
            return 0 ;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);

        return left+right+root.data;
    }
    static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight,rightHeight)+1;

        return myHeight;
    }
    class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}

