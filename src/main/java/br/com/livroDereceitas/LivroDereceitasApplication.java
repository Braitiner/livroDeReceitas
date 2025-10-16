package br.com.livroDereceitas;

import br.com.livroDereceitas.model.Receita;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LivroDereceitasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LivroDereceitasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<String> ingredientes = List.of("Ovos", "Sal", "Pimenta do reino", "Manteiga (opcional)");

		var passos = """
				Quebre os ovos em um prato e bata com um garfo ate ficar omogeneo a clara com a gema,
    
				adicione um pitada de sal e pimenta. Leve para a frigideira aquecida e untada com a manteiga,
    
				espera ate o ovo ficar cozido na parte superior,
    
				dobre a omelte ao meio e deixa mais 1 minuto de cada lado.
				""";

		var receita = new Receita("Omelte", ingredientes, passos);

		System.out.println(receita);


	}
}
