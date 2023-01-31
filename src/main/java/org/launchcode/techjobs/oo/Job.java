package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
//FIELDS
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: DONE: Add two CONSTRUCTOR - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode METHODS. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

   /*@Override  this is for the first test
    public String toString() {
        return "ID: " + this.getId()+ "\n" +
                "Name: "+ this.getName() +"\n" +
                "Employer: " + this.getEmployer().getValue() + "\n" +
                "Location: " + this.getLocation().getValue() + "\n" +
                "Position Type: " + this.getPositionType().getValue()+ "\n" +
                "Core Competency: " + this.getCoreCompetency().getValue();

    }*/



    @Override
    public String toString() {
        if (employer.getValue().isEmpty()) {
            getEmployer().setValue("Data not available");
        }
        if (location.getValue().isEmpty()) {
            getLocation().setValue("Data not available");
        }
        if (positionType.getValue().isEmpty()) {
            getLocation().setValue("Data not available");
        }
        if (coreCompetency.getValue().isEmpty()) {
            getCoreCompetency().setValue("Data not available");
        } if (name.isEmpty()) {
            setName("Data not available");
        }
        return "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency;
    }





    // TODO:  Add GETTERS for each field EXCEPT nextId. Add SETTERS for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }









}
