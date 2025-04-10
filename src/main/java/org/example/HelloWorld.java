//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import spark.Spark;

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] arg) {
        Spark.get("/hello", (request, response) -> {
            return "Hello 555555555555  wwworld!" +
                    "Hello 4444444444444444 " +
                    "666666" +
                    "777777777 tag 8" +
                    " wwworld!";
        });
    }
}
