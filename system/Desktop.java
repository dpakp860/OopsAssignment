package org.system;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("desktop size is 30 inches");
	}
public static void main(String[] args) {
	Desktop system = new Desktop();
	system.desktopSize();
	system.computerModel();
}
}
