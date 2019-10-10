package org.zhouhy.datastructure.array.object;

import java.util.ArrayList;
import java.util.List;

import org.zhouhy.datastructure.array.object.entity.User;

public class ObjectArray {
	private User[] users;
	private int currentIndex;
	
	public ObjectArray(int length){
		users = new User[length];
	}
	
	public void insert(User user){
		int index = 0;
		for(index=0;index<currentIndex;index++){			
			if(users[index].getUsername().compareTo(user.getUsername())>0){
				break;
			}			
		}
		currentIndex++;		
		for(int i =currentIndex-1;i>index;i--){
			users[i]=users[i-1];
		}
		
		users[index] = user;
		
	}
	
	public void remove(User user){
		int index = getIndex(0,user);
		while(index!=-1){
			if(index<currentIndex-1){
				for(int i=index;i<currentIndex-1;i++){
					users[i]=users[i+1];
				}
			}
			
			if(index<=currentIndex-1){
				currentIndex--;
			}
			
			index = getIndex(index,user);
		}
	}
	
	public List<User> searchData(User user){
		List<User> result = new ArrayList<>();
		int index = getIndex(0,user);
		while(index!=-1){
			result.add(users[index]);
			index = getIndex(index+1,user);
		}
		return result;
	}
	
	
	private int getIndex(int begin,User user){
		int index =-1;
		if(begin>=users.length){
			return index;
		}
		for(int i=begin;i<currentIndex;i++){
			if(users[i].getId()==user.getId()&&users[i].getUsername().equals(user.getUsername())&&users[i].getPassword().equals(user.getPassword())){
				index = i;
				break;
			}
		}
		return index;
	}
	
	
	public User[] getDatas() {
		return users;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}
}
