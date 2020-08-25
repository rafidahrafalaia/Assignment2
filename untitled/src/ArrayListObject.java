import java.util.*;
public class ArrayListObject {
    public static void main(String[] args){

        ArrayList<Siswa> arraySiswa = new ArrayList<Siswa>();

        arraySiswa.add(new Siswa("Faisal", "IA03","Matematika",90));
        arraySiswa.add(new Siswa("Faisal1", "IA03","Matematika",10));
        arraySiswa.add(new Siswa("Faisal2", "IA03","Matematika",5));

        for(int i=0; i<arraySiswa.size(); i++){
            System.out.println("Nama"+arraySiswa.get(i).getNama());
            System.out.println("Kelas"+arraySiswa.get(i).getKelas());
            System.out.println("Pelajaran"+arraySiswa.get(i).getKelas());
            System.out.println("Nilai"+arraySiswa.get(i).getNilai());
        }
    }
}
