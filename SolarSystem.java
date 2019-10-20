//Last time i did not used final variables,the name of the variables were not accurate,the structure of the code was a bit poor and the code layout was not the expected one
import java.util.ArrayList;
public class SolarSystem
{
    private String name;
    private double luminosity,minlum,maxlum;
    private int i;
    private Planet planet;
    private final String HABITABLE="yes";
    private final String NOT_HABITABLE="no";
    private final String NEWLINE="\n";
    private boolean habitableValue;
    ArrayList<Planet> system=new ArrayList<>();
    //this constructor creates a new object

    public SolarSystem(String name, double luminosity)
    {
        setName(name);
        setLuminosity(luminosity);
    }
    // this method adds a planet into an ArrayList
    public void addPlanet(String name, double mass, double distance)
    {
        planet=new Planet(name,mass,distance);
        system.add(planet);
    }
    //this method calculates the luminosity
    public void setLuminosity(double luminosityTest)
    {
        this.luminosity = luminosityTest;
        minlum=0.75*Math.sqrt(luminosity);
        maxlum=2.0*Math.sqrt(luminosity);
    }

    public void setName(String nameTest)
    {
        this.name=nameTest;
    }

    public String getName()
    {
        return name;
    }

    public double getLuminosity()
    {
        return luminosity;
    }
//this shows if the planet is habitable or not and then it prints a message
    public String toString()
    {
        String output="";
        output=output+getName()+NEWLINE;
        for(Planet planet:system)
        {
            output=output+planet.toPlanet();
            if(planet.getMass()>=0.6 && planet.getMass()<=7.0 && planet.getDistance()>=minlum && planet.getDistance()<=maxlum)
            {
                this.habitableValue=true;
            } else
            {
                this.habitableValue=false;
            }
            if(habitableValue==true)
            {
                output=output+HABITABLE+NEWLINE;
            } else
            {
                output=output+NOT_HABITABLE+NEWLINE;
            }
        }
        return(output);
    }
}


