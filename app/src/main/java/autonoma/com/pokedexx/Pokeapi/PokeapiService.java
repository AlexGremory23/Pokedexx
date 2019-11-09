package autonoma.com.pokedexx.Pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import autonoma.com.pokedexx.models.PokemonRespuesta;


public interface PokeapiService {
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();

}
