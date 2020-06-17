package com.example.calculadorasimples;

public class Modelo {
    private String ultimaOperacao;

    public Modelo()
    {
        ultimaOperacao="";
    }

    public String getUltimaOperacao()
    {
        return ultimaOperacao;
    }

    public double Somar(double op1, double op2)
    {
        double retorno;

        retorno = op1+op2;

        ultimaOperacao = String.valueOf(op1) + "+" +
                         String.valueOf(op2) + "=" +
                         String.valueOf(retorno);

        return retorno;
    }

    public double Subtrair(double op1, double op2)
    {
        double retorno;

        retorno = op1-op2;

        ultimaOperacao = String.valueOf(op1) + "-" +
                         String.valueOf(op2) + "=" +
                         String.valueOf(retorno);

        return retorno;
    }

    public double Multiplicar(double op1, double op2)
    {
        double retorno;

        retorno = op1*op2;

        ultimaOperacao = String.valueOf(op1) + "*" +
                         String.valueOf(op2) + "=" +
                         String.valueOf(retorno);

        return retorno;
    }

    public double Dividir(double op1, double op2)
    {
        double retorno=0;

        if(op2 != 0)
        {
            retorno = op1/op2;

            ultimaOperacao = String.valueOf(op1) + "/" +
                    String.valueOf(op2) + "=" +
                    String.valueOf(retorno);
        }

        return retorno;
    }

    public double Calcula(String operador, double op1, double op2)
    {
        double retorno;

        if (operador.equals("+"))
        {
            retorno = Somar(op1, op2);
        }
        else if (operador.equals("-"))
        {
            retorno = Subtrair(op1, op2);
        }
        else if (operador.equals("*"))
        {
            retorno = Multiplicar(op1, op2);
        }
        else if (operador.equals("/"))
        {
            retorno = Dividir(op1, op2);
        }
        else
        {
            retorno=0;
        }

        return retorno;
    }
}
