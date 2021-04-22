package edu.pingpong.mollap;

import edu.pingpong.mollap.client.Mollapp;
import edu.pingpong.mollap.filter.Autenticate;
import edu.pingpong.mollap.filter.Autorize;
import edu.pingpong.mollap.manager.FilterManager;
import edu.pingpong.mollap.target.Vehicle;

public class App {

    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.

        FilterManager filterManager = new FilterManager(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.

        filterManager.setTasca(new Autenticate());
        filterManager.setTasca(new Autorize());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.

        Mollapp mollapp = new Mollapp();
        mollapp.setManager(programadorTasques);
        mollapp.sendRequest("Francesc"); */
    }
}

