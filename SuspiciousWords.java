public class SuspiciousWords {

    private String[] SuspiciousWords = new String[] {
        "black friday", "senha", "promoção", "promoção imperdivel",
        "Seu nome está negativo", "Seu cartão será cancelado", "comprar agora",
        "Seu serviço será bloqueado", "Seus dados estão desatualizados",
        "urgente", "confidencial", "Atualize seus dados bancários", "clique aqui para conferir",
        "loteria premiada", "sua conta foi bloqueada", "oferta imperdível", "password", "promocao"
    };

    //Getter
    public String[] getWordsList() {
        return SuspiciousWords;
    }

}
