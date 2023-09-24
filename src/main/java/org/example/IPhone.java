package org.example;

    public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
        Contato[] contatos;
        Musica[] musicas;

        public boolean redeMovelDisponivel() {
            System.out.println("Método 'redeMovelDisponivel' chamado.");
            return true;
        }

        public void ligar() {
            System.out.println("Método 'ligar' chamado.");
        }

        public void atender() {
            System.out.println("Método 'atender' chamado.");
        }

        public void iniciarCorreioVoz() {
            System.out.println("Método 'iniciarCorreioVoz' chamado.");
        }

        public boolean conexaoComInternet() {
            System.out.println("Método 'conexaoComInternet' chamado.");
            return true;
        }

        public void exibirPagina() {
            System.out.println("Método 'exibirPagina' chamado.");
        }

        public void adicionarNovaAba() {
            System.out.println("Método 'adicionarNovaAba' chamado.");
        }

        public void atualizarPagina() {
            System.out.println("Método 'atualizarPagina' chamado.");
        }

        public void tocar() {
            System.out.println("Método 'tocar' chamado.");
        }

        public void pausar() {
            System.out.println("Método 'pausar' chamado.");
        }

        public void selecionarMusica() {
            System.out.println("Método 'selecionarMusica' chamado.");
        }
    }


