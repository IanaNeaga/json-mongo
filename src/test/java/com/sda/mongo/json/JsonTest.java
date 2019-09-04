package com.sda.mongo.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class JsonTest {

    @Test
    public void a_testCreate(){
        JSONObject jsonObject=new JSONObject();

        System.out.println(jsonObject);
    }

    private JSONObject createJsonObject(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("nume","Alex");
        jsonObject.put("cnp",1910416295592L);
        jsonObject.put("varsta",30);
        jsonObject.put("sold",300.00);
        jsonObject.put("esteClient",true);
        jsonObject.put("taguri", Arrays.asList("tag1","tag2"));
        jsonObject.put("ceva",null);
        return jsonObject;
    }

    @Test
    public void b_testRead(){
        JSONObject jsonObject=createJsonObject();
        Object sold = jsonObject.get("sold");
        System.out.println(sold);
    }

    @Test
    public void c_testJacksonDatabind() throws IOException {
        Person person=new Person();

        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(System.out,person);
    }


    class Person{
        String nume="Dan";
        int varsta=21;
        boolean client=false;

        public String getNume() {
            return nume;
        }

        public int getVarsta() {
            return varsta;
        }

        public boolean isClient() {
            return client;
        }


    }

}
