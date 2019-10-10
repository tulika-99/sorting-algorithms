class Node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class TreeSort {
    constructor() {
        this.root = null;
    }

    insert(data) {
        let newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode
        } else {
            this.insertNode(this.root, newNode);
        }
    }

    insertNode(node, newNode) {
        // if the data is less than the node
        // data move left of the tree
        if(newNode.data < node.data) {
            // if left is null insert node here
            if(node.left === null)
                node.left = newNode;
            else
                // if left is not null recurr until
                // null is found
                this.insertNode(node.left, newNode);
        } else {
            // if right is null insert node here
            if(node.right === null)
                node.right = newNode;
            else

                // if right is not null recurr until
                // null is found
                this.insertNode(node.right,newNode);
        }
    }

    getRootNode() {
        return this.root;
    }


    sort(node) {
        if(node !== null) {
            this.sort(node.left);
            console.log(node.data);
            this.sort(node.right);
        }
    }
}


const myArray = [2, 4, 1, 6, 8, 5, 9, 3, 4];

let treeSort = new TreeSort();

myArray.forEach(element => {
    treeSort.insert(element)
});

let root = treeSort.getRootNode();

treeSort.sort(root);