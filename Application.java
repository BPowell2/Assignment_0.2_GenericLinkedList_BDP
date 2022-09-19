//Benjamin Powell 9/19/22
public class Application { 

  

public static void main(String[] args) { 

LinkedListG<Integer> myList = new LinkedListG<Integer>(); // this makes the list 

LinearNode<Integer> aNode = new LinearNode<Integer>(); // this makes the node 

aNode.setLinearData(43); // this sets the data of the node to a integer 

myList.addNode(aNode);// this add a node to the list 

System.out.println(myList.head.LinearData); 

aNode.setLinearData(56); 

myList.addNode(aNode); 

System.out.println(myList.head.LinearData); 

  

} 

} 
