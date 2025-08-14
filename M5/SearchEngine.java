package edu.sdmesa.cisc191;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

public class SearchEngine 
{

	//SearchEngine HAS-A Hashtable of strings and arraylist of strings
	private Hashtable<String, ArrayList<String>> searchEngine;
	
	//Constructor for search engine/hashtable
	public SearchEngine()
	{
		searchEngine = new Hashtable<String, ArrayList<String>>();
	}
	
	//Adds key and value to hashtable aka search and link
	public void add(String search, String link)
	{
		//Checks if key exists
		if(searchEngine.containsKey(search))
		{
			//If true, adds link to arraylist
			ArrayList<String> links = searchEngine.get(search);
			links.add(link);
		}
		//Creates new list if key doesnt exist
		else
		{
			//Creates new list
			ArrayList<String> history = new ArrayList<String>();
			//Adds link to list
			history.add(link);
			//Puts in key and value aka search and history
			searchEngine.put(search, history);
		}
		
		
	}

	//Returns the List based off key from hashtable aka search
	public List search(String search) 
	{
		if(!searchEngine.containsKey(search))
		{
			return new ArrayList<String>();
		}
		//Should be returning a copy so that
		//user cannot alter database
		return (List) searchEngine.get(search).clone();
		
	}
	
}
