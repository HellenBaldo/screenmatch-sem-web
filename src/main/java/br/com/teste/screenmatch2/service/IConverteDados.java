package br.com.teste.screenmatch2.service;

public interface IConverteDados {
    //o T representa um dados generico
    <T> T obterDados(String json, Class<T> classe);
}
