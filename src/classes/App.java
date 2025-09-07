package classes;
public class App {

	public static void main(String[] args) {
		Watchlist wlist = new Watchlist();
		Media newMedia = new Media("Inception" ,"Thriller", "Dream", 2.2, 1);
		wlist.addMedia(newMedia);
		Media newMedia2 = new Media("Last of us" ,"Thriller", "Dream", 2.2, 1);
		wlist.addMedia(newMedia2);
		Media newMedia3 = new Media("I am legend" ,"Thriller", "Dream", 2.2, 1);
		wlist.addMedia(newMedia3);		
		Media newMedia4 = new Media("12 Angry Men" ,"Thriller", "Dream", 2.2, 1);
		wlist.addMedia(newMedia4);		
	
		
		wlist.printList();

	}

}


