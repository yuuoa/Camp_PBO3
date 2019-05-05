//by Muhammad Alwan Andika
//1177050066

import static java.lang.System.*;

public class Probe
{
	private String name;
	private String destination;
	private String organisation;
	public String type;
		
	public Probe (String name, String destination, String organisation, String type)
	{
		this.name = name;
		this.destination = destination;
		this.organisation = organisation;
		this.type = type;
	}

	public String getName()
	{
		return name;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	public String getOrganisation()
	{
		return organisation;
	}
	
	public String getOrganisation(String country)
	{
		if (organisation == "JAXA")
		{
			country = "Japan";
		}
		else if (organisation == "ESA")
		{
			country = "European Union";
		}
		else if (organisation == "USSR")
		{
			country = "Soviet Union";
		}
		else if (organisation == "ISRO")
		{
			country = "India";
		}
		return country;
	}
	
	public String getType()
	{
		if (type == "1")
		out.println("Orbiter");
		return type;
	}

}

//by Muhammad Alwan Andika
//1177050066