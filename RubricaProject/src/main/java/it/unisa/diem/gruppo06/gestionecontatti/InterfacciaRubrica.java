package it.unisa.diem.gruppo06.gestionecontatti;

import java.util.List;

public interface InterfacciaRubrica {

    public void creaContatto(Contatto c);

    public void modificaContatto(Contatto c);

    public void eliminaContatto(Contatto c);

    public Contatto cercaContatto(Contatto c);

    public List<Contatto> getLista();
}
