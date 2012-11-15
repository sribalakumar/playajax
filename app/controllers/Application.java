package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import com.google.gson.JsonObject;

import models.*;

public class Application extends Controller {
public static String finame,siname;
    public static void index() {
        render();
    }
    
    public static void ajax1(String fname,String sname){
    	
    	//System.out.println(fname+" "+sname);
    	finame=fname;
    	siname=sname;
    }
    
    public static void rjson(){
    	//System.out.println("inside Application.rjson()");
    	JsonObject json = new JsonObject();
        json.addProperty("fname", finame);
        json.addProperty("sname", siname);
        renderJSON(json.toString());
    	
    	
}
    
}