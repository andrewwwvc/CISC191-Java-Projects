package cisc191.sdmesa.edu;
/**
 * Lead Author(s):
 * 
 * @author
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date:
 * 
 * Responsibilities of class:
 * 
 */
public class NameNode
{
	//A NameNode has-a left node
	private NameNode leftNode;
	
	//A NameNode has-a name
	private String name;
	
	//A NameNode has-a right node
	private NameNode rightNode;

	/**
	 * 
	 * @param newName the String stored in the node
	 */
	public NameNode(String newName)
	{
		//store newName in node;
		this.name = newName;
		
		//Default node
		this.leftNode = null;
		this.rightNode = null;
		
	}
	
	/**
	 * 
	 * @return the String stored in the node
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the left node of this node
	 * @param newLeft
	 */
	public void setLeft(NameNode newLeft)
	{
		this.leftNode = newLeft;
		
	}
	
	/**
	 * Set the right node of this node
	 * @param newRight
	 */
	public void setRight(NameNode newRight)
	{
		this.rightNode = newRight;
		
	}
	
	/**
	 * 
	 * @return the left node of this node
	 */
	public NameNode getLeft()
	{
		return leftNode;
	}
	
	/**
	 * 
	 * @return the right node of this node
	 */
	public NameNode getRight()
	{
		return rightNode;
	}
	
	/**
	 * Find the least name in the tree
	 * @return the first name of the names in the tree in lexicographical order
	 */
	public String getFirstName()
	{
		//Base case - no left node
		if(getLeft() == null)
		{
			return this.name;
		}
		else
		{
			//Uses left node if not null to check next names
			return getLeft().getFirstName();
		}
	}
	
	/**
	 * Find the largest name in the tree
	 * @return the last name of the names in the tree in lexicographical order
	 */
	public String getLastName()
	{
		//Base case - no right node
		if(getRight() == null)
		{
			return this.name;
		}
		else
		{
			//Uses right node if not null to check next name
			return getRight().getLastName();
		}
	}

	/**
	 * Insert a new name into a tree
	 * 
	 * @param newName the name to be inserted
	 */
	public void insert(String newName)
	{
		// See
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)

		//Checks if newName is less that currentName
		if (newName.compareTo(name) < 0)
		{
			//Base Case
			//If leftNode is null, inserts new node and sets as left node
			if(getLeft() == null)
			{
				NameNode newLeft = new NameNode(newName);
				setLeft(newLeft);
			}
			//Recursive Case
			//If leftNode is not null, inserts new name with left node as compared node
			else
			{
				leftNode.insert(newName);
			}
		}
		//Checks if newName is greater than currentName
		else if (newName.compareTo(name) > 0)
		{
			//Base Case
			//If rightNode is null, inserts new node as sets as right node
			if(getRight() == null)
			{
				NameNode newRight = new NameNode(newName);
				setRight(newRight);
			}
			//Recursive Case
			//If rightNode is not null, inserts newName with right node as compared node
			else
			{
				rightNode.insert(newName);
			}
		}

	}

	/**
	 * @return the names in the tree in lexicographical order
	 */
	public String toString()
	{
		
		// TODO: in-order traverse tree recursively:
		// traverse and add left subtree, then add this, then traverse and add right subtree
		// Warning: Minds have been blown during the implementation of this method...
		String returnValue = "";
		
		//Visits left node
		if(getLeft() != null)
		{
			returnValue += getLeft().toString();
		}
		
		//Visits this node
		returnValue += this.name.toString();
		
		//Visits right node
		if(getRight() != null)
		{
			returnValue += getRight().toString();
		}
		
		return returnValue;
	}

}
