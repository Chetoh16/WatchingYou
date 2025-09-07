package classes;
public class App {

	public static void main(String[] args) {
		Watchlist wlist = new Watchlist();
		Media newMedia = new Media(wlist.getID(), "Inception" ,"Thriller", "Dream", 2.2, 1);
		wlist.addMedia(newMedia);
		Media newMedia2 = new Media(wlist.getID(), "Last of us" ,"Thriller", "Dream", 2.2, 1);
		wlist.addMedia(newMedia2);
		Media newMedia3 = new Media(wlist.getID(), "I am legend" ,"Thriller", "Dream", 2.2, 1);
		wlist.addMedia(newMedia3);		
		
		wlist.printList();

	}

}


