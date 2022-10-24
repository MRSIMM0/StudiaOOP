


class CD {
  private int usedSpace;
  private String title;
  private String contentType;
  //Default constructor
public CD(){}
public CD(int usedSpace, String title, String contentType){
	  this.usedSpace = usedSpace;
	  this.title = title;
	  this.contentType = contentType;
  }

public CD(String title, String contentType){
	this.title = title;
	this.contentType = contentType;
}

public CD(String title){
	this.title = title;
}



	public static void main(String[] args){
	
		CD cd = new CD(200,"FILMY","MP4");
		CD cd2 = new CD("Tytul" , "AVI");
		CD cd3 = new CD("Nic");
		CD blank = new CD();
	}
}


