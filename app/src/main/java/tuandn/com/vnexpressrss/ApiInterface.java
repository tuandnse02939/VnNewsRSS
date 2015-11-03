package tuandn.com.vnexpressrss;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Anh Trung on 10/29/2015.
 */
public interface ApiInterface{
    @GET("/rss/tin-moi-nhat.rss")
    Call<Rss> getRss();
}