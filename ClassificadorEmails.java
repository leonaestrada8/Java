// 2.3 Emails
package Final.J4V4.Emails23;

import java.util.ArrayList;
import java.util.HashMap;

class Email {
    String endereco;
    String dominio;

    public Email(String endereco, String dominio) {
        this.endereco = endereco;
        this.dominio = dominio;
    }
}

public class ClassificadorEmails {

    public static String categorizarEmail(Email email, HashMap<String, ArrayList<String>> regras) {
        if (regras.get("Spam").contains(email.dominio)) {
            return "Spam";
        }
        if (regras.get("Trabalho").contains(email.dominio)) {
            return "Trabalho";
        }
        return "Pessoal";
    }

    public static HashMap<String, ArrayList<String>> classificarEmails(ArrayList<Email> emails,
            HashMap<String, ArrayList<String>> regras) {
        HashMap<String, ArrayList<String>> categorias = new HashMap<>();
        categorias.put("Pessoal", new ArrayList<>());
        categorias.put("Trabalho", new ArrayList<>());
        categorias.put("Spam", new ArrayList<>());

        for (Email email : emails) {
            String categoria = categorizarEmail(email, regras);
            categorias.get(categoria).add(email.endereco);
        }

        return categorias;
    }

    public static void main(String[] args) {
        ArrayList<Email> emails = new ArrayList<>();
        emails.add(new Email("john@example.com", "example.com"));
        emails.add(new Email("sara@work.com", "work.com"));
        emails.add(new Email("spam@mail.net", "mail.net"));

        HashMap<String, ArrayList<String>> regras = new HashMap<>();
        regras.put("Spam", new ArrayList<>());
        regras.put("Trabalho", new ArrayList<>());
        regras.get("Spam").add("mail.net");
        regras.get("Trabalho").add("work.com");

        HashMap<String, ArrayList<String>> classificacao = classificarEmails(emails, regras);
        System.out.println(classificacao);
    }
}
