public class Wiedzmin {
    private String name;
    private String klasa;
    private int sila;
    private int mana;
    private boolean nowy;
    private int moc;

    Wiedzmin(String name, String klasa, int sila, int mana, boolean nowy){
    this.name=name;
    this.klasa=klasa;
    this.sila=sila;
    this.mana=mana;
    this.nowy=nowy;
    this.moc=((sila+mana)/2);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getKlasa(){
        return klasa;
    }

    public void setKlasa(String klasa){
        this.klasa=klasa;
    }

    public int getSila(){
        return sila;
    }

    public void setSila(int sila){
        this.sila=sila;
    }

    public int getMana(){
        return mana;
    }

    public void setMana(int mana){
        this.mana=mana;
    }

    public boolean getNowy(){
        return nowy;
    }

    public void setNowy (boolean nowy){
        this.nowy=nowy;
    }

    public int getMoc(){
        return moc;
    }

    public void setMoc (int moc){
        this.moc=moc;
    }
}
