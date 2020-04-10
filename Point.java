class Point {
	private String id;
	private double x,y;

	//TODO add new variable
    private String boja;
	//TODO constructor
    public Point(String id, String boja, double x, double y){
	this.id = id;
    this.boja = boja;	
    this.x = x;	
    this.y = y;		
	}
	//TODO setters and getters
 
 // Getter
  public String getid() {
    return id;
  }

  // Setter
  public void setid(String newid) {
    this.id = newid;
  }

 // Getter
  public String getboja() {
    return boja;
  }

  // Setter
  public void setboja(String newboja) {
    this.boja = newboja;
  }

   // Getter
  public double getx() {
    return x;
  }

  // Setter
  public void setx(double newx) {
    this.x = newx;
  }
  
     // Getter
  public double gety() {
    return y;
  }

  // Setter
  public void sety(double newy) {
    this.y = newy;
  }
  // xDirection i yDirection mozhe da se: L, R, U, D
	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection=='L') --x;
			if(xDirection=='R') ++x;
				if(yDirection=='U') ++y;
				if(yDirection=='D') --y;	
	}

	public void draw () {
		//TODO
		System.out.println(id+'(' + x + ',' + y + ')');
	}
}