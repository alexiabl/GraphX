import Edge.Carretera;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import Vertex.Canton.Canton;
import Vertex.Distrito.Distrito;

import org.apache.spark.graphx.EdgeRDD;
import org.apache.spark.graphx.impl.EdgeRDDImpl;
import org.apache.spark.graphx.impl.GraphImpl;
import org.apache.spark.graphx.impl.VertexRDDImpl;
import org.apache.spark.rdd.RDD;
import scala.collection.Seq;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by alexiaborchgrevink on 11/1/17.
 */
public class Test {

    public static void main (String[] args){
        SparkConf conf = new SparkConf().setAppName("CR-Stats");
        JavaSparkContext context = new JavaSparkContext(conf);
        Canton canton = new Canton(1, "San Jose", "Montes de Oca");
        List<Canton> listCanton = new LinkedList<Canton>();
        listCanton.add(canton);
        Distrito distrito = new Distrito(5, "San Jose", "Montes de Oca", "San Pedro");
        Carretera ruta = new Carretera(2, "Montes de Oca", "San Pedro", 67521231);
        List<Carretera> listRutas = new LinkedList<Carretera>();
        listRutas.add(ruta);

        //EdgeRDD<Carretera> rutaRDD = new EdgeRDDImpl<Carretera,Canton>(context, ruta);

        //JavaRDD<Canton> cantonRDD = context.parallelize(listCanton);

        //VertexRDDImpl<Canton> cantonRDD = new VertexRDDImpl<Canton>(context,listCanton.get(1));

        List<Distrito> listDistrito = new LinkedList<Distrito>();
        listDistrito.add(distrito);

        JavaRDD<Distrito> distritoRDD = context.parallelize(listDistrito);

        //GraphImpl<


    }
}
