package com.vedruna.gonzalezalamom03.interfaces;

import com.vedruna.gonzalezalamom03.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDInterface {


    @GET("api/products")
    Call<List<Product>> getAll();
}
