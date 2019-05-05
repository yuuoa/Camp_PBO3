//by Muhammad Alwan Andika
//1177050066

import static java.lang.System.*;

public class Stats extends Probe
{
	private String status;
	private String launch;
	private int duration;
	
	public Stats (String name, String destination, String organisation, String type, String status, String launch, int duration)
	{
		super(name, destination, organisation, type);
		this.status = status;
		this.launch = launch;
		this.duration = duration;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String getLaunch()
	{
		return launch;
	}
	
	public int getDuration()
	{
		return duration;
	}
	
	public int getDuration(int year, int conv)
	{
		year = 365;
		conv = duration/year;
		duration = conv;
		return duration;
	}
	
	public String getType()
	{
		switch (type)
		{
			case "1":
			{out.println("Orbiter"); break;}
			case "2":
			{out.println("Atmospheric"); break;}
		}
/*		if (type == "1")
			out.println("Orbiter");
		else if (type == "2")
			out.println("Atmospheric");
		else
			out.println("NULL");*/
		return type;
	}

}

//by Muhammad Alwan Andika
//1177050066