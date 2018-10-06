package com.memebattle.megahack.auth.fragment.core.data;

import com.memebattle.megahack.auth.fragment.core.data.model.SignRequest;
import com.memebattle.megahack.auth.fragment.core.data.model.UserSignIn;
import com.memebattle.megahack.auth.fragment.core.data.model.UserSignUp;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface AuthApi {
    @POST("profile/")
    Observable<SignRequest> signIn(@Body UserSignIn userSignIn);

    @POST("profile/")
    Observable<SignRequest> signUp(@Body UserSignUp userSignUp);
}