package JavaPractice;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void given3NumbersInStackWhenPopedShoulMatchWithLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer>myFirstNode  = new MyNode<>(70);
		MyNode<Integer>mySecondNode  = new MyNode<>(30);
		MyNode<Integer>myThirdNode  = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> popedNode = myStack.pop();
		myStack.printStack();

		Assert.assertEquals(myThirdNode, popedNode);
	}
}
