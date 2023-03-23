package org.computer;

public class Desktop {
public void desktopSize () {
	System.out.println("desktop");
}
public static void main(String [] args) {
	Desktop a=new Desktop ();
	a.desktopSize();
	Computer b =new Computer ();
	b.computerModel ();
}
}
