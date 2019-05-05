//by Muhammad Alwan Andika
//1177050066

import static java.lang.System.*;

public class main
{
	public static void main(String[] args)
	{
		String name;
		String destination;
		String status;
		String organisation;
		String type;
		String launch;
		int duration;

		//(name, destination, status, organisation, type, launch, duration)
		Probe mio = new Probe ("Mio", "Mercury","JAXA (Japan)", "1");
		Stats mios = new Stats ("", "", "", "", "En Route", "June 8, 2018", 0);
		
		Probe venera = new Probe ("Venera 4", "Venus", "USSR (Soviet Union)", "2");
		Stats veneras = new Stats ("", "", "", "", "Success", "June 12, 1967", 127);
		
		Probe ME = new Probe ("Mars Expres", "Mars", "ESA (European Union)", "1");
		Stats MEs = new Stats ("", "", "", "", "Success", "December 25, 2003", 5560);
		
		Probe aditya = new Probe ("Aditya-L1", "Sun", "ISRO (India)", "1");
		Stats adityas = new Stats ("", "", "", "", "planned", "2021", 1825);
	
		out.println();
		out.println ("Name		: " + mio.getName());
		out.println ("Destination	: " + mio.getDestination());
		out.println ("Organisation	: " + mio.getOrganisation());
		out.print ("Type		: " );
		out.print (mio.getType());
		out.println ("Launch date	: " + mios.getLaunch());
		out.println ("Mission Duration: " + mios.getDuration() + " days");
		out.println ("Status		: " + mios.getStatus());
		out.println();
		
		out.println();
		out.println ("Name		: " + venera.getName());
		out.println ("Destination	: " + venera.getDestination());
		out.println ("Organisation	: " + venera.getOrganisation());
		out.print ("Type		: " );
		out.print (venera.getType());
		out.println ("Launch date	: " + veneras.getLaunch());
		out.println ("Mission Duration: " + veneras.getDuration() + " days");
		out.println ("Status		: " + veneras.getStatus());
		out.println();
		
		out.println();
		out.println ("Name		: " + ME.getName());
		out.println ("Destination	: " + ME.getDestination());
		out.println ("Organisation	: " + ME.getOrganisation());
		out.print ("Type		: " );
		out.print (ME.getType());
		out.println ("Launch date	: " + MEs.getLaunch());
		out.println ("Mission Duration: " + MEs.getDuration() + " days");
		out.println ("Status		: " + MEs.getStatus());
		out.println();
		
		out.println();
		out.println ("Name		: " + aditya.getName());
		out.println ("Destination	: " + aditya.getDestination());
		out.println ("Organisation	: " + aditya.getOrganisation());
		out.print ("Type		: " );
		out.print (aditya.getType());
		out.println ("Launch date	: " + adityas.getLaunch());
		out.println ("Mission Duration: " + adityas.getDuration() + " days (planned)");
		out.println ("Status		: " + adityas.getStatus());
		out.println();
  }
}

//by Muhammad Alwan Andika
//1177050066