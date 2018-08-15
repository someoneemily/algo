/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int max=0;
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        if(root.children.size()==0){
            return 1;
        }else{
            int maximum = 0;
            for(int c = 0; c<root.children.size(); c++){
                maximum = Math.max(maxDepth(root.children.get(c))+1, maximum);
            }
            return maximum;
        }
    }
}
