package com.example.cristian.petagram.notificaciones;

import com.example.cristian.petagram.notificaciones.model.UsuarioResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Nelson Abreu on 7/9/2016.
 */
public interface EndPointsNotificaciones {
    @FormUrlEncoded
    @POST(ConstanteRestAPINotificaciones.KEY_POST_ID_TOKEN)
    Call<UsuarioResponse> registrarUsuario(@Field("id_dispositivo") String id_dispositivo, @Field("id_usuario_instagram") String id_usuario_instagram);
}
