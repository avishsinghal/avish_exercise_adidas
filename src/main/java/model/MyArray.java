package model;

import java.util.HashMap;
import java.util.List;

public class MyArray{
    public int id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tag> tags;
    public String status;
    
    
    public String getStatus(){
		return status;
	}
}
