package br.com.magna.botanica.api.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.magna.botanica.api.model.Planta;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class PlantaDetalharTest {
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	void testDetalhar() {
		/*ResponseEntity<Planta> response = restTemplate.getForEntity("/plantas/detalhar/1", Planta.class);
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
		Assert.assertEquals("SAMAMBAIA", response.getBody().getNome());*/
		ResponseEntity<String> response = restTemplate.exchange("/plantas/detalhar/1", 
				HttpMethod.GET,null, String.class);
				Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
				Assert.assertEquals("{\"id\":1,\"nome\":\"SAMAMBAIA\",\"cor\":\"VERDE ESCURO\",\"filo\":\"GIMNOSPERMA\",\"classe\":\"CONIFERAS\",\"ordem\":\"SEM ORDEM\",\"raiz\":\"AXIAL\",\"caule\":\"LENHOSO\",\"folhagem\":\"ACICULAR\",\"folhas_verdadeiras\":true,\"caules_verdadeiros\":true,\"raizes_verdadeiras\":true,\"flores\":false,\"frutos\":false,\"sementes\":true,\"ativo\":true}",response.getBody());
				Assert.assertEquals(MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
	}

}
	

