package com.resume;

import com.blade.Blade;
import com.blade.Bootstrap;
import com.blade.route.RouteHandler;
import com.blade.web.http.Request;
import com.blade.web.http.Response;

/**
 * Created by Administrator on 2016/4/19.
 */
public class App extends Bootstrap {

    @Override
    public void init(Blade blade) {

        blade.get("/", new RouteHandler() {
            public void handle(Request request, Response response) {
                request.attribute("name", "blade");
                System.out.println("hello,dididi");
                response.render("index.jsp");
            }
        });
    }

}
