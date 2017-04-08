package br.com.heiderlopes.carango.api;

import java.util.List;

import br.com.heiderlopes.carango.model.Carro;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by logonpf on 08/04/2017.
 */

public interface CarroAPI {

    @GET("/carros/tipo/{tipo}.json")
    Call<List<Carro>> buscarCarros(
            @Path("tipo") String tipo);

}
