package br.com.thaynara.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("usuário já existe");
    }
}
