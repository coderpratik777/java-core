package com.pratiti.training.selflearn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
class Player {
    private int ranking;
    private String name;
    private int age;
    
    public Player(int rank,String name,int age)
    {
    	this.ranking=rank;
    	this.name=name;
    	this.age=age;
    }
    public int getId()
    {
    	return this.ranking;
    }
    public String getname()
    {
    	return this.name;
    }
    // constructor, getters, setters  
}
class CompareRankName implements Comparator<Player>{
	
	public int compare(Player player1,Player player2)
	{
		int order=Integer.compare(player1.getId(), player2.getId());
		if(order<0)
			return -1;
		if(order>0)
			return 1;
		if(order==0)
		{
			order=player1.getname().compareTo(player2.getname());
			return order;
		}
		return 0;
	}
	
}

public class CollectionHomwework {
	public static void main(String[] args) {
		
		List<Player> players=new ArrayList<>();
		
		players.add(new Player(90,"John",22));
		players.add(new Player(90,"Ravi",22));
		players.add(new Player(60,"Kitty",23));
		players.add(new Player(5,"Steven",22));
		
		CompareRankName n=new CompareRankName();
		
		Collections.sort(players,n);
		System.out.println("-----Comparing sport players by Rank and Name------");
		for(Player p:players)
		{
			System.out.println(p.getId()+"   "+p.getname());
		}
		
		
		///comparing players by only id by using anonymous class
		Comparator<Player> compareById = new Comparator<Player>() {
			@Override
			public int compare(Player player1, Player player2) {
				return Integer.compare(player1.getId(), player2.getId());
			}
		};
		
		Collections.sort(players, compareById);
		System.out.println("-----Comparing sport players by only Rank------");
		for(Player p:players)
		{
			System.out.println(p.getId()+"   "+p.getname());
		}
		
		
		
		
		////Map functionalities
		Map<String,Integer> map=new HashMap<>();
		
		map.put("Pratik",23);
		map.put("Sarthak", 34);
		map.put("Rohit",34);
		
		//using treeMap to sort beacause when we put the elements in the treemap by default it uses Redblack tree for Storing
		TreeMap<String,Integer> sorted=new TreeMap<>();
		
		sorted.putAll(map);
		System.out.println("-----Map sort------");
		for(Map.Entry<String, Integer> it:sorted.entrySet())
		{
			System.out.println(it.getKey()+"=="+it.getValue());
		}
		
		Set set=map.entrySet();
		System.out.println(set);
		
		map.put("PP", null);
		System.out.println(set);
		
		
		Map<Integer,String> emp=new HashMap<>();
		
		emp.put(1, "Pratik");
		emp.put(6, "Patik");
		emp.put(3, "raatik");
		emp.put(4, "rutvik");
		
		List<Map.Entry<Integer, String>> sorted1=new ArrayList<>(emp.entrySet());
		
		Comparator<Map.Entry<Integer, String>> comp=new Comparator<Map.Entry<Integer, String>>(){
			
			public int compare(Map.Entry<Integer, String> o1,Map.Entry<Integer, String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
			    
		};
		
		System.out.println("-----Map sort using List---");
		Collections.sort(sorted1,comp);
		for(Map.Entry<Integer, String> it: sorted1)
		{
			System.out.println(it.getKey()+"     "+it.getValue());
		}
		
		
		Set<Map.Entry<Integer, String>> s=emp.entrySet();
		
		for(Map.Entry<Integer, String> it:s)
		{
			System.out.println(it.getKey()+"=="+it.getValue());
		}
		
		
		//sort according to name if same sort keys
		
		
		
		
	}

	

}
