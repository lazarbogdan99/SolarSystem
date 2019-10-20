import java.text.DecimalFormat;

public class Planet
{
    private String name;
    private double mass;
    private double distance;
    private double orbitalPeriod;
    //this method truns ',' into '.' and also round the number so it does not have more than 3 deciamals

    DecimalFormat dc=new DecimalFormat("0.0##");
//this constructor create a new object

    public Planet(String name, double mass, double distance)
    {
        setNamePlanet(name);
        setMass(mass);
        setDistance(distance);
        setOrbitalTime();
    }

    public Planet() {
    }

    public void setNamePlanet(String name) {
        this.name = name;
    }

    public String getNamePlanet() {
        return name;
    }


    public void setMass(double mass)
    {
        this.mass=mass;
    }

    public double getMass() {
        return mass;
    }
    //this method calculates the orbit

    public void setDistance(double distance)
    {
        this.distance=distance;
    }

    public double getDistance()
    {
        return distance;
    }


    public void setOrbitalTime() {
        this.orbitalPeriod = Math.sqrt(distance*distance*distance);
    }

    public double getOrbitalTime()
    {
        return orbitalPeriod;
    }
//this method return the message
    public String toPlanet() {
        return("Planet "+getNamePlanet()+" has a mass of "+dc.format(getMass()).replace(",",".")+
                " Earths, is "+dc.format(getDistance()).replace(",",".")+"AU from its star, and orbits in "+
                dc.format(getOrbitalTime()).replace(",",".")+" years: could be habitable? ");
    }
}
