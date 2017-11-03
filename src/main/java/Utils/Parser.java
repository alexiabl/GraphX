package Utils;

import Edge.Edge;
import Edge.Carretera;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by alexiaborchgrevink on 11/1/17.
 */
public class Parser {

    //https://stackoverflow.com/questions/10926353/how-to-read-json-file-into-java-with-simple-json-library

    private JsonParser parser;
    private org.apache.spark.graphx.Edge<Carretera> edge;

    public Parser() {
        this.parser = new JsonParser();
    }

    public void parseJson(String filepath) throws FileNotFoundException {
        Object obj = parser.parse(new FileReader(filepath));
        JSonOb

    }

}
