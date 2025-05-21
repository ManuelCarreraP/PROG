package TercerTrimestre.Boletin11.Ej2;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) throws FormatoDataErroneo {
        setData(dia, mes, ano);
    }

    public void setData(int dia, int mes, int ano) throws FormatoDataErroneo {
        if (ano < 1970 || ano > 2999) {
            throw new FormatoDataErroneo("Ano fóra de rango: " + ano);
        }

        if (mes < 1 || mes > 12) {
            throw new FormatoDataErroneo("Mes non válido: " + mes);
        }

        int maxDias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> (isBisiesto(ano) ? 29 : 28);
            default -> throw new FormatoDataErroneo("Mes inválido.");
        };

        if (dia < 1 || dia > maxDias) {
            throw new FormatoDataErroneo("Día non válido: " + dia);
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean isBisiesto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }
}