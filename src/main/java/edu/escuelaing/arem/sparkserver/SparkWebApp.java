/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.sparkserver;

import static spark.Spark.port;
import static spark.Spark.get;

/**
 *
 * @author StivenVanegas
 */
public class SparkWebApp {
    public static void main(String[] args) {
        port(getPort());
        get("/index", (req, res) -> "Hello Docker");
    }
    
    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
	
	
}
