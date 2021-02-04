package hello;

public class BookShelf extends Shelf implements Q {

	@Override
	public void enQ(String title) {
		shelf.add(title);
	}

	@Override
	public String deQ() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCnt();
	}
	
}
