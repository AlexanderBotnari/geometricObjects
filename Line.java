package geometry;

public class Line {
	// properties
	  public int startX;
	  public int endX;
	  public int startY;
	  public int endY;
	  
	  
	// constructor
	  public Line(int startX,int startY,int endX,int endY) {
		 if(startY != endY || startX != endX) {
	    	this.startY = startY;
	        this.startX = startX;
	        this.endX   = endX;
	        this.endY   = endY;
	    }else {
	    	System.out.println("Erorr: This is not a line but a point !!!");
	    }
	    
	  }      
	  public  void printCoords() {
		System.out.println("The coords is : [" + startX + ":" + startY +"]----->[" + endX + ":" + endY + "]");
		    }
   
  public int length() {
	  int result = (int) (Math.sqrt((Math.pow(startX - endX , 2))+(Math.pow(startY - endY , 2))));
	return result;
	  
  }
  
}
