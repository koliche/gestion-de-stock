package com.koliche.gestiondestock.exception;

public enum ErrorCode {
    ARTICLE_NOT_FOUND(1000),
    CATEGORY_NOT_FOUND(2000),
    CLIENT_NOT_FOUND(3000),
    COMMAND_CLIENT_NOT_FOUND(4000),
    FOURNISSEUR_NOT_FOUND(5000),
    COMMAND_FOURNISSEUR_NOT_FOUND(6000),
    ENTREPRISE_NOT_FOUND(7000),
    LIGNE_COMMAND_CLIENT_NOT_FOUND(8000),
    LIGNE_COMMAND_FOURNISSEUR_NOT_FOUND(9000),
    LIGNE_VENTE_NOT_FOUND(10000),
    MVT_STK_NOT_FOUND(11000),
    UTILISATEUR_NOT_FOUND(11000),
    VENTE_NOT_FOUND(11000),
    ;

    private int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
