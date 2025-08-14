package edu.sdmesa.cisc191;

import java.util.Queue;

public class QueueConsumer
{

	//QueueConsumer HAS-A queue of strings
	private Queue<String> queue;

	//Constructor for QueueConsumer
	public QueueConsumer(Queue<String> queue)
	{
		this.queue = queue;
	}

	//Removes the nexts string in queue
	public String consume()
	{
		//Returns null if queue is empty
		if(queue.isEmpty())
		{
			return null;
		}
		//Removes first in
		return queue.remove();
	}

}
