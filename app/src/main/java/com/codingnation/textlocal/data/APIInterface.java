package com.codingnation.textlocal.data;


import com.codingnation.textlocal.ui.contactlist.ContactListR;
import com.codingnation.textlocal.ui.sendotp.SendOtpR;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIInterface {


    Call<ContactListR> getContactList();

    @FormUrlEncoded
    @POST("send/")
    @Headers({"Accept: application/json"})
    Call<SendOtpR> getOTP(@FieldMap HashMap<String, String> data);

}
