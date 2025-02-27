package net.liceo.afb.magic_coleccioncartas;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Ficheros {
    public void RegistoNuevaCarta(Carta carta){
        String ruta = "Cartas.xml";

        try{
            File archivo = new File(ruta);

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc;
            if (archivo.exists()) {
                // Si el archivo existe, lo cargamos
                doc = db.parse(archivo);
                doc.getDocumentElement().normalize();
            } else {
                // Si no existe, creamos un nuevo documento
                doc = db.newDocument();
                Element raiz = doc.createElement("Cartas");
                doc.appendChild(raiz);
            }

            Element raiz = doc.getDocumentElement();

            Element Carta = doc.createElement("Carta");
            raiz.appendChild(Carta);


            Element nombreCarta = doc.createElement("Nombre");
            nombreCarta.setTextContent(carta.getNombre());
            Carta.appendChild(nombreCarta);

            Element colorCarta = doc.createElement("Color");
            colorCarta.setTextContent(carta.getColor());
            Carta.appendChild(colorCarta);

            Element manaCarta = doc.createElement("Mana");
            manaCarta.setTextContent(String.valueOf(carta.getMana()));
            Carta.appendChild(manaCarta);

            Element tipoCarta = doc.createElement("Tipo");
            tipoCarta.setTextContent(carta.getTipo());
            Carta.appendChild(tipoCarta);


            StreamResult sr =new StreamResult(new File(ruta));
            DOMSource dom =new DOMSource(doc);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.transform(dom, sr);
        } catch (ParserConfigurationException | TransformerException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
