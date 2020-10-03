

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class VisorMazo {

    public static void mostrarMazo(String jsonFile) {
        //URL url = getClass().getResource(jsonFile);
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
                String nombreCarta = carta.getString("nombre");
                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                String atributosStr = "";
                for (String nombreAtributo:atributos.keySet())
                    atributosStr = atributosStr + nombreAtributo + ": " +
                            atributos.getInt(nombreAtributo) + "; ";
                System.out.println(nombreCarta+"\t\t\t"+atributosStr);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
	public static MazoCartas obtenerMazo(String jsonFile) {
        //URL url = getClass().getResource(jsonFile);
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartasJson = (JsonArray) reader.readObject().getJsonArray("cartas");
            ArrayList<Carta> cartas = new ArrayList<Carta>();
            for (JsonObject cartaJson : cartasJson.getValuesAs(JsonObject.class)) {
            	JsonObject atributos = (JsonObject) cartaJson.getJsonObject("atributos");
            	HashMap<String,Long> atributosMap = new HashMap<String,Long>();
            	for (String nombreAtributo:atributos.keySet()) {
            		atributosMap.put(nombreAtributo,Long.parseLong( atributos.get(nombreAtributo).toString()));
            		
            	}
                cartas.add(new Carta(cartaJson.getString("nombre"),atributosMap));

             }
            MazoCartas mazo = new MazoCartas(cartas);
            reader.close();
            return mazo;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
/*
    public static void main(String[] args) {
        String mazoPath = "./superheroes.json";
        VisorMazo.mostrarMazo(mazoPath);
    }*/
}
