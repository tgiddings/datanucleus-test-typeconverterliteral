package mydomain.model;

import javax.jdo.annotations.*;
import java.time.Year;

@PersistenceCapable(detachable="true")
public class Person
{
    @PrimaryKey
    Long id;

    String name;

    Year birthYear;

    public Person(long id, String name, Year birthYear)
    {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
    }

    public Year getBirthYear() {
        return birthYear;
    }

    public String getName()
    {
        return name;
    }

    public Long getId()
    {
        return id;
    }
}
