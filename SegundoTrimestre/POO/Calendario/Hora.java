package SegundoTrimestre.POO.Calendario;

public class Hora {
    private FromatoHora formato;

    enum FromatoHora {DOCE, VINTECATRO}
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo, String formato) {
        setFormato(formato);
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    public void setFormato(String formato) {
        if (formato.toUpperCase().equals("DOCE") || formato.toUpperCase().equals("VINTECATRO")) {
            this.formato = FromatoHora.valueOf(formato.toUpperCase());
        } else {

        }

    }
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if (hora>= 0 && hora < 24) this.hora = hora;
        else this.hora = 0;
    }

    public void setMinuto(int minuto) {
        if (minuto>= 0 && minuto < 60) this.minuto = minuto;
        else this.minuto = 0;
    }

    public void setSegundo(int segundo) {
        if (segundo>= 0 && segundo < 60) this.segundo = segundo;
        else this.segundo = 0;
    }

    @Override
    public String toString() {
        if (formato == FromatoHora.VINTECATRO){
            return "La hora es → " + hora + ":" + minuto + ":" + segundo;
        }else {
            if (hora>11)  return "La hora es → " + hora + ":" + minuto + ":" + segundo + " AM";
            else return "La hora es → " + hora + ":" + minuto + ":" + segundo + " PM";
        }

    }



}
