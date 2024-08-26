
/**
 * This class models a Node object which can hold objects of any type. Each
 * node has its internal data (object of type T) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson / Jacob Roberts
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode <T> {
	
	private T data;  //data that the object stores
	private GenericNode<T> nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Default constructor to build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode() {
		setNextNode(null);
		data = null;
	}//end empty-argument constructor
	
	
	
	/**
	 * Preferred constructor. Sets nextNode to null and data to passed data
	 * 
	 * @param data the data to set
	 */
	public GenericNode(T data) {
		setNextNode(null);
		this.data = data;
	}

	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return T (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return GenericNode of type T
	 */
	public GenericNode<T> getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode<T> nextNode)
	{
		this.nextNode = nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	public GenericNode<T> getNextNode() {
		return nextNode;
	}//end getNextNode

	@Override
	public String toString() {
		return "GenericNode: " + "[type=" + data.getClass().getSimpleName() +", data=" + data + ", nextNode=" + nextNode + "]";
	}


	
	
}//end class