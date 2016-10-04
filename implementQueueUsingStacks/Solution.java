class MyQueue {
    
    Stack<Integer> insertionStack = new Stack<Integer>();
	Stack<Integer> deletionStack = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        insertionStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (deletionStack.isEmpty()) {
			if (insertionStack.isEmpty()) {
				return;
			} else {
				while (!insertionStack.isEmpty()) {
					deletionStack.push(insertionStack.pop());
				}
				deletionStack.pop();
				return; 
			}
		} else {
			deletionStack.pop();
			return;
		}
    }

    // Get the front element.
    public int peek() {
        if (deletionStack.isEmpty()) {
			if (insertionStack.isEmpty()) {
				System.out.println("Queue Empty");
				return 0;
			} else {
				while (!insertionStack.isEmpty()) {
					deletionStack.push(insertionStack.pop());
				}
				return deletionStack.peek();
			}
		} else {
			return deletionStack.peek();
		}
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return (insertionStack.isEmpty() && deletionStack.isEmpty());
    }
}