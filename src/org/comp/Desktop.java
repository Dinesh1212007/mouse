package org.comp;

public class Desktop extends Computer{

private void desktopsize() {
	System.out.println("my desktop size is 19inch");
}

public static void main(String[] args) {
	Desktop d=new Desktop();
	d.desktopsize();
	d.computerModel();
}
	
}
