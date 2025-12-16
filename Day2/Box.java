class Box{
	 private int length;
	 private int width;
	 private int height;
	 Box(int length, int width, int height){
	 	this.length = length;
	 	this.width = width;
	 	this.height = height;
	}
	
	void volume(){
		System.out.println("Volume is: " + length*width*height);
	}
}
