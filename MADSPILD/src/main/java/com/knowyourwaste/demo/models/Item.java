package com.knowyourwaste.demo.models;

public class Item
{
    private String name;
    private int wasteNumber;
    
    // constructor
    public Item(String name, int wasteNumber)
    {
        this.name = name;
        this.wasteNumber = wasteNumber;
    }
    
    // getters + setters
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getWasteNumber()
    {
        return wasteNumber;
    }
    public void setWasteNumber(int wasteNumber)
    {
        this.wasteNumber = wasteNumber;
    }
    
   
    
    
    
    
}
