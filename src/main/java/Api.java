import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;



@Path("/v1")

public class Api {
    Gson json = new Gson();

    @GET
    @Path("node")
    @Produces("application/json")
    public String getNodes() {
        json = Gson.createObjectBuilder()
                .add("node", "all nodes").build();
        String result = json.toString();
        return result;
    }

    @GET
    @Path("node/{id}")
    @Produces("application/json")
    public String getNodeId(@PathParam("id") String id) {
        JsonObject json = Json.createObjectBuilder()
                .add("id", id).build();
        String result = json.toString();
        return result;
    }
}