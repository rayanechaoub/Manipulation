import fr.polytechnancy.Conversion;
import fr.polytechnancy.ConversionService;

public class ClientJ {

    public static void main(String[] args) {

        Conversion stub = new ConversionService().getConversionPort();
        System.out.println("La reponse du serveur est : "+stub.convertir(13));
    }
}
