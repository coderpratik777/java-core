package com.pratiti.training.selflearn;

import java.util.*;

//This program demonstrates the comparator function on map
class Person{
    String name;
    int rank;
    
    Person(String name,int rank){
        this.name=name;
        this.rank=rank;
    }
    
    public String toString (){
        return "Person name is "+this.name+" rank is "+this.rank;
    }
}


class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Map<Integer,String> map=new HashMap<Integer,String>();
        
        map.put(1,"pratik");
        map.put(2,"sarthak");
        map.put(3,"amit");
        
        for(Map.Entry<Integer,String> x:map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
        
        Map<Integer,Person> mp=new HashMap<Integer,Person>();
        
        mp.put(1,new Person("Sarthak",2));
        mp.put(2,new Person("Amit",3));
        mp.put(3,new Person("Abhishek",3));
        
        System.out.println("map is working");
        for(Map.Entry<Integer,Person> p:mp.entrySet()){
            System.out.println(p.getKey());
            Person pe=p.getValue();
            System.out.println(pe);
        }
        
        List<Map.Entry<Integer,Person>> list=new ArrayList<>(mp.entrySet());
        System.out.println("Printing the list");
          for(Map.Entry<Integer,Person> p:list){
            System.out.println(p.getKey());
            Person pe=p.getValue();
            System.out.println(pe);
        }
        
        Comparator<Map.Entry<Integer,Person>> com=new Comparator<Map.Entry<Integer,Person>>(){
            
            public int compare(Map.Entry<Integer,Person> p1,Map.Entry<Integer,Person> p2){
                Person pp1=p1.getValue();
                Person pp2=p2.getValue();
                if(pp1.rank<pp2.rank){
                    return -1;
                }
                else if(pp1.rank>pp2.rank){
                    return 1;
                }
                else{
                    return pp1.name.compareTo(pp2.name);
                }
            }
        };
        
        Collections.sort(list,com);
          for(Map.Entry<Integer,Person> p:list){
            System.out.println(p.getKey());
            Person pe=p.getValue();
            System.out.println(pe);
        }
        
        // System.out.println("")
        // Person p1=new Person("Pratik",1);
        // System.out.println(p1);
    }
}