package com.datastructure;

public class HashTable {
	
	class HashEntry{
		private String key;
		private String value;
		private HashEntry next;
		HashEntry(String key, String value)
		{
			this.key=key;
			this.value=value;
		}
	}

	private int INITIAL_SIZE=16;
	private HashEntry[] data;
	
	public HashTable()
	{
		data= new HashEntry[INITIAL_SIZE];
	}
	
	public void put(String key, String value)
	{
		int index = getIndex(key);
		
		HashEntry newEntry = new HashEntry(key, value);
		
		if(data[index]==null)
			data[index]= newEntry;
		else
		{
			HashEntry entries ;
			for(entries= data[index];entries.next!=null;entries=entries.next);
			entries.next=newEntry;
		}
	}
	
	public String get(String key)
	{
		int index = getIndex(key);
		if(data[index]==null)
			return null;
		HashEntry entries = data[index];
		while(entries!=null)
		{
			if(entries.key.equals(key))
				return entries.value;
			entries=entries.next;
		}
		return null;
	}
	
	private int getIndex(String key)
	{
		int hashcode = key.hashCode();
		System.out.println("String hashcode:"+hashcode);
		int index = (hashcode & 0x7ffffff)%INITIAL_SIZE;
		System.out.println("Index: "+index);
		if(key.equals("John Simth")||key.equals("Sandra Dee")||key.equals("Sneha Y"))
			index=4;
		return index;
	}
}
