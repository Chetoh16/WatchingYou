package classes;

import java.util.ArrayList;
import java.util.List;

public class Watchlist {
	ArrayList<Media> wlist = new ArrayList<Media>();

	public int getID(){
		int id = wlist.size();
		return id;
		
	}


	public void addMedia(Media media){
		wlist.add(media);
	}
	
	public void removeMedia(){
		
	}
	
	public void printList(){
		for(int i = 0; i < wlist.size(); i++) {   
		    System.out.println(wlist.get(i));
		}  
	}
	

	
	public void sortByID(){
		
	}
	
	public void sortByDesire(){
		
	}
	

	
	

}
