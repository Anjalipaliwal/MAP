package com.firebaseuser.map;
import com.firebaseuser.map.Map2.Bounds;
import com.firebaseuser.map.Map2.GeocodedWaypoint;
import com.firebaseuser.map.Map2.Leg;
import com.firebaseuser.map.Map2.Pojo;
import com.firebaseuser.map.Map2.Route;
import com.firebaseuser.map.Map2.Step;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;


public interface RetrofitMaps {
    @GET("api/directions/json?key=AIzaSyDVNEQE7ZYNQPw0ORJ55qsWi00A4S58ag8")
    Call<Pojo> getDistanceDuration(@Query("units") String units, @Query("origin") String origin, @Query("destination") String destination, @Query("mode") String mode);
}
