package pe.isil;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main(String[] args) {
        // MongoClient client = MongoClients.create("mongodb://localhost:27017");

        // Crear un cliente de MongoDB
        MongoClient client = MongoClients.create("mongodb+srv://jmayta:isil2024@cluster0.hjtdhxb.mongodb.net/");

        // Acceder a la base de datos
        MongoDatabase database = client.getDatabase("demo");

        // Acceder a una colección
        MongoCollection<Document> collection = database.getCollection("movies");

        // Crear un documento
        Document document = new Document("title", "Interstellar").append("director", "Christopher Nolan");

        // Inser el documento en la colección
        collection.insertOne(document);
        
        // Cerrar la conexión
        client.close();

    }
}