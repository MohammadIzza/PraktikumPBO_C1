public class Manajer extends Pegawai {
    private static int tunjangan = 700000;

    public Manajer(String nama) {
        super.setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println(" Tunjangan: " + tunjangan);
    }
}
