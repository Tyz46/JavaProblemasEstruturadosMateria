public class Data {

    private int dia;
    private int mes;
    private int ano;

    private String formato;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);

        formato = "dd/mm/aaaa";
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
    }

    public void definirFormato(String formato) {
        this.formato = formato;
    }

    public void imprimir() {

        String resultado = formato;

        if (resultado.contains("dddd")) {
            resultado = resultado.replace("dddd", String.format("%04d", dia));
        } else if (resultado.contains("dd")) {
            resultado = resultado.replace("dd", String.format("%02d", dia));
        } else if (resultado.contains("d")) {
            resultado = resultado.replace("d", String.valueOf(dia));
        }

        if (resultado.contains("mm")) {
            resultado = resultado.replace("mm", String.format("%02d", mes));
        } else if (resultado.contains("m")) {
            resultado = resultado.replace("m", String.valueOf(mes));
        }

        if (resultado.contains("aaaa")) {
            resultado = resultado.replace("aaaa", String.format("%04d", ano));
        } else if (resultado.contains("aa")) {
            resultado = resultado.replace("aa", String.format("%02d", ano % 100));
        } else if (resultado.contains("aaa")) {
            resultado = resultado.replace("aaa", String.format("%03d", ano % 1000));
        }

        System.out.println(resultado);
    }
}