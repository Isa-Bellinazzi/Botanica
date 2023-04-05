package br.com.magna.botanica.api.exception;

import java.util.List;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class TratadorDeErros {
	
	@ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity <String>tratarErro404() {
        return ResponseEntity.notFound().build();
	}
    
 
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<List<DadosErroValidacao>> tratarErro400(MethodArgumentNotValidException ex) {
		var erros = ex.getFieldErrors();
		var listaErros = erros.stream().map(DadosErroValidacao::new).toList();
		return ResponseEntity.badRequest().body(listaErros);
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<String> tratarErro500(DataIntegrityViolationException ex) {
			String mensagemErro = "Erro interno do servidor";
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagemErro);
		}

	public record DadosErroValidacao(String campo, String mensagem) {
		public DadosErroValidacao(FieldError erro) {
			this(erro.getField(), erro.getDefaultMessage());
		}
	}
}
