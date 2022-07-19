import java.util.Arrays;

public class SuspiciousWords {

    private String[] SuspiciousWords = new String[] {
        "black friday", "senha", "promoção", "promoção imperdivel", "Promoções",
        "Seu nome está negativo", "Seu cartão será cancelado", "comprar agora",
        "Seu serviço será bloqueado", "Seus dados estão desatualizados",
        "urgente", "confidencial", "Atualize seus dados bancarios", "clique aqui para conferir",
        "loteria premiada", "sua conta foi bloqueada", "oferta imperdivél", "password", "promoção"
    };
    
    public String MatchSuspiciousWords(String htmlContent)  {
    	return Arrays.stream(SuspiciousWords).anyMatch(htmlContent::contains) ?
    			"suspicious" : "safe";
    }

}
