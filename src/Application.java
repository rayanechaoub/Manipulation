import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.time.Clock;

public class Application {

    public static void main(String[] args) throws JAXBException {
        //permet de determiner quel objet on va serialiser
        JAXBContext jc = JAXBContext.newInstance(Personne.class);
        Personne p1 = new Personne("Rayane","CHAOUB",new Date(12,9,2000));

        //cree le fichier xml
        Marshaller m = jc.createMarshaller();
        //indentation
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        m.marshal(p1,new File("resultat.xml"));


        System.out.println("************* LISTE DE PERSONNES ******");

        JAXBContext jc1 = JAXBContext.newInstance(Personnes.class);
        Personnes ps = new Personnes();
        ps.getPersonnes().add(new Personne("Mael","Cipriani",new Date(1,1,1932)));
        ps.getPersonnes().add(new Personne("A","B",new Date(1,1,1933)));
        ps.getPersonnes().add(new Personne("C","D",new Date(1,1,1934)));
        ps.getPersonnes().add(new Personne("E","F",new Date(1,1,1935)));
        ps.getPersonnes().add(new Personne("G","H",new Date(1,1,1936)));
        ps.getPersonnes().add(new Personne("I","J",new Date(1,1,1937)));

        Marshaller ms = jc1.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        ms.marshal(ps,new File("personnes.xml"));


    }
}
