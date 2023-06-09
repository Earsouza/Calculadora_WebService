/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package engtelecom.recursos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Eduardo
 */
@WebService(serviceName = "OlaMundo")
@Path("olamundo")
public class OlaMundo {

    @Context
    private UriInfo context;

    public OlaMundo() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String olaTexto() {
        return "Ola Mundo";
    }

    @GET
    @Produces("application/xml")
    public String olaXML() {
        return "<?xml version=\"1.0\"?>" + "<mensagem>Ola Mundo" + "</mensagem>";
    }

    @GET
    @Produces("application/json")
    public String olaJSON() {
        return "{ \"mensagem\": \"Ola Mundo\" }";

    }

    @Path("/{nome}")
    @GET
    @Produces("application/xml")
    public String olaOutroXML(@PathParam("nome") String n) {
        return "<?xml version=\"1.0\"?>" + "<mensagem>" + n + "</mensagem>";
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/xml")
    public String recebeParametroViaFORM(@FormParam("nome") String nome) {
        return "<?xml version=\"1.0\"?>" + "<mensagem>" + nome + "</mensagem>";
    }
}
