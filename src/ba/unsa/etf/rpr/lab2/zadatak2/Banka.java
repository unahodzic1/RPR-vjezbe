package ba.unsa.etf.rpr.lab2.zadatak2;
import java.util.List;
import java.util.UUID;
import java.util.Random;
import java.util.ArrayList;

public class Banka {

    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    public Banka() {
        this.korisnici = new ArrayList<Korisnik>();
        this.uposlenici = new ArrayList<Uposlenik>();
    }

    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik noviKorisnik = new Korisnik(ime, prezime);
        this.korisnici.add(noviKorisnik);

        return noviKorisnik;
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik noviUposlenik = new Uposlenik(ime, prezime);
        this.uposlenici.add(noviUposlenik);

        return noviUposlenik;
    }

//    public static String randomBrojRacuna() {
//        return UUID.randomUUID().toString().replace("-", "");
//    }

    public Racun kreirajRacunZaKorisnika(Korisnik korisnik){
        Racun racun = null;

        for(int i = 0; i < this.korisnici.size(); i++){
            if(this.korisnici.get(i).equals(korisnik)){
                Random brRacuna = new Random();
                racun = new Racun(brRacuna.nextLong(), this.korisnici.get(i));
                break;
            }
        }

        return racun;

    }

}
