package com.tradexl.inbox;

/**
 * Created by Raghav on 21-Sep-17.
 */
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<InboxModel>> getInbox();

}