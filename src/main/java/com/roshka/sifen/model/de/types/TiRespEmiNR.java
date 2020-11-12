package com.roshka.sifen.model.de.types;

public enum TiRespEmiNR {
    EMISOR_FACTURA((short) 1, "Emisor de la factura"),
    POSEEDOR_FACTURA_Y_BIENES((short) 2, "Poseedor de la factura y bienes"),
    EMPRESA_TRANSPORTISTA((short) 3, "Empresa transportista"),
    DESPACHANTE_DE_ADUANAS((short) 4, "Despachante de Aduanas"),
    AGENTE_DE_TRANSPORTE_O_INTERMEDIARIO((short) 5, "Agente de transporte o intermediario");

    private short val;
    private String descripcion;

    TiRespEmiNR(short val, String descripcion) {
        this.val = val;
        this.descripcion = descripcion;
    }

    public short getVal() {
        return val;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
