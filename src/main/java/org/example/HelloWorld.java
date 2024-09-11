package org.example;
import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] arg){
        get("/hello", (request, response) -> "Hello Wwwwwwwwwwwwwwwwwwwwwwwworld!");
    }
}