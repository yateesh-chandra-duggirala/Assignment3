public class SmartPhone extends Phone implements Camera, MusicPlayer
{

public void click()
{

	System.out.println("This is Click Method of Smart Phone");

}

public void record()
{

	System.out.println("This is Record Method of Smart Phone");

}

public void play()
{

	System.out.println("This is Play method of the Smart Phone");

}

public void stop()
{

	System.out.println("This is Stop method of the Smart Phone");

}


public void call()
{
	
	System.out.println("This is Call method from Smart Phone");

}

public void sms()
{

	System.out.println("This is sms method from SMS Method.");

}


public static void main(String args[])
{

Phone p = new Phone();
p.call();
p.sms();

Phone sp = new SmartPhone();
sp.call();
sp.sms();

Camera c = new SmartPhone();
c.click();
c.record();

MusicPlayer mp = new SmartPhone();
mp.play();
mp.stop();

SmartPhone s = new SmartPhone();
s.call();
s.sms();

s.click();
s.record();

s.play();
s.stop();

}

}
