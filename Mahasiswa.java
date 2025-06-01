public class Mahasiswa {
    String Nama;
    String Nim;
    String Hobby;

    public void sayHay (String Hay){
        System.out.println(Hay + "Saya adalah Mahasiswa. " + "Nama saya " + this.Nama + "Nim saya" + this.Nim + "Hoby saya " + this.Hobby + "\n");
    }

//Construktor
    public Mahasiswa(String Nama, String Nim, String Hobby){
        this.Nama = InputNama;
        this.Nim = InputNim;
        this.Hobby = Hobby;
    }
}