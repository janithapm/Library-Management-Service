import java.util.List;

public class Node<T> {
	
	private Node<T> parentNode ;
	private List<Node<T>> childNodes ;
	private T value ;
	private String type;
	
	public Node<T> getParentNode() {
		return parentNode;
	}
	public void setParentNode(Node<T> parentNode) {
		this.parentNode = parentNode;
	}
	public List<Node<T>> getChildNodes() {
		return childNodes;
	}
	public void setChildNodes(List<Node<T>> childNodes) {
		this.childNodes = childNodes;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
