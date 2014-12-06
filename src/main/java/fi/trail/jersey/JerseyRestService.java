package fi.trail.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class JerseyRestService {

    @GET
    @Path("/{name}/{lastname}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student newStudent( @PathParam("name") String fname, @PathParam("lastname") String lname ) {
        Student st = new Student(1, fname, lname);

        return st;
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Student[] studentList() {
        Student[] students = new Student[] {
            new Student(1, "Ossi", "Opiskelija"),
            new Student(2, "Kalervo", "Koulunkävijä")
        };

        return students;
    }

}
