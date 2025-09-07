package classes;

import java.util.ArrayList;
import java.util.List;

public class Watchlist {
	ArrayList<Media> wlist = new ArrayList<Media>();

	public void addMedia(Media media){
		int assignedID = wlist.size();
		media.setID(assignedID);		
		wlist.add(media);
	}
	
	public void removeMedia(int index){
		wlist.remove(index);
		this.reorganiseID(index);
		
	}
	
	public void printList(){
		for(int i = 0; i < wlist.size(); i++) {   
		    System.out.println(wlist.get(i));
		}  
	}
	

	public void reorganiseID(int index){
		for(int i = index; i < wlist.size(); i++) {
			Media media = wlist.get(i);
			media.setID(i);
		}
	}

	public void sortByID(){
		
	}
	
	public void sortByDesire(){
		
	}
	

	
	

}
