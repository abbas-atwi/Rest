package com.br.devdojo.projeto.path;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pessoa/")
public class Pessoa {
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response oi(){
        return Response.ok(new Gson().toJson("Meu deus , funcionou")).build();
    }

}
