public class MinStack {

    Node head;
    Node min;
    
    /** initialize your data structure here. */
    public MinStack() {
        head = null;
        min = null;
    }
    
    public void push(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = node;
            min = node;
        } else {
            node.next = head;
            head = node;
            
            if (x < min.val) {
                node.nextMin = min;
                min = node;
            } else {
                Node temp1 = min; 
                Node temp2;
                if (temp1.nextMin == null) {
                    min.nextMin = node;
                } else {
                    temp2 = temp1.nextMin;
                    while (temp2.val < x) {
                        temp1 = temp1.nextMin;
                        temp2 = temp2.nextMin;
                        if (temp2 == null) {
                            break;
                        }
                    }
                    node.nextMin = temp2;
                    temp1.nextMin = node;
                }
            }
        }
    }
    
    public void pop() {
        if (head == null) {
            return;
        }
        if (getMin() == head.val) {
            min = min.nextMin;
        }
        head = head.next;
    }
    
    public int top() {
        if (head != null) 
            return head.val;
        return 0;
    }
    
    public int getMin() {
        return min.val;
    }
}

class Node {
    int val;
    Node next;
    Node nextMin;
    public Node (int num) {
        val = num;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */