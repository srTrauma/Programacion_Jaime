package todolist;

class contacto {
    private String descripcion;

    private Integer telInteger;

    private String telIntegerStr;
    private String gmailString;

    public contacto(String descripcion, Integer tIntegerSc, String gmailStringSc) {
        this.descripcion = descripcion;
        this.telInteger = tIntegerSc;
        this.gmailString = gmailStringSc;
    }

    public contacto(String descripcion, String tIntegerSc, String gmailStringSc) {
        this.descripcion = descripcion;
        this.telIntegerStr = tIntegerSc;
        this.gmailString = gmailStringSc;
    }

    public String getTelIntegerStr() {
        return telIntegerStr;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getTelInteger() {
        return telInteger;
    }

    public String getGmailString() {
        return gmailString;
    }
}