package org.codeandmagic.promise.volley;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import org.codeandmagic.promise.Promise;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by evelina on 03/03/2014.
 */
public class VolleyRequest<R, T> {

    public static class RObject extends VolleyRequest<JsonObjectRequest, JSONObject> {

        public RObject(JsonObjectRequest request, Promise<JSONObject> promise) {
            super(request, promise);
        }
    }

    public static class RArray extends VolleyRequest<JsonArrayRequest, JSONArray> {

        public RArray(JsonArrayRequest request, Promise<JSONArray> promise) {
            super(request, promise);
        }
    }

    public static class ImgObject extends VolleyRequest<ImageRequest, Bitmap> {

        public ImgObject(ImageRequest request, Promise<Bitmap> promise) {
            super(request, promise);
        }
    }

    private final R mRequest;
    private final Promise<T> mPromise;

    public VolleyRequest(R request, Promise<T> promise) {
        this.mRequest = request;
        this.mPromise = promise;
    }

    public R getRequest() {
        return mRequest;
    }

    public Promise<T> getPromise() {
        return mPromise;
    }
}
